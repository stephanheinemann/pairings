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
//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.06.26 at 08:24:31 AM PDT 
//


package org.alpa.wjamec.pairings.jaxb;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.alpa.wjamec.pairings.jaxb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.alpa.wjamec.pairings.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Pairings }
     * 
     */
    public Pairings createPairings() {
        return new Pairings();
    }

    /**
     * Create an instance of {@link Pairing }
     * 
     */
    public Pairing createPairing() {
        return new Pairing();
    }

    /**
     * Create an instance of {@link PreliminaryPairing }
     * 
     */
    public PreliminaryPairing createPreliminaryPairing() {
        return new PreliminaryPairing();
    }

    /**
     * Create an instance of {@link AbbreviatedPairing }
     * 
     */
    public AbbreviatedPairing createAbbreviatedPairing() {
        return new AbbreviatedPairing();
    }

    /**
     * Create an instance of {@link Crew }
     * 
     */
    public Crew createCrew() {
        return new Crew();
    }

    /**
     * Create an instance of {@link InitialDutyDays }
     * 
     */
    public InitialDutyDays createInitialDutyDays() {
        return new InitialDutyDays();
    }

    /**
     * Create an instance of {@link InitialDutyDay }
     * 
     */
    public InitialDutyDay createInitialDutyDay() {
        return new InitialDutyDay();
    }

    /**
     * Create an instance of {@link DutyDays }
     * 
     */
    public DutyDays createDutyDays() {
        return new DutyDays();
    }

    /**
     * Create an instance of {@link DutyDay }
     * 
     */
    public DutyDay createDutyDay() {
        return new DutyDay();
    }

    /**
     * Create an instance of {@link GroundLeg }
     * 
     */
    public GroundLeg createGroundLeg() {
        return new GroundLeg();
    }

    /**
     * Create an instance of {@link FlightLeg }
     * 
     */
    public FlightLeg createFlightLeg() {
        return new FlightLeg();
    }

    /**
     * Create an instance of {@link Checkin }
     * 
     */
    public Checkin createCheckin() {
        return new Checkin();
    }

    /**
     * Create an instance of {@link Checkout }
     * 
     */
    public Checkout createCheckout() {
        return new Checkout();
    }

    /**
     * Create an instance of {@link Layover }
     * 
     */
    public Layover createLayover() {
        return new Layover();
    }

    /**
     * Create an instance of {@link Accommodation }
     * 
     */
    public Accommodation createAccommodation() {
        return new Accommodation();
    }

    /**
     * Create an instance of {@link Transportation }
     * 
     */
    public Transportation createTransportation() {
        return new Transportation();
    }

}
