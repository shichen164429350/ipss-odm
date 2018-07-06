//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.05 at 10:46:24 PM PDT 
//


package org.ieee.odm.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BranchShiftFactorXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BranchShiftFactorXmlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="shiftFactor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="branch" type="{http://www.ieee.org/odm/Schema/2008}BranchRefXmlType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BranchShiftFactorXmlType", namespace = "http://www.interpss.org/Schema/odm/2008", propOrder = {
    "shiftFactor",
    "branch"
})
public class BranchShiftFactorXmlType {

    protected Double shiftFactor;
    @XmlElement(required = true)
    protected BranchRefXmlType branch;

    /**
     * Gets the value of the shiftFactor property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getShiftFactor() {
        return shiftFactor;
    }

    /**
     * Sets the value of the shiftFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setShiftFactor(Double value) {
        this.shiftFactor = value;
    }

    /**
     * Gets the value of the branch property.
     * 
     * @return
     *     possible object is
     *     {@link BranchRefXmlType }
     *     
     */
    public BranchRefXmlType getBranch() {
        return branch;
    }

    /**
     * Sets the value of the branch property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchRefXmlType }
     *     
     */
    public void setBranch(BranchRefXmlType value) {
        this.branch = value;
    }

}
