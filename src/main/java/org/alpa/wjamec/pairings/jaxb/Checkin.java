//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.06.13 at 03:32:22 PM PDT 
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
 * <p>Java class for Checkin complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Checkin"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="report" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="out" use="required" type="{http://www.w3.org/2001/XMLSchema}time" /&gt;
 *       &lt;attribute name="timeOnGround" use="required" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *       &lt;attribute name="dutyAnnotation" type="{https://github.com/stephanheinemann/pairings/tree/master/src/main/resources/xsd}DutyAnnotation" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Checkin")
public class Checkin {

    @XmlAttribute(name = "report")
    protected Boolean report;
    @XmlAttribute(name = "out", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar out;
    @XmlAttribute(name = "timeOnGround", required = true)
    protected Duration timeOnGround;
    @XmlAttribute(name = "dutyAnnotation")
    protected DutyAnnotation dutyAnnotation;

    /**
     * Gets the value of the report property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReport() {
        if (report == null) {
            return false;
        } else {
            return report;
        }
    }

    /**
     * Sets the value of the report property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReport(Boolean value) {
        this.report = value;
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
     * Gets the value of the dutyAnnotation property.
     * 
     * @return
     *     possible object is
     *     {@link DutyAnnotation }
     *     
     */
    public DutyAnnotation getDutyAnnotation() {
        return dutyAnnotation;
    }

    /**
     * Sets the value of the dutyAnnotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutyAnnotation }
     *     
     */
    public void setDutyAnnotation(DutyAnnotation value) {
        this.dutyAnnotation = value;
    }

}
