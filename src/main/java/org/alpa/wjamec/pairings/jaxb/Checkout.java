//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.05.24 at 05:39:53 PM PDT 
//


package org.alpa.wjamec.pairings.jaxb;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Checkout complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Checkout"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="release" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="in" use="required" type="{http://www.w3.org/2001/XMLSchema}time" /&gt;
 *       &lt;attribute name="block" use="required" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *       &lt;attribute name="timeOnGround" use="required" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *       &lt;attribute name="duty" use="required" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *       &lt;attribute name="credit" use="required" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *       &lt;attribute name="creditAnnotation" type="{https://github.com/stephanheinemann/pairings/tree/master/src/main/resources/xsd}CreditAnnotation" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Checkout")
public class Checkout {

    @XmlAttribute(name = "release")
    protected Boolean release;
    @XmlAttribute(name = "in", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar in;
    @XmlAttribute(name = "block", required = true)
    protected Duration block;
    @XmlAttribute(name = "timeOnGround", required = true)
    protected Duration timeOnGround;
    @XmlAttribute(name = "duty", required = true)
    protected Duration duty;
    @XmlAttribute(name = "credit", required = true)
    protected Duration credit;
    @XmlAttribute(name = "creditAnnotation")
    protected CreditAnnotation creditAnnotation;

    /**
     * Gets the value of the release property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRelease() {
        if (release == null) {
            return false;
        } else {
            return release;
        }
    }

    /**
     * Sets the value of the release property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRelease(Boolean value) {
        this.release = value;
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
     * Gets the value of the timeOnGround property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimeOnGround() {
        return timeOnGround;
    }

    /**
     * Sets the value of the timeOnGround property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTimeOnGround(Duration value) {
        this.timeOnGround = value;
    }

    /**
     * Gets the value of the duty property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuty() {
        return duty;
    }

    /**
     * Sets the value of the duty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuty(Duration value) {
        this.duty = value;
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

}
