//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.06.18 at 09:29:19 PM PDT 
//


package org.alpa.wjamec.pairings.jaxb;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InitialDutyDays complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InitialDutyDays"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="initialDutyDay" type="{https://github.com/stephanheinemann/pairings/tree/master/src/main/resources/xsd}InitialDutyDay" maxOccurs="31"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InitialDutyDays", propOrder = {
    "initialDutyDay"
})
public class InitialDutyDays {

    @XmlElement(required = true)
    protected List<InitialDutyDay> initialDutyDay;

    /**
     * Gets the value of the initialDutyDay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the initialDutyDay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInitialDutyDay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InitialDutyDay }
     * 
     * 
     */
    public List<InitialDutyDay> getInitialDutyDay() {
        if (initialDutyDay == null) {
            initialDutyDay = new ArrayList<InitialDutyDay>();
        }
        return this.initialDutyDay;
    }

}
