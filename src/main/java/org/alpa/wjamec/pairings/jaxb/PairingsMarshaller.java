package org.alpa.wjamec.pairings.jaxb;

import javax.xml.transform.Result;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.helpers.AbstractMarshallerImpl;

/**
 * A convenience class to simplify marshalling of Pairings.
 * 
 * @author Stephan Heinemann
 */
public class PairingsMarshaller extends AbstractMarshallerImpl {

    private Marshaller pairingsMarshaller;

    /**
     * Constructs a Pairings Marshaller.
     * 
     * @throws JAXBException
     *                           if the Pairings Marshaller cannot be constructed
     */
    public PairingsMarshaller() throws JAXBException {
        super();
        JAXBContext pairingsContext = JAXBContext.newInstance(org.alpa.wjamec.pairings.jaxb.ObjectFactory.class);
        pairingsMarshaller = pairingsContext.createMarshaller();
    }

    /**
     * @see javax.xml.bind.Marshaller#marshal(Object, Result)
     */
    @Override
    public void marshal(Object jaxbElement, Result result) throws JAXBException {
        pairingsMarshaller.marshal(jaxbElement, result);
    }

}
