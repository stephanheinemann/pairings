package org.alpa.wjamec.pairings.jaxb.tests;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

import org.alpa.wjamec.pairings.jaxb.PairingsMarshaller;
import org.alpa.wjamec.pairings.jaxb.PairingsUnmarshaller;
import org.junit.Test;

import jakarta.xml.bind.JAXBException;

public class RoundtripTest {

    private class XMLFilenameFilter implements FilenameFilter {

        public static final String XML_FILENAME_EXT = ".xml";

        @Override
        public boolean accept(File dir, String name) {
            return name.endsWith(XML_FILENAME_EXT);
        }

    }

    public static final String PAIRINGS_RESOURCES_DIR = "src/test/resources/xml";
    public static final String PAIRINGS_TARGET_DIR = "target/generated-test-sources/xml";

    @Test
    public void test() throws JAXBException, IOException {
        // create JAXB marshaller and unmarshaller
        PairingsMarshaller pairingsMarshaller = new PairingsMarshaller();
        PairingsUnmarshaller pairingsUnmarshaller = new PairingsUnmarshaller();

        // unmarshall and marshall test resources
        File pairingsResourcesDir = new File(PAIRINGS_RESOURCES_DIR);
        File[] pairingsFiles = pairingsResourcesDir.listFiles(new XMLFilenameFilter());
        File pairingsTargetDir = new File(PAIRINGS_TARGET_DIR);
        pairingsTargetDir.mkdirs();

        for (File pairingsFile : pairingsFiles) {
            // JAXBElement<?> pairingsElement = (JAXBElement<?>) pairingsUnmarshaller.unmarshal(pairingsFile);
            Object pairingsElement = pairingsUnmarshaller.unmarshal(pairingsFile);
            File marshalledPairingsFile = new File(PAIRINGS_TARGET_DIR, pairingsFile.getName());
            marshalledPairingsFile.createNewFile();
            pairingsMarshaller.marshal(pairingsElement, marshalledPairingsFile);
        }

        // all test resources could be unmarshalled and marshalled
        assertTrue(true);
    }

}
