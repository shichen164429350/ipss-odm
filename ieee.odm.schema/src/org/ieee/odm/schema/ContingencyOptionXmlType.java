//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.06 at 11:22:51 PM PDT 
//


package org.ieee.odm.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContingencyOptionXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContingencyOptionXmlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="busVLimitPU" type="{http://www.ieee.org/odm/Schema/2008}LimitXmlType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContingencyOptionXmlType", namespace = "http://www.interpss.org/Schema/odm/2008", propOrder = {
    "busVLimitPU"
})
public class ContingencyOptionXmlType {

    protected LimitXmlType busVLimitPU;

    /**
     * Gets the value of the busVLimitPU property.
     * 
     * @return
     *     possible object is
     *     {@link LimitXmlType }
     *     
     */
    public LimitXmlType getBusVLimitPU() {
        return busVLimitPU;
    }

    /**
     * Sets the value of the busVLimitPU property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitXmlType }
     *     
     */
    public void setBusVLimitPU(LimitXmlType value) {
        this.busVLimitPU = value;
    }

}
