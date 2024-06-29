/*
 * Copyright © 2024, Stephan Heinemann
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of the <organization> nor the
 *       names of its contributors may be used to endorse or promote products
 *       derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.alpa.wjamec.pairings.cli;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;
import java.util.function.Predicate;

import org.alpa.wjamec.pairings.exceptions.PairingsException;
import org.alpa.wjamec.pairings.jaxb.Base;
import org.alpa.wjamec.pairings.jaxb.Pairings;
import org.alpa.wjamec.pairings.jaxb.PairingsMarshaller;
import org.alpa.wjamec.pairings.jaxb.PairingsTransformers;
import org.alpa.wjamec.pairings.jaxb.PairingsUnmarshaller;
import org.alpa.wjamec.pairings.jaxb.PreliminaryPairing;
import org.alpa.wjamec.pairings.util.PairingsFiles;
import org.alpa.wjamec.pairings.util.PairingsQueries;
import org.alpa.wjamec.pairings.util.TextFilenameFilter;
import org.alpa.wjamec.pairings.util.XmlFilenameFilter;

import com.github.rvesse.airline.HelpOption;
import com.github.rvesse.airline.annotations.AirlineModule;
import com.github.rvesse.airline.annotations.Command;
import com.github.rvesse.airline.annotations.Option;
import com.github.rvesse.airline.annotations.restrictions.AllowedEnumValues;
import com.github.rvesse.airline.annotations.restrictions.EndsWith;
import com.github.rvesse.airline.annotations.restrictions.File;
import com.github.rvesse.airline.annotations.restrictions.MutuallyExclusiveWith;
import com.github.rvesse.airline.annotations.restrictions.NoOptionLikeValues;
import com.github.rvesse.airline.annotations.restrictions.Once;
import com.github.rvesse.airline.annotations.restrictions.ranges.FloatRange;
import com.github.rvesse.airline.annotations.restrictions.ranges.ShortRange;

import jakarta.xml.bind.JAXBException;

/**
 * Realizes a pairings command line interface filter command.
 * 
 * @author Stephan Heinemann
 * 
 */
@Command(name = "filter", description = "Filter a pairings file and transform it into a corresponding XML representation")
public class FilterCommand implements Runnable {

    /** contains the help of this filter command */
    @AirlineModule
    private HelpOption<FilterCommand> help;

    /** determines whether or not the filtered pairings are abbreviated */
    @Option(name = { "-a", "--abbreviate" }, description = "Abbreviate the filtered pairings")
    @Once
    private boolean abbreviate = false;

    /** specifies the parings file to be filtered */
    @Option(arity = 1, name = { "-i",
            "--input" }, title = "PairingsFile", description = "The name of the pairings file to be filtered")
    @File(mustExist = true, readable = true, writable = false)
    @EndsWith(suffixes = { TextFilenameFilter.TEXT_FILENAME_EXT, XmlFilenameFilter.XML_FILENAME_EXT })
    @NoOptionLikeValues
    @Once
    private String input;

    /** specifies the filtered pairings file */
    @Option(arity = 1, name = { "-o",
            "--output" }, title = "PairingsFile", description = "The name of the resulting filtered pairings file")
    @File(mustExist = false, readable = false, writable = true)
    @EndsWith(suffixes = XmlFilenameFilter.XML_FILENAME_EXT)
    @NoOptionLikeValues
    @Once
    private String output;

    /** specifies the base filter */
    @Option(arity = 1, name = { "-b",
            "--base" }, title = "Base", description = "Filter all pairings with the specified base location")
    @AllowedEnumValues(value = Base.class)
    @NoOptionLikeValues
    @Once
    private String base;

    /** specifies the within days of the month range filter */
    @Option(arity = 2, name = { "-w", "--within" }, title = { "StartDay",
            "EndDay" }, description = "Filter all pairings completely within the range and including the specified days of the month")
    @MutuallyExclusiveWith(tag = "days")
    @ShortRange(min = 1, max = 31)
    private List<Short> within;

    /** specifies the outside days of the month range filter */
    @Option(arity = 2, name = { "-x", "--outside" }, title = { "StartDay",
            "EndDay" }, description = "Filter all pairings completely outside the range and excluding the specified days of the month")
    @MutuallyExclusiveWith(tag = "days")
    @ShortRange(min = 1, max = 31)
    private List<Short> outside;

