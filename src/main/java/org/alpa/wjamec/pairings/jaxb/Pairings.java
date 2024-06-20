//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.06.19 at 10:56:33 PM PDT 
//


package org.alpa.wjamec.pairings.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="pairing" type="{https://github.com/stephanheinemann/pairings/tree/master/src/main/resources/xsd}Pairing" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="preliminaryPairing" type="{https://github.com/stephanheinemann/pairings/tree/master/src/main/resources/xsd}PreliminaryPairing" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="abbreviatedPairing" type="{https://github.com/stephanheinemann/pairings/tree/master/src/main/resources/xsd}AbbreviatedPairing" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="validFrom" use="required" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="validTo" use="required" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pairing",
    "preliminaryPairing",
    "abbreviatedPairing"
})
@XmlRootElement(name = "pairings")
public class Pairings {

    protected List<Pairing> pairing;
    protected List<PreliminaryPairing> preliminaryPairing;
    protected List<AbbreviatedPairing> abbreviatedPairing;
    @XmlAttribute(name = "validFrom", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar validFrom;
    @XmlAttribute(name = "validTo", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar validTo;

    /**
     * Gets the value of the pairing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the pairing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPairing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pairing }
     * 
     * 
     */
    public List<Pairing> getPairing() {
        if (pairing == null) {
            pairing = new ArrayList<Pairing>();
        }
        return this.pairing;
    }

    /**
     * Gets the value of the preliminaryPairing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the preliminaryPairing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreliminaryPairing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreliminaryPairing }
     * 
     * 
     */
    public List<PreliminaryPairing> getPreliminaryPairing() {
        if (preliminaryPairing == null) {
            preliminaryPairing = new ArrayList<PreliminaryPairing>();
        }
        return this.preliminaryPairing;
    }

    /**
     * Gets the value of the abbreviatedPairing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the abbreviatedPairing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbbreviatedPairing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbbreviatedPairing }
     * 
     * 
     */
    public List<AbbreviatedPairing> getAbbreviatedPairing() {
        if (abbreviatedPairing == null) {
            abbreviatedPairing = new ArrayList<AbbreviatedPairing>();
        }
        return this.abbreviatedPairing;
    }

    /**
     * Gets the value of the validFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidFrom() {
        return validFrom;
    }

    /**
     * Sets the value of the validFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidFrom(XMLGregorianCalendar value) {
        this.validFrom = value;
    }

    /**
     * Gets the value of the validTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidTo() {
        return validTo;
    }

    /**
     * Sets the value of the validTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidTo(XMLGregorianCalendar value) {
        this.validTo = value;
    }

}
