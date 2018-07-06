//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.06 at 07:48:32 PM CST 
//


package org.ieee.odm.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlowInterfaceBranchXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlowInterfaceBranchXmlType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ieee.org/odm/Schema/2008}BranchRefXmlType">
 *       &lt;sequence>
 *         &lt;element name="deviceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceType" type="{http://www.ieee.org/odm/Schema/2008}LFBranchCodeEnumType" minOccurs="0"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="fromBusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="toBusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowInterfaceBranchXmlType", propOrder = {
    "deviceName",
    "deviceType",
    "weight",
    "fromBusName",
    "toBusName"
})
public class FlowInterfaceBranchXmlType
    extends BranchRefXmlType
{

    protected String deviceName;
    @XmlSchemaType(name = "string")
    protected LFBranchCodeEnumType deviceType;
    protected double weight;
    protected String fromBusName;
    protected String toBusName;

    /**
     * Gets the value of the deviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * Sets the value of the deviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceName(String value) {
        this.deviceName = value;
    }

    /**
     * Gets the value of the deviceType property.
     * 
     * @return
     *     possible object is
     *     {@link LFBranchCodeEnumType }
     *     
     */
    public LFBranchCodeEnumType getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the value of the deviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LFBranchCodeEnumType }
     *     
     */
    public void setDeviceType(LFBranchCodeEnumType value) {
        this.deviceType = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     */
    public void setWeight(double value) {
        this.weight = value;
    }

    /**
     * Gets the value of the fromBusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromBusName() {
        return fromBusName;
    }

    /**
     * Sets the value of the fromBusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromBusName(String value) {
        this.fromBusName = value;
    }

    /**
     * Gets the value of the toBusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToBusName() {
        return toBusName;
    }

    /**
     * Sets the value of the toBusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToBusName(String value) {
        this.toBusName = value;
    }

}