    /** specifies the minimum credit ratio filter */
    @Option(arity = 1, name = { "-mcr",
            "--minCreditRatio" }, title = "CreditRatio", description = "Filter all pairings having at least the specified minimum credit ratio")
    @Once
    @FloatRange(min = 0, max = 24)
    private Float minCreditRatio;

    /** activates the no idle duty days filter */
    @Option(name = { "-ni", "--noIdle" }, description = "Filter all pairings having no idle duty days")
    @Once
    private boolean noIdleDuty = false;

    /** activates the no red eye legs filter */
    @Option(name = { "-nr", "--noRedEye" }, description = "Filter all pairings having no red eye legs")
    @Once
    private boolean noRedEyes = false;

    /**
     * Reads the input pairings file or stream of this filter command.
     * 
     * @return the pairings of the input pairings file or stream
     * @throws PairingsException
     *                               if the input pairings file could not be read
     * @throws JAXBException
     *                               if the input pairings stream could not be unmarshalled
     */
    private Pairings readInputPairings() throws PairingsException, JAXBException {
        Pairings pairings = null;

        if (null != this.input) {
            // read pairings from input file
            if (this.input.endsWith(TextFilenameFilter.getExtension())) {
                pairings = PairingsFiles.readTextPairings(this.input);
            } else if (this.input.endsWith(XmlFilenameFilter.getExtension())) {
                pairings = PairingsFiles.readXmlPairings(this.input);
            }
        } else {
            // read XML pairings from standard in
            PairingsUnmarshaller pairingsUnmarshaller = new PairingsUnmarshaller();
            pairings = (Pairings) pairingsUnmarshaller.unmarshal(System.in);
        }

        return pairings;
    }

    /**
     * Writes the output pairings file of this filter command.
     * 
     * @param pairings
     *                     the pairings to be written to the output pairings file
     * @throws PairingsException
     *                               if the pairings file could not be written
     * @throws JAXBException
     *                               if the pairings could not be marshalled
     */
    private void writeOutputPairings(Pairings pairings) throws PairingsException, JAXBException {
        if (null != pairings) {
            if (null != this.output) {
                // write transformed pairings to output file
                if (this.abbreviate) {
                    PairingsFiles.writeXmlPairings(this.output, PairingsTransformers.toAbbreviated(pairings));
                } else {
                    PairingsFiles.writeXmlPairings(this.output, pairings);
                }
            } else {
                // write transformed pairings to standard out
                PairingsMarshaller pairingsMarshaller = new PairingsMarshaller();
                if (this.abbreviate) {
                    pairingsMarshaller.marshal(PairingsTransformers.toAbbreviated(pairings), System.out);
                } else {
                    pairingsMarshaller.marshal(pairings, System.out);
                }
            }
        }
    }

    /**
     * Applies the filters of this filter command to pairings.
     * 
     * @param pairings
     *                     the pairings to be filtered
     * @throws PairingsException
     *                               if the pairings could not be filtered
     */
    private void applyFilters(Pairings pairings) throws PairingsException {
        Predicate<PreliminaryPairing> filter = (pairing -> true);

        if (null != pairings) {
            // combine and apply filters
            filter = filter.and(this.getBaseFilter()).and(this.getWithinFilter(pairings))
                    .and(this.getOutsideFilter(pairings)).and(this.getMinCreditRatioFilter())
                    .and(this.getNoIdleDutyFilter()).and(this.getNoRedEyesFilter());
            // ...

            if (!pairings.getPreliminaryPairing().isEmpty()) {
                pairings.getPreliminaryPairing().removeIf(filter.negate());
                // pairings.getPreliminaryPairing().retainAll(pairings.getPreliminaryPairing().stream().filter(filter).toList());
            } else if (!pairings.getPairing().isEmpty()) {
                pairings.getPairing().removeIf(filter.negate());
                // pairings.getPairing().retainAll(pairings.getPairing().stream().filter(filter).toList());
            } else {
                throw new PairingsException("unsupported pairings format for filtering");
            }
        }
    }

    /**
     * Gets the base filter of this filter command.
     * 
     * @return the base filter of this filter command
     */
    private Predicate<PreliminaryPairing> getBaseFilter() {
        Predicate<PreliminaryPairing> baseFilter = (pairing -> true);

        if (null != this.base) {
            baseFilter = PairingsQueries.startsAtBase(Base.valueOf(this.base));
        }

        return baseFilter;
    }

