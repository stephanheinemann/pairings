//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.06.18 at 09:29:19 PM PDT 
//


package org.alpa.wjamec.pairings.jaxb;

import java.math.BigInteger;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Leg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Leg"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="origin" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="destination" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="out" use="required" type="{http://www.w3.org/2001/XMLSchema}time" /&gt;
 *       &lt;attribute name="in" use="required" type="{http://www.w3.org/2001/XMLSchema}time" /&gt;
 *       &lt;attribute name="block" use="required" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *       &lt;attribute name="credit" use="required" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *       &lt;attribute name="creditAnnotation" type="{https://github.com/stephanheinemann/pairings/tree/master/src/main/resources/xsd}CreditAnnotation" /&gt;
 *       &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Leg")
@XmlSeeAlso({
    GroundLeg.class,
    FlightLeg.class
})
public abstract class Leg {

    @XmlAttribute(name = "origin", required = true)
    protected String origin;
    @XmlAttribute(name = "destination", required = true)
    protected String destination;
    @XmlAttribute(name = "out", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar out;
    @XmlAttribute(name = "in", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar in;
    @XmlAttribute(name = "block", required = true)
    protected Duration block;
    @XmlAttribute(name = "credit", required = true)
    protected Duration credit;
    @XmlAttribute(name = "creditAnnotation")
    protected CreditAnnotation creditAnnotation;
    @XmlAttribute(name = "number")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger number;

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the out property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOut() {
        return out;
    }

    /**
     * Sets the value of the out property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOut(XMLGregorianCalendar value) {
        this.out = value;
    }

    /**
     * Gets the value of the in property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIn() {
        return in;
    }

    /**
     * Sets the value of the in property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIn(XMLGregorianCalendar value) {
        this.in = value;
    }

    /**
     * Gets the value of the block property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getBlock() {
        return block;
    }

    /**
     * Sets the value of the block property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setBlock(Duration value) {
        this.block = value;
    }

    /**
     * Gets the value of the credit property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getCredit() {
        return credit;
    }

    /**
     * Sets the value of the credit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setCredit(Duration value) {
        this.credit = value;
    }

    /**
     * Gets the value of the creditAnnotation property.
     * 
     * @return
     *     possible object is
     *     {@link CreditAnnotation }
     *     
     */
    public CreditAnnotation getCreditAnnotation() {
        return creditAnnotation;
    }

    /**
     * Sets the value of the creditAnnotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditAnnotation }
     *     
     */
    public void setCreditAnnotation(CreditAnnotation value) {
        this.creditAnnotation = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumber(BigInteger value) {
        this.number = value;
    }

}
