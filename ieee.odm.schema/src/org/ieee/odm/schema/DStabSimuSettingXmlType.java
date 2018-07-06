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
 * <p>Java class for DStabSimuSettingXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DStabSimuSettingXmlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dstabMethod" type="{http://www.ieee.org/odm/Schema/2008}DStabMethodEnumType"/>
 *         &lt;element name="totalTime" type="{http://www.ieee.org/odm/Schema/2008}TimePeriodXmlType"/>
 *         &lt;element name="step" type="{http://www.ieee.org/odm/Schema/2008}TimePeriodXmlType"/>
 *         &lt;element name="absMachineAngle" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="refMachineBus" type="{http://www.ieee.org/odm/Schema/2008}BusRefXmlType" minOccurs="0"/>
 *         &lt;element name="netEqnSolveConfig" type="{http://www.interpss.org/Schema/odm/2008}DStabNetEqnSolveConfigXmlType" minOccurs="0"/>
 *         &lt;element name="staticLoadModel" type="{http://www.interpss.org/Schema/odm/2008}StaticLoadModelXmlType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DStabSimuSettingXmlType", namespace = "http://www.interpss.org/Schema/odm/2008", propOrder = {
    "dstabMethod",
    "totalTime",
    "step",
    "absMachineAngle",
    "refMachineBus",
    "netEqnSolveConfig",
    "staticLoadModel"
})
public class DStabSimuSettingXmlType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DStabMethodEnumType dstabMethod;
    @XmlElement(required = true)
    protected TimePeriodXmlType totalTime;
    @XmlElement(required = true)
    protected TimePeriodXmlType step;
    protected Boolean absMachineAngle;
    protected BusRefXmlType refMachineBus;
    protected DStabNetEqnSolveConfigXmlType netEqnSolveConfig;
    @XmlElement(required = true)
    protected StaticLoadModelXmlType staticLoadModel;

    /**
     * Gets the value of the dstabMethod property.
     * 
     * @return
     *     possible object is
     *     {@link DStabMethodEnumType }
     *     
     */
    public DStabMethodEnumType getDstabMethod() {
        return dstabMethod;
    }

    /**
     * Sets the value of the dstabMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DStabMethodEnumType }
     *     
     */
    public void setDstabMethod(DStabMethodEnumType value) {
        this.dstabMethod = value;
    }

    /**
     * Gets the value of the totalTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public TimePeriodXmlType getTotalTime() {
        return totalTime;
    }

    /**
     * Sets the value of the totalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public void setTotalTime(TimePeriodXmlType value) {
        this.totalTime = value;
    }

    /**
     * Gets the value of the step property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public TimePeriodXmlType getStep() {
        return step;
    }

    /**
     * Sets the value of the step property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public void setStep(TimePeriodXmlType value) {
        this.step = value;
    }

    /**
     * Gets the value of the absMachineAngle property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAbsMachineAngle() {
        return absMachineAngle;
    }

    /**
     * Sets the value of the absMachineAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAbsMachineAngle(Boolean value) {
        this.absMachineAngle = value;
    }

    /**
     * Gets the value of the refMachineBus property.
     * 
     * @return
     *     possible object is
     *     {@link BusRefXmlType }
     *     
     */
    public BusRefXmlType getRefMachineBus() {
        return refMachineBus;
    }

    /**
     * Sets the value of the refMachineBus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusRefXmlType }
     *     
     */
    public void setRefMachineBus(BusRefXmlType value) {
        this.refMachineBus = value;
    }

    /**
     * Gets the value of the netEqnSolveConfig property.
     * 
     * @return
     *     possible object is
     *     {@link DStabNetEqnSolveConfigXmlType }
     *     
     */
    public DStabNetEqnSolveConfigXmlType getNetEqnSolveConfig() {
        return netEqnSolveConfig;
    }

    /**
     * Sets the value of the netEqnSolveConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link DStabNetEqnSolveConfigXmlType }
     *     
     */
    public void setNetEqnSolveConfig(DStabNetEqnSolveConfigXmlType value) {
        this.netEqnSolveConfig = value;
    }

    /**
     * Gets the value of the staticLoadModel property.
     * 
     * @return
     *     possible object is
     *     {@link StaticLoadModelXmlType }
     *     
     */
    public StaticLoadModelXmlType getStaticLoadModel() {
        return staticLoadModel;
    }

    /**
     * Sets the value of the staticLoadModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link StaticLoadModelXmlType }
     *     
     */
    public void setStaticLoadModel(StaticLoadModelXmlType value) {
        this.staticLoadModel = value;
    }

}
