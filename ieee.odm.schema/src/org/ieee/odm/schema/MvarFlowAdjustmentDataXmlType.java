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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MvarFlowAdjustmentDataXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MvarFlowAdjustmentDataXmlType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ieee.org/odm/Schema/2008}AdjustmentDataXmlType">
 *       &lt;sequence>
 *         &lt;element name="desiredMvarFlowUnit" type="{http://www.ieee.org/odm/Schema/2008}ReactivePowerUnitType"/>
 *         &lt;element name="mvarMeasuredOnFormSide" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MvarFlowAdjustmentDataXmlType", propOrder = {
    "desiredMvarFlowUnit",
    "mvarMeasuredOnFormSide"
})
public class MvarFlowAdjustmentDataXmlType
    extends AdjustmentDataXmlType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ReactivePowerUnitType desiredMvarFlowUnit;
    protected boolean mvarMeasuredOnFormSide;

    /**
     * Gets the value of the desiredMvarFlowUnit property.
     * 
     * @return
     *     possible object is
     *     {@link ReactivePowerUnitType }
     *     
     */
    public ReactivePowerUnitType getDesiredMvarFlowUnit() {
        return desiredMvarFlowUnit;
    }

    /**
     * Sets the value of the desiredMvarFlowUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReactivePowerUnitType }
     *     
     */
    public void setDesiredMvarFlowUnit(ReactivePowerUnitType value) {
        this.desiredMvarFlowUnit = value;
    }

    /**
     * Gets the value of the mvarMeasuredOnFormSide property.
     * 
     */
    public boolean isMvarMeasuredOnFormSide() {
        return mvarMeasuredOnFormSide;
    }

    /**
     * Sets the value of the mvarMeasuredOnFormSide property.
     * 
     */
    public void setMvarMeasuredOnFormSide(boolean value) {
        this.mvarMeasuredOnFormSide = value;
    }

}
