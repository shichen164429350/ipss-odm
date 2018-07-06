//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.06 at 07:48:32 PM CST 
//


package org.ieee.odm.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PtSwingAllocXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PtSwingAllocXmlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zoneNumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="steps" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="accFactor" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="allocTolerance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PtSwingAllocXmlType", namespace = "http://www.interpss.org/Schema/odm/2008", propOrder = {
    "zoneNumber",
    "steps",
    "accFactor",
    "allocTolerance"
})
public class PtSwingAllocXmlType {

    protected long zoneNumber;
    protected Integer steps;
    protected double accFactor;
    protected Double allocTolerance;

    /**
     * Gets the value of the zoneNumber property.
     * 
     */
    public long getZoneNumber() {
        return zoneNumber;
    }

    /**
     * Sets the value of the zoneNumber property.
     * 
     */
    public void setZoneNumber(long value) {
        this.zoneNumber = value;
    }

    /**
     * Gets the value of the steps property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSteps() {
        return steps;
    }

    /**
     * Sets the value of the steps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSteps(Integer value) {
        this.steps = value;
    }

    /**
     * Gets the value of the accFactor property.
     * 
     */
    public double getAccFactor() {
        return accFactor;
    }

    /**
     * Sets the value of the accFactor property.
     * 
     */
    public void setAccFactor(double value) {
        this.accFactor = value;
    }

    /**
     * Gets the value of the allocTolerance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAllocTolerance() {
        return allocTolerance;
    }

    /**
     * Sets the value of the allocTolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAllocTolerance(Double value) {
        this.allocTolerance = value;
    }

}
