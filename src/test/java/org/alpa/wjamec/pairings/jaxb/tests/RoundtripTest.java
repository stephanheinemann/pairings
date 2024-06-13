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
