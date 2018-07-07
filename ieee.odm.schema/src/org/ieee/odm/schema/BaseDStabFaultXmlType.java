//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.06 at 11:22:51 PM PDT 
//


package org.ieee.odm.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseDStabFaultXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseDStabFaultXmlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="faultCategory" type="{http://www.ieee.org/odm/Schema/2008}AcscFaultCategoryEnumType"/>
 *         &lt;element name="faultStartTime" type="{http://www.ieee.org/odm/Schema/2008}TimePeriodXmlType" minOccurs="0"/>
 *         &lt;element name="firstOperationTime" type="{http://www.ieee.org/odm/Schema/2008}TimePeriodXmlType" minOccurs="0"/>
 *         &lt;element name="secondOperationTime" type="{http://www.ieee.org/odm/Schema/2008}TimePeriodXmlType" minOccurs="0"/>
 *         &lt;element name="faultDurationTime" type="{http://www.ieee.org/odm/Schema/2008}TimePeriodXmlType" minOccurs="0"/>
 *         &lt;element name="faultZ" type="{http://www.ieee.org/odm/Schema/2008}ZXmlType" minOccurs="0"/>
 *         &lt;element name="permanentFault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseDStabFaultXmlType", propOrder = {
    "faultCategory",
    "faultStartTime",
    "firstOperationTime",
    "secondOperationTime",
    "faultDurationTime",
    "faultZ",
    "permanentFault"
})
@XmlSeeAlso({
    DStabBusFaultXmlType.class,
    DStabBranchFaultXmlType.class
})
public class BaseDStabFaultXmlType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AcscFaultCategoryEnumType faultCategory;
    protected TimePeriodXmlType faultStartTime;
    protected TimePeriodXmlType firstOperationTime;
    protected TimePeriodXmlType secondOperationTime;
    protected TimePeriodXmlType faultDurationTime;
    protected ZXmlType faultZ;
    protected Boolean permanentFault;

    /**
     * Gets the value of the faultCategory property.
     * 
     * @return
     *     possible object is
     *     {@link AcscFaultCategoryEnumType }
     *     
     */
    public AcscFaultCategoryEnumType getFaultCategory() {
        return faultCategory;
    }

    /**
     * Sets the value of the faultCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcscFaultCategoryEnumType }
     *     
     */
    public void setFaultCategory(AcscFaultCategoryEnumType value) {
        this.faultCategory = value;
    }

    /**
     * Gets the value of the faultStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public TimePeriodXmlType getFaultStartTime() {
        return faultStartTime;
    }

    /**
     * Sets the value of the faultStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public void setFaultStartTime(TimePeriodXmlType value) {
        this.faultStartTime = value;
    }

    /**
     * Gets the value of the firstOperationTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public TimePeriodXmlType getFirstOperationTime() {
        return firstOperationTime;
    }

    /**
     * Sets the value of the firstOperationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public void setFirstOperationTime(TimePeriodXmlType value) {
        this.firstOperationTime = value;
    }

    /**
     * Gets the value of the secondOperationTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public TimePeriodXmlType getSecondOperationTime() {
        return secondOperationTime;
    }

    /**
     * Sets the value of the secondOperationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public void setSecondOperationTime(TimePeriodXmlType value) {
        this.secondOperationTime = value;
    }

    /**
     * Gets the value of the faultDurationTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public TimePeriodXmlType getFaultDurationTime() {
        return faultDurationTime;
    }

    /**
     * Sets the value of the faultDurationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public void setFaultDurationTime(TimePeriodXmlType value) {
        this.faultDurationTime = value;
    }

    /**
     * Gets the value of the faultZ property.
     * 
     * @return
     *     possible object is
     *     {@link ZXmlType }
     *     
     */
    public ZXmlType getFaultZ() {
        return faultZ;
    }

    /**
     * Sets the value of the faultZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZXmlType }
     *     
     */
    public void setFaultZ(ZXmlType value) {
        this.faultZ = value;
    }

    /**
     * Gets the value of the permanentFault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermanentFault() {
        return permanentFault;
    }

    /**
     * Sets the value of the permanentFault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermanentFault(Boolean value) {
        this.permanentFault = value;
    }

}
