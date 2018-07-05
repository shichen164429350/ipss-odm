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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExcSimpleTypeXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExcSimpleTypeXmlType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ieee.org/odm/Schema/2008}ExciterModelXmlType">
 *       &lt;sequence>
 *         &lt;element name="loadRc" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="loadXc" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="transTr" type="{http://www.ieee.org/odm/Schema/2008}TimePeriodXmlType" minOccurs="0"/>
 *         &lt;element name="Ka" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Ta" type="{http://www.ieee.org/odm/Schema/2008}TimePeriodXmlType"/>
 *         &lt;element name="Vrmax" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Vrmin" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExcSimpleTypeXmlType", propOrder = {
    "loadRc",
    "loadXc",
    "transTr",
    "ka",
    "ta",
    "vrmax",
    "vrmin"
})
@XmlSeeAlso({
    ExcIEEE1968Type4XmlType.class,
    ExcIEEE1968Type3XmlType.class,
    ExcIEEE1968Type2XmlType.class,
    ExcBPAFVXmlType.class,
    ExcBPAFUXmlType.class,
    ExcBPAFRXmlType.class,
    ExcIEEE2005TypeST3AXmlType.class,
    ExcBPAFQXmlType.class,
    ExcBPAFTXmlType.class,
    ExcBPAFSXmlType.class,
    ExcBPAFNXmlType.class,
    ExcBPAFMXmlType.class,
    ExcBPAFPXmlType.class,
    ExcBPAFOXmlType.class,
    ExcBPAFJXmlType.class,
    ExcBPAFKXmlType.class,
    ExcIEEE1992TypeAC1AXmlType.class,
    ExcBPAECXmlType.class,
    ExcIEEE1981TypeAC2XmlType.class,
    ExcIEEE1981TypeAC1XmlType.class,
    ExcTSATTypeEXC34XmlType.class,
    ExcIEEE1981ST1XmlType.class,
    ExcIEEE2005TypeST4BXmlType.class,
    ExcBPAEKXmlType.class,
    ExcIEEE1981TypeDC1XmlType.class,
    ExcIEEE1981TypeDC2XmlType.class,
    ExcIEEE1968Type1SXmlType.class,
    ExcIEEE1992TypeST1AXmlType.class
})
public class ExcSimpleTypeXmlType
    extends ExciterModelXmlType
{

    protected Double loadRc;
    protected Double loadXc;
    protected TimePeriodXmlType transTr;
    @XmlElement(name = "Ka")
    protected double ka;
    @XmlElement(name = "Ta", required = true)
    protected TimePeriodXmlType ta;
    @XmlElement(name = "Vrmax")
    protected double vrmax;
    @XmlElement(name = "Vrmin")
    protected double vrmin;

    /**
     * Gets the value of the loadRc property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLoadRc() {
        return loadRc;
    }

    /**
     * Sets the value of the loadRc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLoadRc(Double value) {
        this.loadRc = value;
    }

    /**
     * Gets the value of the loadXc property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLoadXc() {
        return loadXc;
    }

    /**
     * Sets the value of the loadXc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLoadXc(Double value) {
        this.loadXc = value;
    }

    /**
     * Gets the value of the transTr property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public TimePeriodXmlType getTransTr() {
        return transTr;
    }

    /**
     * Sets the value of the transTr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public void setTransTr(TimePeriodXmlType value) {
        this.transTr = value;
    }

    /**
     * Gets the value of the ka property.
     * 
     */
    public double getKa() {
        return ka;
    }

    /**
     * Sets the value of the ka property.
     * 
     */
    public void setKa(double value) {
        this.ka = value;
    }

    /**
     * Gets the value of the ta property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public TimePeriodXmlType getTa() {
        return ta;
    }

    /**
     * Sets the value of the ta property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public void setTa(TimePeriodXmlType value) {
        this.ta = value;
    }

    /**
     * Gets the value of the vrmax property.
     * 
     */
    public double getVrmax() {
        return vrmax;
    }

    /**
     * Sets the value of the vrmax property.
     * 
     */
    public void setVrmax(double value) {
        this.vrmax = value;
    }

    /**
     * Gets the value of the vrmin property.
     * 
     */
    public double getVrmin() {
        return vrmin;
    }

    /**
     * Sets the value of the vrmin property.
     * 
     */
    public void setVrmin(double value) {
        this.vrmin = value;
    }

}
