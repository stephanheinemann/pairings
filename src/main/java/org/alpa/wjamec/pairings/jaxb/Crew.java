//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.06.16 at 08:27:24 PM PDT 
//


package org.alpa.wjamec.pairings.jaxb;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Crew complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Crew"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="captains" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="firstOfficers" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="flightAttendants" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="extraFlightAttendants" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Crew")
public class Crew {

    @XmlAttribute(name = "captains", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger captains;
    @XmlAttribute(name = "firstOfficers", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger firstOfficers;
    @XmlAttribute(name = "flightAttendants", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger flightAttendants;
    @XmlAttribute(name = "extraFlightAttendants", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger extraFlightAttendants;

    /**
     * Gets the value of the captains property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCaptains() {
        return captains;
    }

    /**
     * Sets the value of the captains property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCaptains(BigInteger value) {
        this.captains = value;
    }

    /**
     * Gets the value of the firstOfficers property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFirstOfficers() {
        return firstOfficers;
    }

    /**
     * Sets the value of the firstOfficers property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFirstOfficers(BigInteger value) {
        this.firstOfficers = value;
    }

    /**
     * Gets the value of the flightAttendants property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFlightAttendants() {
        return flightAttendants;
    }

    /**
     * Sets the value of the flightAttendants property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFlightAttendants(BigInteger value) {
        this.flightAttendants = value;
    }

    /**
     * Gets the value of the extraFlightAttendants property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExtraFlightAttendants() {
        return extraFlightAttendants;
    }

    /**
     * Sets the value of the extraFlightAttendants property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExtraFlightAttendants(BigInteger value) {
        this.extraFlightAttendants = value;
    }

}
