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

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

import org.alpa.wjamec.pairings.exceptions.PairingsException;
import org.alpa.wjamec.pairings.jaxb.Pairings;
import org.alpa.wjamec.pairings.jaxb.PreliminaryPairing;
import org.alpa.wjamec.pairings.util.PairingsQueries;

import com.github.rvesse.airline.HelpOption;
import com.github.rvesse.airline.annotations.AirlineModule;
import com.github.rvesse.airline.annotations.Command;
import com.github.rvesse.airline.annotations.Option;
import com.github.rvesse.airline.annotations.restrictions.Once;
import com.github.rvesse.airline.annotations.restrictions.ranges.ShortRange;

import jakarta.xml.bind.JAXBException;

/**
 * Realizes a pairings command line interface sort command.
 * 
 * @author Stephan Heinemann
 * 
 */
@Command(name = "sort", description = "Sort a pairings file and transform it into a corresponding XML representation")
public class SortCommand extends TransformCommand implements Runnable {

    /** contains the help of this sort command */
    @AirlineModule
    private HelpOption<SortCommand> help;

    /** specifies the credit comparing sort order */
    @Option(arity = 1, name = { "-c",
            "--credit" }, title = "SortOrder", description = "Sort by comparing pairing credit with the specified sort order")
    @Once
    @ShortRange(min = 1, max = 10)
    private Short creditComparing;

    /** specifies the credit ratio comparing sort order */
    @Option(arity = 1, name = { "-cr",
            "--creditRatio" }, title = "SortOrder", description = "Sort by comparing pairing credit ratio with the specified sort order")
    @Once
    @ShortRange(min = 1, max = 10)
    private Short creditRatioCopmaring;

    /** specifies the duty days comparing sort order */
    @Option(arity = 1, name = { "-dd",
            "--dutyDays" }, title = "SortOrder", description = "Sort by comparing pairing duty days with the specified sort order")
    @Once
    @ShortRange(min = 1, max = 10)
    private Short dutyDaysComparing;

    /** specifies the per diem comparing sort order */
    @Option(arity = 1, name = { "-pd",
            "--perDiem" }, title = "SortOrder", description = "Sort by comparing pairing per diem with the specified sort order")
    @Once
    @ShortRange(min = 1, max = 10)
    private Short perDiemComparing;

    /**
     * Gets the pairing comparator of this sort command.
     * 
     * @return the pairing comparator of this sort command
     */
    private Comparator<PreliminaryPairing> getPairingComparator() {
        Comparator<PreliminaryPairing> pairingComparator = null;
        SortedMap<Short, Comparator<PreliminaryPairing>> sortOrder = new TreeMap<>();

        if (null != this.creditComparing) {
            sortOrder.put(this.creditComparing, PairingsQueries.creditComparing());
        }
        if (null != this.creditRatioCopmaring) {
            sortOrder.put(this.creditRatioCopmaring, PairingsQueries.creditRatioComparing());
        }
        if (null != this.dutyDaysComparing) {
            sortOrder.put(this.dutyDaysComparing, PairingsQueries.dutyDaysComparing());
        }
        if (null != this.perDiemComparing) {
            sortOrder.put(this.perDiemComparing, PairingsQueries.perDiemComparing());
        }

        for (Comparator<PreliminaryPairing> comparator : sortOrder.values()) {
            if (null == pairingComparator) {
                pairingComparator = comparator;
            } else {
                pairingComparator = pairingComparator.thenComparing(comparator);
            }
        }

        return pairingComparator;
    }

    /**
     * Applies the sort order of this sort command to pairings.
     * 
     * @param pairings
     *                     the pairings to be sorted
     * @throws PairingsException
     *                               if the pairings could not be sorted
     */
    private void applySortOrder(Pairings pairings) throws PairingsException {
        Comparator<PreliminaryPairing> pairingComparator = this.getPairingComparator();

        if (null != pairingComparator) {
            if (!pairings.getPreliminaryPairing().isEmpty()) {
                pairings.getPreliminaryPairing().sort(pairingComparator);
            } else if (!pairings.getPairing().isEmpty()) {
                pairings.getPairing().sort(pairingComparator);
            } else {
                throw new PairingsException("unsupported pairings format for sorting");
            }
        }
    }

    /**
     * Runs this sort command.
     */
    @Override
    public void run() {
        if (!this.help.showHelpIfRequested()) {
            try {
                Pairings pairings = this.readInputPairings();
                this.applySortOrder(pairings);
                this.writeOutputPairings(pairings);
            } catch (PairingsException | JAXBException e) {
                System.err.println(String.format("Error: Unable to sort pairings (%s)", e.getMessage()));
                System.exit(1);
            }
        }
    }

}
