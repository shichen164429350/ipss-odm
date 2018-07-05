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
 * <p>Java class for DclfContingencyBranchXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DclfContingencyBranchXmlType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ieee.org/odm/Schema/2008}BranchRefXmlType">
 *       &lt;sequence>
 *         &lt;element name="fromBusVoltage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="toBusVoltage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="fromBusNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="toBusNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DclfContingencyBranchXmlType", namespace = "http://www.interpss.org/Schema/odm/2008", propOrder = {
    "fromBusVoltage",
    "toBusVoltage",
    "fromBusNo",
    "toBusNo"
})
public class DclfContingencyBranchXmlType
    extends BranchRefXmlType
{

    protected Double fromBusVoltage;
    protected Double toBusVoltage;
    protected int fromBusNo;
    protected int toBusNo;

    /**
     * Gets the value of the fromBusVoltage property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFromBusVoltage() {
        return fromBusVoltage;
    }

    /**
     * Sets the value of the fromBusVoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFromBusVoltage(Double value) {
        this.fromBusVoltage = value;
    }

    /**
     * Gets the value of the toBusVoltage property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getToBusVoltage() {
        return toBusVoltage;
    }

    /**
     * Sets the value of the toBusVoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setToBusVoltage(Double value) {
        this.toBusVoltage = value;
    }

    /**
     * Gets the value of the fromBusNo property.
     * 
     */
    public int getFromBusNo() {
        return fromBusNo;
    }

    /**
     * Sets the value of the fromBusNo property.
     * 
     */
    public void setFromBusNo(int value) {
        this.fromBusNo = value;
    }

    /**
     * Gets the value of the toBusNo property.
     * 
     */
    public int getToBusNo() {
        return toBusNo;
    }

    /**
     * Sets the value of the toBusNo property.
     * 
     */
    public void setToBusNo(int value) {
        this.toBusNo = value;
    }

}