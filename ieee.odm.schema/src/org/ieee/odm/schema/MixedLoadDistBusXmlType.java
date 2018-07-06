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
 * 
 * 		bus record for loadflow and short circuit study
 * 		
 * 
 * <p>Java class for MixedLoadDistBusXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MixedLoadDistBusXmlType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ieee.org/odm/Schema/2008}RotatingMachineDistBusXmlType">
 *       &lt;sequence>
 *         &lt;element name="totalKva" type="{http://www.ieee.org/odm/Schema/2008}ApparentPowerXmlType"/>
 *         &lt;element name="motorPercent" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MixedLoadDistBusXmlType", propOrder = {
    "totalKva",
    "motorPercent"
})
public class MixedLoadDistBusXmlType
    extends RotatingMachineDistBusXmlType
{

    @XmlElement(required = true)
    protected ApparentPowerXmlType totalKva;
    protected double motorPercent;

    /**
     * Gets the value of the totalKva property.
     * 
     * @return
     *     possible object is
     *     {@link ApparentPowerXmlType }
     *     
     */
    public ApparentPowerXmlType getTotalKva() {
        return totalKva;
    }

    /**
     * Sets the value of the totalKva property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApparentPowerXmlType }
     *     
     */
    public void setTotalKva(ApparentPowerXmlType value) {
        this.totalKva = value;
    }

    /**
     * Gets the value of the motorPercent property.
     * 
     */
    public double getMotorPercent() {
        return motorPercent;
    }

    /**
     * Sets the value of the motorPercent property.
     * 
     */
    public void setMotorPercent(double value) {
        this.motorPercent = value;
    }

}
