package org.alpa.wjamec.pairings.jaxb;

import javax.xml.transform.sax.SAXSource;

import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import jakarta.xml.bind.UnmarshallerHandler;
import jakarta.xml.bind.helpers.AbstractUnmarshallerImpl;

/**
 * A convenience class to simplify unmarshalling of Pairings.
 * 
 * @author Stephan Heinemann
 */
public class PairingsUnmarshaller extends AbstractUnmarshallerImpl {

    Unmarshaller pairingsUnmarshaller;

    /**
     * Constructs a Pairings Unmarshaller.
     * 
     * @throws JAXBException
     *                           if the Pairings Unmarshaller cannot be constructed
     */
    public PairingsUnmarshaller() throws JAXBException {
        super();
        JAXBContext pairingsContext = JAXBContext.newInstance(org.alpa.wjamec.pairings.jaxb.ObjectFactory.class);
        pairingsUnmarshaller = pairingsContext.createUnmarshaller();
    }

    /**
     * @see javax.xml.bind.Unmarshaller#unmarshal(Node)
     */
    @Override
    public Object unmarshal(Node node) throws JAXBException {
        return pairingsUnmarshaller.unmarshal(node);
    }

    /**
     * @see javax.xml.bind.Unmarshaller#getUnmarshallerHandler()
     */
    @Override
    public UnmarshallerHandler getUnmarshallerHandler() {
        return pairingsUnmarshaller.getUnmarshallerHandler();
    }

    /**
     * @see javax.xml.bind.helpers.AbstractUnmarshallerImpl#unmarshal(XMLReader, InputSource)
     */
    @Override
    protected Object unmarshal(XMLReader reader, InputSource source) throws JAXBException {
        SAXSource saxSource = new SAXSource(reader, source);
        return pairingsUnmarshaller.unmarshal(saxSource);
    }

}
