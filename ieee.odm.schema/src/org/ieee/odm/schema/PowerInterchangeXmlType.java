//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.06 at 11:22:51 PM PDT 
//


package org.ieee.odm.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PowerInterchangeXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PowerInterchangeXmlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="swingBus" type="{http://www.ieee.org/odm/Schema/2008}IDRefRecordXmlType"/>
 *         &lt;element name="alternateSwingBusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="desiredExPower" type="{http://www.ieee.org/odm/Schema/2008}ActivePowerXmlType"/>
 *         &lt;element name="exErrTolerance" type="{http://www.ieee.org/odm/Schema/2008}ActivePowerXmlType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="areaNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="areaCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="areaName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerInterchangeXmlType", propOrder = {
    "swingBus",
    "alternateSwingBusName",
    "desiredExPower",
    "exErrTolerance"
})
public class PowerInterchangeXmlType {

    @XmlElement(required = true)
    protected IDRefRecordXmlType swingBus;
    protected String alternateSwingBusName;
    @XmlElement(required = true)
    protected ActivePowerXmlType desiredExPower;
    @XmlElement(required = true)
    protected ActivePowerXmlType exErrTolerance;
    @XmlAttribute(name = "areaNumber", required = true)
    protected int areaNumber;
    @XmlAttribute(name = "areaCode")
    protected String areaCode;
    @XmlAttribute(name = "areaName")
    protected String areaName;

    /**
     * Gets the value of the swingBus property.
     * 
     * @return
     *     possible object is
     *     {@link IDRefRecordXmlType }
     *     
     */
    public IDRefRecordXmlType getSwingBus() {
        return swingBus;
    }

    /**
     * Sets the value of the swingBus property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDRefRecordXmlType }
     *     
     */
    public void setSwingBus(IDRefRecordXmlType value) {
        this.swingBus = value;
    }

    /**
     * Gets the value of the alternateSwingBusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateSwingBusName() {
        return alternateSwingBusName;
    }

    /**
     * Sets the value of the alternateSwingBusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateSwingBusName(String value) {
        this.alternateSwingBusName = value;
    }

    /**
     * Gets the value of the desiredExPower property.
     * 
     * @return
     *     possible object is
     *     {@link ActivePowerXmlType }
     *     
     */
    public ActivePowerXmlType getDesiredExPower() {
        return desiredExPower;
    }

    /**
     * Sets the value of the desiredExPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivePowerXmlType }
     *     
     */
    public void setDesiredExPower(ActivePowerXmlType value) {
        this.desiredExPower = value;
    }

    /**
     * Gets the value of the exErrTolerance property.
     * 
     * @return
     *     possible object is
     *     {@link ActivePowerXmlType }
     *     
     */
    public ActivePowerXmlType getExErrTolerance() {
        return exErrTolerance;
    }

    /**
     * Sets the value of the exErrTolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivePowerXmlType }
     *     
     */
    public void setExErrTolerance(ActivePowerXmlType value) {
        this.exErrTolerance = value;
    }

    /**
     * Gets the value of the areaNumber property.
     * 
     */
    public int getAreaNumber() {
        return areaNumber;
    }

    /**
     * Sets the value of the areaNumber property.
     * 
     */
    public void setAreaNumber(int value) {
        this.areaNumber = value;
    }

    /**
     * Gets the value of the areaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * Sets the value of the areaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaCode(String value) {
        this.areaCode = value;
    }

    /**
     * Gets the value of the areaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * Sets the value of the areaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaName(String value) {
        this.areaName = value;
    }

}
