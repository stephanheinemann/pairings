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

import org.alpa.wjamec.pairings.exceptions.PairingsException;
import org.alpa.wjamec.pairings.jaxb.Pairings;
import org.alpa.wjamec.pairings.jaxb.PairingsMarshaller;
import org.alpa.wjamec.pairings.jaxb.PairingsTransformers;
import org.alpa.wjamec.pairings.util.PairingsFiles;
import org.alpa.wjamec.pairings.util.TextFilenameFilter;
import org.alpa.wjamec.pairings.util.XmlFilenameFilter;

import com.github.rvesse.airline.HelpOption;
import com.github.rvesse.airline.annotations.AirlineModule;
import com.github.rvesse.airline.annotations.Command;
import com.github.rvesse.airline.annotations.Option;
import com.github.rvesse.airline.annotations.restrictions.EndsWith;
import com.github.rvesse.airline.annotations.restrictions.File;
import com.github.rvesse.airline.annotations.restrictions.NoOptionLikeValues;
import com.github.rvesse.airline.annotations.restrictions.Once;
import com.github.rvesse.airline.annotations.restrictions.Required;

import jakarta.xml.bind.JAXBException;

/**
 * Realizes a pairings command line interface transform command.
 * 
 * @author Stephan Heinemann
 * 
 */
@Command(name = "transform", description = "Transform a pairings file into an XML representation")
public class TransformCommand implements Runnable {

    /** contains the help of the pairings command line interface */
    @AirlineModule
    private HelpOption<TransformCommand> help;

    /** determines whether or not the transformed pairings are abbreviated */
    @Option(name = { "-a", "--abbreviate" }, description = "Abbreviate the transformed pairings")
    private boolean abbreviate = false;

    /** specifies the parings file to be transformed */
    @Option(arity = 1, description = "The name of the pairings file to be transformed", name = { "-i", "--input" })
    @File(mustExist = true, readable = true, writable = false)
    @EndsWith(suffixes = { TextFilenameFilter.TEXT_FILENAME_EXT, XmlFilenameFilter.XML_FILENAME_EXT })
    @Once
    @Required
    @NoOptionLikeValues
    private String input;

    /** specifies the transformed pairings file */
    @Option(arity = 1, description = "The name of the resulting transformed pairings file", name = { "-o", "--output" })
    @File(mustExist = false, readable = false, writable = true)
    @EndsWith(suffixes = XmlFilenameFilter.XML_FILENAME_EXT)
    @Once
    @NoOptionLikeValues
    private String output;

    /**
     * Runs this transform command.
     */
    @Override
    public void run() {
        if (!help.showHelpIfRequested()) {
            try {
                Pairings pairings = null;

                if (this.input.endsWith(TextFilenameFilter.getExtension())) {
                    pairings = PairingsFiles.readTextPairings(this.input);
                } else if (this.input.endsWith(XmlFilenameFilter.getExtension())) {
                    pairings = PairingsFiles.readXmlPairings(this.input);
                }

                if (null != pairings) {
                    if (null != output) {
                        // write transformed pairings to output file
                        if (abbreviate) {
                            PairingsFiles.writeXmlPairings(this.output, PairingsTransformers.toAbbreviated(pairings));
                        } else {
                            PairingsFiles.writeXmlPairings(this.output, pairings);
                        }
                    } else {
                        // write transformed pairings to standard out
                        PairingsMarshaller pairingsMarshaller = new PairingsMarshaller();
                        if (abbreviate) {
                            pairingsMarshaller.marshal(PairingsTransformers.toAbbreviated(pairings), System.out);
                        } else {
                            pairingsMarshaller.marshal(pairings, System.out);
                        }
                    }
                }
            } catch (PairingsException | JAXBException e) {
                System.err.println(String.format("Error: Unable to transform pairings file %s", this.input));
                System.exit(1);
            }
        }
    }

}
