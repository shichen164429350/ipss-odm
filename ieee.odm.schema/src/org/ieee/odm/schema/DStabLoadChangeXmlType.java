//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.06 at 07:48:32 PM CST 
//


package org.ieee.odm.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DStabLoadChangeXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DStabLoadChangeXmlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="refBus" type="{http://www.ieee.org/odm/Schema/2008}BusRefXmlType"/>
 *         &lt;element name="loadChangeType" type="{http://www.ieee.org/odm/Schema/2008}DStabLoadChangeEnumType"/>
 *         &lt;element name="changeFactor" type="{http://www.ieee.org/odm/Schema/2008}ChangeFactorXmlType"/>
 *         &lt;element name="threshhold" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="delayTime" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DStabLoadChangeXmlType", namespace = "http://www.interpss.org/Schema/odm/2008", propOrder = {
    "refBus",
    "loadChangeType",
    "changeFactor",
    "threshhold",
    "delayTime"
})
public class DStabLoadChangeXmlType {

    @XmlElement(required = true)
    protected BusRefXmlType refBus;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DStabLoadChangeEnumType loadChangeType;
    @XmlElement(required = true)
    protected ChangeFactorXmlType changeFactor;
    protected Double threshhold;
    protected Double delayTime;

    /**
     * Gets the value of the refBus property.
     * 
     * @return
     *     possible object is
     *     {@link BusRefXmlType }
     *     
     */
    public BusRefXmlType getRefBus() {
        return refBus;
    }

    /**
     * Sets the value of the refBus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusRefXmlType }
     *     
     */
    public void setRefBus(BusRefXmlType value) {
        this.refBus = value;
    }

    /**
     * Gets the value of the loadChangeType property.
     * 
     * @return
     *     possible object is
     *     {@link DStabLoadChangeEnumType }
     *     
     */
    public DStabLoadChangeEnumType getLoadChangeType() {
        return loadChangeType;
    }

    /**
     * Sets the value of the loadChangeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DStabLoadChangeEnumType }
     *     
     */
    public void setLoadChangeType(DStabLoadChangeEnumType value) {
        this.loadChangeType = value;
    }

    /**
     * Gets the value of the changeFactor property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeFactorXmlType }
     *     
     */
    public ChangeFactorXmlType getChangeFactor() {
        return changeFactor;
    }

    /**
     * Sets the value of the changeFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeFactorXmlType }
     *     
     */
    public void setChangeFactor(ChangeFactorXmlType value) {
        this.changeFactor = value;
    }

    /**
     * Gets the value of the threshhold property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getThreshhold() {
        return threshhold;
    }

    /**
     * Sets the value of the threshhold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setThreshhold(Double value) {
        this.threshhold = value;
    }

    /**
     * Gets the value of the delayTime property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDelayTime() {
        return delayTime;
    }

    /**
     * Sets the value of the delayTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDelayTime(Double value) {
        this.delayTime = value;
    }

}
