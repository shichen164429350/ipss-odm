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
 * <p>Java class for PssBpaSgTypeXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PssBpaSgTypeXmlType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ieee.org/odm/Schema/2008}StabilizerModelXmlType">
 *       &lt;sequence>
 *         &lt;element name="KQV" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TQV" type="{http://www.ieee.org/odm/Schema/2008}TimePeriodXmlType"/>
 *         &lt;element name="KQS" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TQS" type="{http://www.ieee.org/odm/Schema/2008}TimePeriodXmlType"/>
 *         &lt;element name="TQ" type="{http://www.ieee.org/odm/Schema/2008}TimePeriodXmlType"/>
 *         &lt;element name="TQ1" type="{http://www.ieee.org/odm/Schema/2008}TimePeriodXmlType"/>
 *         &lt;element name="T1Q1" type="{http://www.ieee.org/odm/Schema/2008}TimePeriodXmlType"/>
 *         &lt;element name="TQ2" type="{http://www.ieee.org/odm/Schema/2008}TimePeriodXmlType"/>
 *         &lt;element name="T1Q2" type="{http://www.ieee.org/odm/Schema/2008}TimePeriodXmlType"/>
 *         &lt;element name="TQ3" type="{http://www.ieee.org/odm/Schema/2008}TimePeriodXmlType"/>
 *         &lt;element name="T1Q3" type="{http://www.ieee.org/odm/Schema/2008}TimePeriodXmlType"/>
 *         &lt;element name="VSMAX" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="VSMIN" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="VCUTOFF" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PssBpaSgTypeXmlType", propOrder = {
    "kqv",
    "tqv",
    "kqs",
    "tqs",
    "tq",
    "tq1",
    "t1Q1",
    "tq2",
    "t1Q2",
    "tq3",
    "t1Q3",
    "vsmax",
    "vsmin",
    "vcutoff"
})
public class PssBpaSgTypeXmlType
    extends StabilizerModelXmlType
{

    @XmlElement(name = "KQV")
    protected double kqv;
    @XmlElement(name = "TQV", required = true)
    protected TimePeriodXmlType tqv;
    @XmlElement(name = "KQS")
    protected double kqs;
    @XmlElement(name = "TQS", required = true)
    protected TimePeriodXmlType tqs;
    @XmlElement(name = "TQ", required = true)
    protected TimePeriodXmlType tq;
    @XmlElement(name = "TQ1", required = true)
    protected TimePeriodXmlType tq1;
    @XmlElement(name = "T1Q1", required = true)
    protected TimePeriodXmlType t1Q1;
    @XmlElement(name = "TQ2", required = true)
    protected TimePeriodXmlType tq2;
    @XmlElement(name = "T1Q2", required = true)
    protected TimePeriodXmlType t1Q2;
    @XmlElement(name = "TQ3", required = true)
    protected TimePeriodXmlType tq3;
    @XmlElement(name = "T1Q3", required = true)
    protected TimePeriodXmlType t1Q3;
    @XmlElement(name = "VSMAX")
    protected double vsmax;
    @XmlElement(name = "VSMIN")
    protected double vsmin;
    @XmlElement(name = "VCUTOFF")
    protected double vcutoff;

    /**
     * Gets the value of the kqv property.
     * 
     */
    public double getKQV() {
        return kqv;
    }

    /**
     * Sets the value of the kqv property.
     * 
     */
    public void setKQV(double value) {
        this.kqv = value;
    }

    /**
     * Gets the value of the tqv property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public TimePeriodXmlType getTQV() {
        return tqv;
    }

    /**
     * Sets the value of the tqv property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public void setTQV(TimePeriodXmlType value) {
        this.tqv = value;
    }

    /**
     * Gets the value of the kqs property.
     * 
     */
    public double getKQS() {
        return kqs;
    }

    /**
     * Sets the value of the kqs property.
     * 
     */
    public void setKQS(double value) {
        this.kqs = value;
    }

    /**
     * Gets the value of the tqs property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public TimePeriodXmlType getTQS() {
        return tqs;
    }

    /**
     * Sets the value of the tqs property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public void setTQS(TimePeriodXmlType value) {
        this.tqs = value;
    }

    /**
     * Gets the value of the tq property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public TimePeriodXmlType getTQ() {
        return tq;
    }

    /**
     * Sets the value of the tq property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public void setTQ(TimePeriodXmlType value) {
        this.tq = value;
    }

    /**
     * Gets the value of the tq1 property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public TimePeriodXmlType getTQ1() {
        return tq1;
    }

    /**
     * Sets the value of the tq1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public void setTQ1(TimePeriodXmlType value) {
        this.tq1 = value;
    }

    /**
     * Gets the value of the t1Q1 property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public TimePeriodXmlType getT1Q1() {
        return t1Q1;
    }

    /**
     * Sets the value of the t1Q1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public void setT1Q1(TimePeriodXmlType value) {
        this.t1Q1 = value;
    }

    /**
     * Gets the value of the tq2 property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public TimePeriodXmlType getTQ2() {
        return tq2;
    }

    /**
     * Sets the value of the tq2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public void setTQ2(TimePeriodXmlType value) {
        this.tq2 = value;
    }

    /**
     * Gets the value of the t1Q2 property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public TimePeriodXmlType getT1Q2() {
        return t1Q2;
    }

    /**
     * Sets the value of the t1Q2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public void setT1Q2(TimePeriodXmlType value) {
        this.t1Q2 = value;
    }

    /**
     * Gets the value of the tq3 property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public TimePeriodXmlType getTQ3() {
        return tq3;
    }

    /**
     * Sets the value of the tq3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public void setTQ3(TimePeriodXmlType value) {
        this.tq3 = value;
    }

    /**
     * Gets the value of the t1Q3 property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public TimePeriodXmlType getT1Q3() {
        return t1Q3;
    }

    /**
     * Sets the value of the t1Q3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public void setT1Q3(TimePeriodXmlType value) {
        this.t1Q3 = value;
    }

    /**
     * Gets the value of the vsmax property.
     * 
     */
    public double getVSMAX() {
        return vsmax;
    }

    /**
     * Sets the value of the vsmax property.
     * 
     */
    public void setVSMAX(double value) {
        this.vsmax = value;
    }

    /**
     * Gets the value of the vsmin property.
     * 
     */
    public double getVSMIN() {
        return vsmin;
    }

    /**
     * Sets the value of the vsmin property.
     * 
     */
    public void setVSMIN(double value) {
        this.vsmin = value;
    }

    /**
     * Gets the value of the vcutoff property.
     * 
     */
    public double getVCUTOFF() {
        return vcutoff;
    }

    /**
     * Sets the value of the vcutoff property.
     * 
     */
    public void setVCUTOFF(double value) {
        this.vcutoff = value;
    }

}
