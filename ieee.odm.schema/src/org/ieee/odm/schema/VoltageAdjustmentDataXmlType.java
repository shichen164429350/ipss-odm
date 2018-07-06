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
 * <p>Java class for VoltageAdjustmentDataXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VoltageAdjustmentDataXmlType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ieee.org/odm/Schema/2008}AdjustmentDataXmlType">
 *       &lt;sequence>
 *         &lt;element name="desiredVoltageUnit" type="{http://www.ieee.org/odm/Schema/2008}VoltageUnitType"/>
 *         &lt;element name="adjVoltageBus" type="{http://www.ieee.org/odm/Schema/2008}IDRefRecordXmlType"/>
 *         &lt;element name="adjBusLocation" type="{http://www.ieee.org/odm/Schema/2008}TapAdjustBusLocationEnumType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VoltageAdjustmentDataXmlType", propOrder = {
    "desiredVoltageUnit",
    "adjVoltageBus",
    "adjBusLocation"
})
public class VoltageAdjustmentDataXmlType
    extends AdjustmentDataXmlType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected VoltageUnitType desiredVoltageUnit;
    @XmlElement(required = true)
    protected IDRefRecordXmlType adjVoltageBus;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TapAdjustBusLocationEnumType adjBusLocation;

    /**
     * Gets the value of the desiredVoltageUnit property.
     * 
     * @return
     *     possible object is
     *     {@link VoltageUnitType }
     *     
     */
    public VoltageUnitType getDesiredVoltageUnit() {
        return desiredVoltageUnit;
    }

    /**
     * Sets the value of the desiredVoltageUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoltageUnitType }
     *     
     */
    public void setDesiredVoltageUnit(VoltageUnitType value) {
        this.desiredVoltageUnit = value;
    }

    /**
     * Gets the value of the adjVoltageBus property.
     * 
     * @return
     *     possible object is
     *     {@link IDRefRecordXmlType }
     *     
     */
    public IDRefRecordXmlType getAdjVoltageBus() {
        return adjVoltageBus;
    }

    /**
     * Sets the value of the adjVoltageBus property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDRefRecordXmlType }
     *     
     */
    public void setAdjVoltageBus(IDRefRecordXmlType value) {
        this.adjVoltageBus = value;
    }

    /**
     * Gets the value of the adjBusLocation property.
     * 
     * @return
     *     possible object is
     *     {@link TapAdjustBusLocationEnumType }
     *     
     */
    public TapAdjustBusLocationEnumType getAdjBusLocation() {
        return adjBusLocation;
    }

    /**
     * Sets the value of the adjBusLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TapAdjustBusLocationEnumType }
     *     
     */
    public void setAdjBusLocation(TapAdjustBusLocationEnumType value) {
        this.adjBusLocation = value;
    }

}
