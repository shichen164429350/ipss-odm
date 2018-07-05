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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DynamicLoadModelSelectionXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DynamicLoadModelSelectionXmlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="IEEEStaticLoad" type="{http://www.ieee.org/odm/Schema/2008}DynamicLoadIEEEStaticLoadXmlType" minOccurs="0"/>
 *         &lt;element name="ComplexLoad" type="{http://www.ieee.org/odm/Schema/2008}DynamicLoadComplexLoadXmlType" minOccurs="0"/>
 *         &lt;element name="InductionMotorCIM5" type="{http://www.ieee.org/odm/Schema/2008}DynamicLoadInductionMotorCIM5XmlType" minOccurs="0"/>
 *         &lt;element name="CMPLDWLoad" type="{http://www.ieee.org/odm/Schema/2008}DynamicLoadCMPLDWXmlType" minOccurs="0"/>
 *         &lt;element name="SinglePhaseACMotor" type="{http://www.ieee.org/odm/Schema/2008}DynamicLoadSinglePhaseACMotorXmlType" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DynamicLoadModelSelectionXmlType", propOrder = {
    "ieeeStaticLoad",
    "complexLoad",
    "inductionMotorCIM5",
    "cmpldwLoad",
    "singlePhaseACMotor"
})
public class DynamicLoadModelSelectionXmlType {

    @XmlElement(name = "IEEEStaticLoad")
    protected DynamicLoadIEEEStaticLoadXmlType ieeeStaticLoad;
    @XmlElement(name = "ComplexLoad")
    protected DynamicLoadComplexLoadXmlType complexLoad;
    @XmlElement(name = "InductionMotorCIM5")
    protected DynamicLoadInductionMotorCIM5XmlType inductionMotorCIM5;
    @XmlElement(name = "CMPLDWLoad")
    protected DynamicLoadCMPLDWXmlType cmpldwLoad;
    @XmlElement(name = "SinglePhaseACMotor")
    protected DynamicLoadSinglePhaseACMotorXmlType singlePhaseACMotor;

    /**
     * Gets the value of the ieeeStaticLoad property.
     * 
     * @return
     *     possible object is
     *     {@link DynamicLoadIEEEStaticLoadXmlType }
     *     
     */
    public DynamicLoadIEEEStaticLoadXmlType getIEEEStaticLoad() {
        return ieeeStaticLoad;
    }

    /**
     * Sets the value of the ieeeStaticLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicLoadIEEEStaticLoadXmlType }
     *     
     */
    public void setIEEEStaticLoad(DynamicLoadIEEEStaticLoadXmlType value) {
        this.ieeeStaticLoad = value;
    }

    /**
     * Gets the value of the complexLoad property.
     * 
     * @return
     *     possible object is
     *     {@link DynamicLoadComplexLoadXmlType }
     *     
     */
    public DynamicLoadComplexLoadXmlType getComplexLoad() {
        return complexLoad;
    }

    /**
     * Sets the value of the complexLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicLoadComplexLoadXmlType }
     *     
     */
    public void setComplexLoad(DynamicLoadComplexLoadXmlType value) {
        this.complexLoad = value;
    }

    /**
     * Gets the value of the inductionMotorCIM5 property.
     * 
     * @return
     *     possible object is
     *     {@link DynamicLoadInductionMotorCIM5XmlType }
     *     
     */
    public DynamicLoadInductionMotorCIM5XmlType getInductionMotorCIM5() {
        return inductionMotorCIM5;
    }

    /**
     * Sets the value of the inductionMotorCIM5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicLoadInductionMotorCIM5XmlType }
     *     
     */
    public void setInductionMotorCIM5(DynamicLoadInductionMotorCIM5XmlType value) {
        this.inductionMotorCIM5 = value;
    }

    /**
     * Gets the value of the cmpldwLoad property.
     * 
     * @return
     *     possible object is
     *     {@link DynamicLoadCMPLDWXmlType }
     *     
     */
    public DynamicLoadCMPLDWXmlType getCMPLDWLoad() {
        return cmpldwLoad;
    }

    /**
     * Sets the value of the cmpldwLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicLoadCMPLDWXmlType }
     *     
     */
    public void setCMPLDWLoad(DynamicLoadCMPLDWXmlType value) {
        this.cmpldwLoad = value;
    }

    /**
     * Gets the value of the singlePhaseACMotor property.
     * 
     * @return
     *     possible object is
     *     {@link DynamicLoadSinglePhaseACMotorXmlType }
     *     
     */
    public DynamicLoadSinglePhaseACMotorXmlType getSinglePhaseACMotor() {
        return singlePhaseACMotor;
    }

    /**
     * Sets the value of the singlePhaseACMotor property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicLoadSinglePhaseACMotorXmlType }
     *     
     */
    public void setSinglePhaseACMotor(DynamicLoadSinglePhaseACMotorXmlType value) {
        this.singlePhaseACMotor = value;
    }

}
