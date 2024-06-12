//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.05.24 at 05:39:53 PM PDT 
//


package org.alpa.wjamec.pairings.jaxb;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Airline.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="Airline"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="American Airlines"/&gt;
 *     &lt;enumeration value="Air Canada"/&gt;
 *     &lt;enumeration value="Aeromexico"/&gt;
 *     &lt;enumeration value="Delta Airlines"/&gt;
 *     &lt;enumeration value="Aer Lingus"/&gt;
 *     &lt;enumeration value="Icelandair"/&gt;
 *     &lt;enumeration value="Hawaiian Airlines"/&gt;
 *     &lt;enumeration value="United Airlines"/&gt;
 *     &lt;enumeration value="WestJet Airlines"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Airline")
@XmlEnum
public enum Airline {

    @XmlEnumValue("American Airlines")
    AMERICAN_AIRLINES("American Airlines"),
    @XmlEnumValue("Air Canada")
    AIR_CANADA("Air Canada"),
    @XmlEnumValue("Aeromexico")
    AEROMEXICO("Aeromexico"),
    @XmlEnumValue("Delta Airlines")
    DELTA_AIRLINES("Delta Airlines"),
    @XmlEnumValue("Aer Lingus")
    AER_LINGUS("Aer Lingus"),
    @XmlEnumValue("Icelandair")
    ICELANDAIR("Icelandair"),
    @XmlEnumValue("Hawaiian Airlines")
    HAWAIIAN_AIRLINES("Hawaiian Airlines"),
    @XmlEnumValue("United Airlines")
    UNITED_AIRLINES("United Airlines"),
    @XmlEnumValue("WestJet Airlines")
    WEST_JET_AIRLINES("WestJet Airlines");
    private final String value;

    Airline(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Airline fromValue(String v) {
        for (Airline c: Airline.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}