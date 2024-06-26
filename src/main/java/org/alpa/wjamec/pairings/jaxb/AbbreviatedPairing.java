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

import java.math.BigInteger;
import javax.xml.datatype.Duration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbbreviatedPairing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbbreviatedPairing"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="pairing" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="days" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="length" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *       &lt;attribute name="legs" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="credit" use="required" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *       &lt;attribute name="creditRatio" use="required" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *       &lt;attribute name="perDiem" use="required" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbbreviatedPairing")
public class AbbreviatedPairing {

    @XmlAttribute(name = "pairing")
    protected String pairing;
    @XmlAttribute(name = "days", required = true)
    protected String days;
    @XmlAttribute(name = "length", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger length;
    @XmlAttribute(name = "legs", required = true)
    protected String legs;
    @XmlAttribute(name = "credit", required = true)
    protected Duration credit;
    @XmlAttribute(name = "creditRatio", required = true)
    protected Duration creditRatio;
    @XmlAttribute(name = "perDiem", required = true)
    protected float perDiem;

    /**
     * Gets the value of the pairing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPairing() {
        return pairing;
    }

    /**
     * Sets the value of the pairing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPairing(String value) {
        this.pairing = value;
    }

    /**
     * Gets the value of the days property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDays() {
        return days;
    }

    /**
     * Sets the value of the days property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDays(String value) {
        this.days = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLength(BigInteger value) {
        this.length = value;
    }

    /**
     * Gets the value of the legs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegs() {
        return legs;
    }

    /**
     * Sets the value of the legs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegs(String value) {
        this.legs = value;
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
     * Gets the value of the creditRatio property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getCreditRatio() {
        return creditRatio;
    }

    /**
     * Sets the value of the creditRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setCreditRatio(Duration value) {
        this.creditRatio = value;
    }

    /**
     * Gets the value of the perDiem property.
     * 
     */
    public float getPerDiem() {
        return perDiem;
    }

    /**
     * Sets the value of the perDiem property.
     * 
     */
    public void setPerDiem(float value) {
        this.perDiem = value;
    }

}
