//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.09 at 11:05:44 AM CST 
//


package org.ieee.odm.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DynamicNetEqnSolveConfigXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DynamicNetEqnSolveConfigXmlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="netEqnItrNoEvent" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="netEqnItrWithEvent" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DynamicNetEqnSolveConfigXmlType", namespace = "http://www.interpss.org/Schema/odm/2008", propOrder = {
    "netEqnItrNoEvent",
    "netEqnItrWithEvent"
})
public class DynamicNetEqnSolveConfigXmlType {

    protected Integer netEqnItrNoEvent;
    protected Integer netEqnItrWithEvent;

    /**
     * Gets the value of the netEqnItrNoEvent property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNetEqnItrNoEvent() {
        return netEqnItrNoEvent;
    }

    /**
     * Sets the value of the netEqnItrNoEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNetEqnItrNoEvent(Integer value) {
        this.netEqnItrNoEvent = value;
    }

    /**
     * Gets the value of the netEqnItrWithEvent property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNetEqnItrWithEvent() {
        return netEqnItrWithEvent;
    }

    /**
     * Sets the value of the netEqnItrWithEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNetEqnItrWithEvent(Integer value) {
        this.netEqnItrWithEvent = value;
    }

}
