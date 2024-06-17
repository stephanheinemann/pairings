//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.06.16 at 07:52:36 PM PDT 
//


package org.alpa.wjamec.pairings.jaxb;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DutyDay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutyDay"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="checkin" type="{https://github.com/stephanheinemann/pairings/tree/master/src/main/resources/xsd}Checkin"/&gt;
 *         &lt;element name="leg" type="{https://github.com/stephanheinemann/pairings/tree/master/src/main/resources/xsd}Leg" maxOccurs="unbounded"/&gt;
 *         &lt;element name="checkout" type="{https://github.com/stephanheinemann/pairings/tree/master/src/main/resources/xsd}Checkout"/&gt;
 *         &lt;element name="layover" type="{https://github.com/stephanheinemann/pairings/tree/master/src/main/resources/xsd}Layover" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="sequence" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutyDay", propOrder = {
    "checkin",
    "leg",
    "checkout",
    "layover"
})
public class DutyDay {

    @XmlElement(required = true)
    protected Checkin checkin;
    @XmlElement(required = true)
    protected List<Leg> leg;
    @XmlElement(required = true)
    protected Checkout checkout;
    protected Layover layover;
    @XmlAttribute(name = "sequence", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger sequence;

    /**
     * Gets the value of the checkin property.
     * 
     * @return
     *     possible object is
     *     {@link Checkin }
     *     
     */
    public Checkin getCheckin() {
        return checkin;
    }

    /**
     * Sets the value of the checkin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Checkin }
     *     
     */
    public void setCheckin(Checkin value) {
        this.checkin = value;
    }

    /**
     * Gets the value of the leg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the leg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Leg }
     * 
     * 
     */
    public List<Leg> getLeg() {
        if (leg == null) {
            leg = new ArrayList<Leg>();
        }
        return this.leg;
    }

    /**
     * Gets the value of the checkout property.
     * 
     * @return
     *     possible object is
     *     {@link Checkout }
     *     
     */
    public Checkout getCheckout() {
        return checkout;
    }

    /**
     * Sets the value of the checkout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Checkout }
     *     
     */
    public void setCheckout(Checkout value) {
        this.checkout = value;
    }

    /**
     * Gets the value of the layover property.
     * 
     * @return
     *     possible object is
     *     {@link Layover }
     *     
     */
    public Layover getLayover() {
        return layover;
    }

    /**
     * Sets the value of the layover property.
     * 
     * @param value
     *     allowed object is
     *     {@link Layover }
     *     
     */
    public void setLayover(Layover value) {
        this.layover = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequence(BigInteger value) {
        this.sequence = value;
    }

}
