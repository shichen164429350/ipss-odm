//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.09 at 11:05:44 AM CST 
//


package org.ieee.odm.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DStabLoadDataXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DStabLoadDataXmlType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ieee.org/odm/Schema/2008}ShortCircuitLoadDataXmlType">
 *       &lt;sequence>
 *         &lt;element name="location" type="{http://www.ieee.org/odm/Schema/2008}LoadCharacteristicLocationEnumType"/>
 *         &lt;element name="LoadXmlType" type="{http://www.ieee.org/odm/Schema/2008}LoadCharacteristicTypeEnumType"/>
 *         &lt;element name="LoadModel" type="{http://www.ieee.org/odm/Schema/2008}DynamicLoadModelSelectionXmlType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DStabLoadDataXmlType", propOrder = {
    "location",
    "loadXmlType",
    "loadModel"
})
public class DStabLoadDataXmlType
    extends ShortCircuitLoadDataXmlType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected LoadCharacteristicLocationEnumType location;
    @XmlElement(name = "LoadXmlType", required = true)
    @XmlSchemaType(name = "string")
    protected LoadCharacteristicTypeEnumType loadXmlType;
    @XmlElement(name = "LoadModel", required = true)
    protected DynamicLoadModelSelectionXmlType loadModel;

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link LoadCharacteristicLocationEnumType }
     *     
     */
    public LoadCharacteristicLocationEnumType getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadCharacteristicLocationEnumType }
     *     
     */
    public void setLocation(LoadCharacteristicLocationEnumType value) {
        this.location = value;
    }

    /**
     * Gets the value of the loadXmlType property.
     * 
     * @return
     *     possible object is
     *     {@link LoadCharacteristicTypeEnumType }
     *     
     */
    public LoadCharacteristicTypeEnumType getLoadXmlType() {
        return loadXmlType;
    }

    /**
     * Sets the value of the loadXmlType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadCharacteristicTypeEnumType }
     *     
     */
    public void setLoadXmlType(LoadCharacteristicTypeEnumType value) {
        this.loadXmlType = value;
    }

    /**
     * Gets the value of the loadModel property.
     * 
     * @return
     *     possible object is
     *     {@link DynamicLoadModelSelectionXmlType }
     *     
     */
    public DynamicLoadModelSelectionXmlType getLoadModel() {
        return loadModel;
    }

    /**
     * Sets the value of the loadModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicLoadModelSelectionXmlType }
     *     
     */
    public void setLoadModel(DynamicLoadModelSelectionXmlType value) {
        this.loadModel = value;
    }

}
