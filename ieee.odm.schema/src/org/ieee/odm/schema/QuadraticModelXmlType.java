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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for quadraticModelXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="quadraticModelXmlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sqrCoeff" type="{http://www.ieee.org/odm/Schema/2008}sqrCoeffXmlType"/>
 *         &lt;element name="linCoeff" type="{http://www.ieee.org/odm/Schema/2008}linCoeffXmlType"/>
 *         &lt;element name="constCoeff" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "quadraticModelXmlType", propOrder = {
    "sqrCoeff",
    "linCoeff",
    "constCoeff"
})
public class QuadraticModelXmlType {

    @XmlElement(required = true)
    protected SqrCoeffXmlType sqrCoeff;
    @XmlElement(required = true)
    protected LinCoeffXmlType linCoeff;
    protected double constCoeff;

    /**
     * Gets the value of the sqrCoeff property.
     * 
     * @return
     *     possible object is
     *     {@link SqrCoeffXmlType }
     *     
     */
    public SqrCoeffXmlType getSqrCoeff() {
        return sqrCoeff;
    }

    /**
     * Sets the value of the sqrCoeff property.
     * 
     * @param value
     *     allowed object is
     *     {@link SqrCoeffXmlType }
     *     
     */
    public void setSqrCoeff(SqrCoeffXmlType value) {
        this.sqrCoeff = value;
    }

    /**
     * Gets the value of the linCoeff property.
     * 
     * @return
     *     possible object is
     *     {@link LinCoeffXmlType }
     *     
     */
    public LinCoeffXmlType getLinCoeff() {
        return linCoeff;
    }

    /**
     * Sets the value of the linCoeff property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinCoeffXmlType }
     *     
     */
    public void setLinCoeff(LinCoeffXmlType value) {
        this.linCoeff = value;
    }

    /**
     * Gets the value of the constCoeff property.
     * 
     */
    public double getConstCoeff() {
        return constCoeff;
    }

    /**
     * Sets the value of the constCoeff property.
     * 
     */
    public void setConstCoeff(double value) {
        this.constCoeff = value;
    }

}