    /**
     * Gets the within days of the month filter of this filter command.
     * 
     * @param pairings
     *                     the pairings to be filtered
     * @return the within days of the month filter of this filter command
     * @throws PairingsException
     *                               if the within days range is invalid
     */
    private Predicate<PreliminaryPairing> getWithinFilter(Pairings pairings) throws PairingsException {
        Predicate<PreliminaryPairing> withinFilter = (pairing -> true);

        if ((null != this.within) && (2 == this.within.size())) {
            try {
                LocalDate start = PairingsQueries.getLocalDate(pairings, this.within.get(0));
                LocalDate end = PairingsQueries.getLocalDate(pairings, this.within.get(1));
                if (!start.isAfter(end)) {
                    System.out.println(String.format("start: %s, end: %s", start.toString(), end.toString()));
                    withinFilter.and(PairingsQueries.isWithinDates(start, end));
                } else {
                    throw new PairingsException("start is after end");
                }
            } catch (Exception e) {
                throw new PairingsException("invalid within days of month range", e);
            }
        }

        return withinFilter;
    }

    /**
     * Gets the outside days of the month filter of this filter command.
     * 
     * @param pairings
     *                     the pairings to be filtered
     * @return the outside days of the month filter of this filter command
     * @throws PairingsException
     *                               if the outside days range is invalid
     */
    private Predicate<PreliminaryPairing> getOutsideFilter(Pairings pairings) throws PairingsException {
        Predicate<PreliminaryPairing> outsideFilter = (pairing -> true);

        if ((null != this.outside) && (2 == this.outside.size())) {
            try {
                LocalDate start = PairingsQueries.getLocalDate(pairings, this.outside.get(0));
                LocalDate end = PairingsQueries.getLocalDate(pairings, this.outside.get(1));
                if (!start.isAfter(end)) {
                    System.out.println(String.format("start: %s, end: %s", start.toString(), end.toString()));
                    outsideFilter.and(PairingsQueries.isOutsideDates(start, end));
                } else {
                    throw new PairingsException("start is after end");
                }
            } catch (Exception e) {
                throw new PairingsException("invalid outside days of month range", e);
            }
        }

        return outsideFilter;
    }

    /**
     * Gets the minimum credit ratio filter of this filter command.
     * 
     * @return the minimum credit ratio filter of this filter command
     */
    private Predicate<PreliminaryPairing> getMinCreditRatioFilter() {
        Predicate<PreliminaryPairing> minCreditRatioFilter = (pairing -> true);

        if (null != this.minCreditRatio) {
            short hours = (short) Math.floor(this.minCreditRatio);
            short minutes = (short) Math.floor((this.minCreditRatio - hours) * 60f);

            Duration creditRatio = Duration.ofHours(hours).plusMinutes(minutes);
            minCreditRatioFilter = PairingsQueries.isAboveCreditRatio(creditRatio);
        }

        return minCreditRatioFilter;
    }

    /**
     * Gets the no idle duty days filter of this filter command.
     * 
     * @return the no idle duty days filter of this filter command
     */
    private Predicate<PreliminaryPairing> getNoIdleDutyFilter() {
        Predicate<PreliminaryPairing> noIdleDutyFilter = (pairing -> true);

        if (this.noIdleDuty) {
            noIdleDutyFilter = PairingsQueries.excludesIdleDutyDays();
        }

        return noIdleDutyFilter;
    }

    /**
     * Gets the no red eyes filter of this filter command.
     * 
     * @return the no red eyes filter of this filter command
     */
    private Predicate<PreliminaryPairing> getNoRedEyesFilter() {
        Predicate<PreliminaryPairing> noRedEyesFilter = (pairing -> true);

        if (this.noRedEyes) {
            noRedEyesFilter = PairingsQueries.excludesRedEyes();
        }

        return noRedEyesFilter;
    }

    /**
     * Runs this filter command.
     */
    @Override
    public void run() {
        if (!this.help.showHelpIfRequested()) {
            try {
                Pairings pairings = this.readInputPairings();
                this.applyFilters(pairings);
                this.writeOutputPairings(pairings);
            } catch (PairingsException | JAXBException e) {
                System.err.println(
                        String.format("Error: Unable to filter pairings file %s (%s)", this.input, e.getMessage()));
                System.exit(1);
            }
        }
    }

}
