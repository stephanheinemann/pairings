//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.06.16 at 07:52:36 PM PDT 
//


package org.alpa.wjamec.pairings.jaxb;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Vehicle.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="Vehicle"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Ground Transportation"/&gt;
 *     &lt;enumeration value="Limousine"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Vehicle")
@XmlEnum
public enum Vehicle {

    @XmlEnumValue("Ground Transportation")
    GROUND_TRANSPORTATION("Ground Transportation"),
    @XmlEnumValue("Limousine")
    LIMOUSINE("Limousine");
    private final String value;

    Vehicle(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Vehicle fromValue(String v) {
        for (Vehicle c: Vehicle.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
