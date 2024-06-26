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
package org.alpa.wjamec.pairings.util;

import java.io.File;
import java.nio.file.Files;

import org.alpa.wjamec.pairings.antlr.PairingsLexer;
import org.alpa.wjamec.pairings.antlr.PairingsParser;
import org.alpa.wjamec.pairings.antlr.PairingsToXmlVisitor;
import org.alpa.wjamec.pairings.exceptions.PairingsException;
import org.alpa.wjamec.pairings.jaxb.Pairings;
import org.alpa.wjamec.pairings.jaxb.PairingsMarshaller;
import org.alpa.wjamec.pairings.jaxb.PairingsUnmarshaller;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ConsoleErrorListener;

/**
 * Provides file operations for pairings.
 * 
 * @author Stephan Heinemann
 */
public class PairingsFiles {

    /**
     * Hides the default constructor.
     */
    private PairingsFiles() {
    }

    /**
     * Reads a text pairings file.
     * 
     * @param filename
     *                     the filename of the text pairings file
     * @return the pairings contained in the text pairings file
     * @throws PairingsException
     *                               if the text pairings could not be read
     */
    public static Pairings readTextPairings(String filename) throws PairingsException {
        Pairings pairings = null;

        try {
            // reading
            File txtPairingsFile = new File(filename);
            String lexicalPairings = new String(Files.readAllBytes(txtPairingsFile.toPath()));

            // lexing
            PairingsLexer lexer = new PairingsLexer(CharStreams.fromString(lexicalPairings));
            lexer.removeErrorListener(ConsoleErrorListener.INSTANCE);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            tokens.fill();

            // parsing
            PairingsParser parser = new PairingsParser(tokens);
            parser.removeErrorListener(ConsoleErrorListener.INSTANCE);
            parser.setBuildParseTree(true);

            // transforming
            PairingsToXmlVisitor visitor = new PairingsToXmlVisitor();
            pairings = visitor.visitPairingsDocument(parser.pairingsDocument());
        } catch (Exception cause) {
            throw new PairingsException(cause);
        }

        return pairings;
    }

    /**
     * Reads an XML pairings file.
     * 
     * @param filename
     *                     the filename of the XML pairings file
     * @return the pairings contained in the XML pairings file
     * @throws PairingsException
     *                               if the XML pairings file could not be read
     */
    public static Pairings readXmlPairings(String filename) throws PairingsException {
        Pairings pairings = null;

        try {
            // unmarshalling
            PairingsUnmarshaller pairingsUnmarshaller = new PairingsUnmarshaller();
            File xmlPairingsFile = new File(filename);
            pairings = (Pairings) pairingsUnmarshaller.unmarshal(xmlPairingsFile);
        } catch (Exception cause) {
            throw new PairingsException(cause);
        }

        return pairings;
    }

    /**
     * Writes an XML pairings file.
     * 
     * @param filename
     *                     the filename of the XML pairings file
     * @param pairings
     *                     the pairings to be written to the XML pairings file
     * @throws PairingsException
     *                               if the XML pairings file could not be written
     */
    public static void writeXmlPairings(String filename, Pairings pairings) throws PairingsException {
        try {
            // marshalling
            PairingsMarshaller pairingsMarshaller = new PairingsMarshaller();
            File xmlPairingsFile = new File(filename);
            xmlPairingsFile.createNewFile();
            pairingsMarshaller.marshal(pairings, xmlPairingsFile);
        } catch (Exception cause) {
            throw new PairingsException(cause);
        }
    }

}
