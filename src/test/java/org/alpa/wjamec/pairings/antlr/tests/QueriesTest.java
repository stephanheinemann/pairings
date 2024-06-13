package org.alpa.wjamec.pairings.antlr.tests;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;
import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;
import java.util.stream.Collectors;

import org.alpa.wjamec.pairings.antlr.PairingsLexer;
import org.alpa.wjamec.pairings.antlr.PairingsParser;
import org.alpa.wjamec.pairings.antlr.PairingsToXMLVisitor;
import org.alpa.wjamec.pairings.jaxb.Base;
import org.alpa.wjamec.pairings.jaxb.Pairing;
import org.alpa.wjamec.pairings.jaxb.Pairings;
import org.alpa.wjamec.pairings.jaxb.PairingsMarshaller;
import org.alpa.wjamec.pairings.jaxb.PreliminaryPairing;
import org.alpa.wjamec.pairings.util.PairingsQueries;
import org.alpa.wjamec.pairings.util.TxtFilenameFilter;
import org.alpa.wjamec.pairings.util.XmlFilenameFilter;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;

import com.sun.istack.logging.Logger;

import jakarta.xml.bind.JAXBException;

/**
 * Performs a queries test that transforms and queries source text pairing files into resulting target XML pairing
 * files.
 * 
 * @author Stephan Heinemann
 */
public class QueriesTest {

    /** the source text pairing resources directory */
    public static final String PAIRINGS_RESOURCES_DIR = "src/test/resources/txtpairings";

    /** the target XML pairing resources directory */
    public static final String PAIRINGS_TARGET_DIR = "src/test/resources/xmlpairings";

    /** an example text pairings file */
    public static final String PAIRINGS_PRELIMINARY_MARCH_2023 = "737 PILOT PRELIM PAIRINGS MARCH 2023.txt";

    /** an example text pairings file */
    public static final String PAIRINGS_PRELIMINARY_NOVEMBER_2023 = "737 PILOT PRELIM PAIRINGS NOVEMBER 2023.txt";

    /** an example text pairings file */
    public static final String PAIRINGS_FINAL_APRIL_2024 = "737 PILOT FINAL PAIRINGS APRIL 2024.txt";

    /** an example text pairings file */
    public static final String PAIRINGS_PRELIMINARY_MAY_2024 = "737 PILOT PRELIM PAIRINGS MAY 2024.txt";

    /** an example text pairings file */
    public static final String PAIRINGS_FINAL_JUNE_2024 = "737 PILOT FINAL PAIRINGS JUNE 2024.txt";

    /** an example text pairings file */
    public static final String PAIRINGS_PRELIMINARY_JULY_2024 = "737 PILOT PRELIM PAIRINGS JULY 2024.txt";

    /** an example text pairings file */
    public static final String PAIRINGS_FINAL_JULY_2024 = "737 PILOT FINAL PAIRINGS JULY 2024.txt";

    /**
     * Tests whether or not text pairing files can be transformed and queried.
     * 
     * @throws IOException
     *                           if an input/output issue occurs
     * @throws JAXBException
     *                           if an XML binding issue occurs
     */
    @Test
    public void test() throws IOException, JAXBException {
        // reading
        File txtPairingsFile = new File(PAIRINGS_RESOURCES_DIR, PAIRINGS_PRELIMINARY_JULY_2024);
        String lexicalPairings = new String(Files.readAllBytes(txtPairingsFile.toPath()));

        // lexing
        PairingsLexer lexer = new PairingsLexer(CharStreams.fromString(lexicalPairings));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();

        // parsing
        PairingsParser parser = new PairingsParser(tokens);
        parser.setBuildParseTree(true);

        // transforming
        PairingsToXMLVisitor visitor = new PairingsToXMLVisitor();
        Object xmlPairings = visitor.visitPairingsDocument(parser.pairingsDocument());
        Pairings pairings = (Pairings) xmlPairings;

        // filtering
        Logger.getLogger(getClass()).log(Level.INFO, String.format("filtering %s ...", txtPairingsFile.getName()));
        List<PreliminaryPairing> preliminaries = pairings.getPreliminaryPairing();
        preliminaries.addAll(pairings.getPairing());

        List<PreliminaryPairing> filtered = preliminaries.stream().filter(PairingsQueries.startsAtBase(Base.VANCOUVER))
                .filter(PairingsQueries.isOutsideDates(LocalDate.of(2024, 7, 6), LocalDate.of(2024, 7, 21)))
                .filter(PairingsQueries.isAboveCreditRatio(Duration.ofHours(6)))
                .filter(PairingsQueries.excludesIdleDutyDays()).filter(PairingsQueries.excludesRedEyes())
                .collect(Collectors.toList());
        PairingsQueries.sortBy(filtered, PairingsQueries.creditRatioThenPerDiemComparing());

        List<Pairing> filteredFinals = filtered.stream().filter(Pairing.class::isInstance).map(p -> (Pairing) p)
                .collect(Collectors.toList());
        filtered.removeAll(filteredFinals);

        pairings.getPreliminaryPairing().clear();
        pairings.getPreliminaryPairing().addAll(filtered);

        pairings.getPairing().clear();
        pairings.getPairing().addAll(filteredFinals);

        // marshaling
        PairingsMarshaller marshaller = new PairingsMarshaller();
        String xmlPairingsFilename = PAIRINGS_PRELIMINARY_JULY_2024.replaceFirst(TxtFilenameFilter.getExtension(),
                "-filtered" + XmlFilenameFilter.getExtension());
        File pairingsFile = new File(PAIRINGS_TARGET_DIR, xmlPairingsFilename);
        pairingsFile.createNewFile();
        marshaller.marshal(xmlPairings, pairingsFile);

        assertTrue(true);
    }

}