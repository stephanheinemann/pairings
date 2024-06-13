//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.06.13 at 03:32:22 PM PDT 
//


package org.alpa.wjamec.pairings.jaxb;

import javax.xml.datatype.Duration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightLeg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightLeg"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://github.com/stephanheinemann/pairings/tree/master/src/main/resources/xsd}Leg"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="crew" type="{https://github.com/stephanheinemann/pairings/tree/master/src/main/resources/xsd}Crew" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="aircraft" type="{https://github.com/stephanheinemann/pairings/tree/master/src/main/resources/xsd}Aircraft" /&gt;
 *       &lt;attribute name="airline" type="{https://github.com/stephanheinemann/pairings/tree/master/src/main/resources/xsd}Airline" default="WestJet Airlines" /&gt;
 *       &lt;attribute name="operating" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="timeOnGround" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *       &lt;attribute name="tailSwap" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightLeg", propOrder = {
    "crew"
})
public class FlightLeg
    extends Leg
{

    protected Crew crew;
    @XmlAttribute(name = "aircraft")
    protected Aircraft aircraft;
    @XmlAttribute(name = "airline")
    protected Airline airline;
    @XmlAttribute(name = "operating", required = true)
    protected boolean operating;
    @XmlAttribute(name = "timeOnGround")
    protected Duration timeOnGround;
    @XmlAttribute(name = "tailSwap")
    protected Boolean tailSwap;

    /**
     * Gets the value of the crew property.
     * 
     * @return
     *     possible object is
     *     {@link Crew }
     *     
     */
    public Crew getCrew() {
        return crew;
    }

    /**
     * Sets the value of the crew property.
     * 
     * @param value
     *     allowed object is
     *     {@link Crew }
     *     
     */
    public void setCrew(Crew value) {
        this.crew = value;
    }

    /**
     * Gets the value of the aircraft property.
     * 
     * @return
     *     possible object is
     *     {@link Aircraft }
     *     
     */
    public Aircraft getAircraft() {
        return aircraft;
    }

    /**
     * Sets the value of the aircraft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Aircraft }
     *     
     */
    public void setAircraft(Aircraft value) {
        this.aircraft = value;
    }

    /**
     * Gets the value of the airline property.
     * 
     * @return
     *     possible object is
     *     {@link Airline }
     *     
     */
    public Airline getAirline() {
        if (airline == null) {
            return Airline.WEST_JET_AIRLINES;
        } else {
            return airline;
        }
    }

    /**
     * Sets the value of the airline property.
     * 
     * @param value
     *     allowed object is
     *     {@link Airline }
     *     
     */
    public void setAirline(Airline value) {
        this.airline = value;
    }

    /**
     * Gets the value of the operating property.
     * 
     */
    public boolean isOperating() {
        return operating;
    }

    /**
     * Sets the value of the operating property.
     * 
     */
    public void setOperating(boolean value) {
        this.operating = value;
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
     * Gets the value of the tailSwap property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTailSwap() {
        if (tailSwap == null) {
            return false;
        } else {
            return tailSwap;
        }
    }

    /**
     * Sets the value of the tailSwap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTailSwap(Boolean value) {
        this.tailSwap = value;
    }

}
