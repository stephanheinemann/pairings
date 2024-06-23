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
// Generated on: 2024.06.22 at 10:28:07 AM PDT 
//


package org.alpa.wjamec.pairings.jaxb;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Aircraft.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="Aircraft"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Boeing 737-700 Winglets"/&gt;
 *     &lt;enumeration value="Boeing 737-800 Winglets"/&gt;
 *     &lt;enumeration value="Boeing 737-700"/&gt;
 *     &lt;enumeration value="Boeing 737 MAX8"/&gt;
 *     &lt;enumeration value="Boeing 737-800"/&gt;
 *     &lt;enumeration value="Boeing 737-800 Freighter"/&gt;
 *     &lt;enumeration value="Boeing 787-9"/&gt;
 *     &lt;enumeration value="Bombardier Q400"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Aircraft")
@XmlEnum
public enum Aircraft {

    @XmlEnumValue("Boeing 737-700 Winglets")
    BOEING_737_700_WINGLETS("Boeing 737-700 Winglets"),
    @XmlEnumValue("Boeing 737-800 Winglets")
    BOEING_737_800_WINGLETS("Boeing 737-800 Winglets"),
    @XmlEnumValue("Boeing 737-700")
    BOEING_737_700("Boeing 737-700"),
    @XmlEnumValue("Boeing 737 MAX8")
    BOEING_737_MAX_8("Boeing 737 MAX8"),
    @XmlEnumValue("Boeing 737-800")
    BOEING_737_800("Boeing 737-800"),
    @XmlEnumValue("Boeing 737-800 Freighter")
    BOEING_737_800_FREIGHTER("Boeing 737-800 Freighter"),
    @XmlEnumValue("Boeing 787-9")
    BOEING_787_9("Boeing 787-9"),
    @XmlEnumValue("Bombardier Q400")
    BOMBARDIER_Q_400("Bombardier Q400");
    private final String value;

    Aircraft(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Aircraft fromValue(String v) {
        for (Aircraft c: Aircraft.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
