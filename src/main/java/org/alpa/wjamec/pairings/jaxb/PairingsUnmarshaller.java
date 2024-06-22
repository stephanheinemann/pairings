/*
 * Copyright © 2024, Stephan Heinemann
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
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
