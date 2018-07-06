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
 * <p>Java class for HourlyDispatchXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HourlyDispatchXmlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hour" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="busDispatch" type="{http://www.ieee.org/odm/Schema/2008}BusGenLoadEDispatchXmlType" minOccurs="0"/>
 *         &lt;element name="branchDispatch" type="{http://www.ieee.org/odm/Schema/2008}BranchEDispatchXmlType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HourlyDispatchXmlType", propOrder = {
    "hour",
    "busDispatch",
    "branchDispatch"
})
public class HourlyDispatchXmlType {

    protected int hour;
    protected BusGenLoadEDispatchXmlType busDispatch;
    protected BranchEDispatchXmlType branchDispatch;

    /**
     * Gets the value of the hour property.
     * 
     */
    public int getHour() {
        return hour;
    }

    /**
     * Sets the value of the hour property.
     * 
     */
    public void setHour(int value) {
        this.hour = value;
    }

    /**
     * Gets the value of the busDispatch property.
     * 
     * @return
     *     possible object is
     *     {@link BusGenLoadEDispatchXmlType }
     *     
     */
    public BusGenLoadEDispatchXmlType getBusDispatch() {
        return busDispatch;
    }

    /**
     * Sets the value of the busDispatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusGenLoadEDispatchXmlType }
     *     
     */
    public void setBusDispatch(BusGenLoadEDispatchXmlType value) {
        this.busDispatch = value;
    }

    /**
     * Gets the value of the branchDispatch property.
     * 
     * @return
     *     possible object is
     *     {@link BranchEDispatchXmlType }
     *     
     */
    public BranchEDispatchXmlType getBranchDispatch() {
        return branchDispatch;
    }

    /**
     * Sets the value of the branchDispatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchEDispatchXmlType }
     *     
     */
    public void setBranchDispatch(BranchEDispatchXmlType value) {
        this.branchDispatch = value;
    }

}
