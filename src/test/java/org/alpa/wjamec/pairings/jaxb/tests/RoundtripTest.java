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
package org.alpa.wjamec.pairings.jaxb.tests;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;

import org.alpa.wjamec.pairings.jaxb.PairingsMarshaller;
import org.alpa.wjamec.pairings.jaxb.PairingsUnmarshaller;
import org.alpa.wjamec.pairings.util.XmlFilenameFilter;
import org.junit.Test;

import com.sun.istack.logging.Logger;

import jakarta.xml.bind.JAXBException;

/**
 * Performs a round-trip test that marshals source XML pairing files into identical target XML pairing files.
 * 
 * @author Stephan Heinemann
 */
public class RoundtripTest {

    /** the source XML pairings resources directory */
    public static final String PAIRINGS_RESOURCES_DIR = "src/test/resources/xmlpairings";

    /** the target XML pairings directory */
    public static final String PAIRINGS_TARGET_DIR = "target/generated-test-sources/xml";

    /**
     * Tests whether or not XML pairing files can be marshaled and unmarshaled.
     * 
     * @throws IOException
     *                           if an input/output issue occurs
     * @throws JAXBException
     *                           if an XML binding issue occurs
     */
    @Test
    public void test() throws IOException, JAXBException {
        // create JAXB marshaller and unmarshaller
        PairingsMarshaller pairingsMarshaller = new PairingsMarshaller();
        PairingsUnmarshaller pairingsUnmarshaller = new PairingsUnmarshaller();

        // unmarshall and marshall test resources
        File pairingsResourcesDir = new File(PAIRINGS_RESOURCES_DIR);
        File[] pairingsFiles = pairingsResourcesDir.listFiles(new XmlFilenameFilter());
        File pairingsTargetDir = new File(PAIRINGS_TARGET_DIR);
        pairingsTargetDir.mkdirs();

        for (File pairingsFile : pairingsFiles) {
            Logger.getLogger(getClass()).log(Level.INFO,
                    String.format("performing roundtrip for %s ...", pairingsFile.getName()));

            Object pairingsElement = pairingsUnmarshaller.unmarshal(pairingsFile);
            File marshalledPairingsFile = new File(PAIRINGS_TARGET_DIR, pairingsFile.getName());
            marshalledPairingsFile.createNewFile();
            pairingsMarshaller.marshal(pairingsElement, marshalledPairingsFile);
        }

        // all test resources could be unmarshalled and marshalled
        assertTrue(true);
    }

}
