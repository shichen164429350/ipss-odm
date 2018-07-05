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
 * <p>Java class for ExcIEEE2005TypeST4BXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExcIEEE2005TypeST4BXmlType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ieee.org/odm/Schema/2008}ExcSimpleTypeXmlType">
 *       &lt;sequence>
 *         &lt;element name="TR" type="{http://www.ieee.org/odm/Schema/2008}TimePeriodXmlType"/>
 *         &lt;element name="KPR" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="KIR" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="KPM" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="KIM" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="VMMAX" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="VMMIN" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="KG" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="KP" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="KI" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="VBMAX" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="KC" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="XL" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="THETAP" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExcIEEE2005TypeST4BXmlType", propOrder = {
    "tr",
    "kpr",
    "kir",
    "kpm",
    "kim",
    "vmmax",
    "vmmin",
    "kg",
    "kp",
    "ki",
    "vbmax",
    "kc",
    "xl",
    "thetap"
})
public class ExcIEEE2005TypeST4BXmlType
    extends ExcSimpleTypeXmlType
{

    @XmlElement(name = "TR", required = true)
    protected TimePeriodXmlType tr;
    @XmlElement(name = "KPR")
    protected Double kpr;
    @XmlElement(name = "KIR")
    protected Double kir;
    @XmlElement(name = "KPM")
    protected double kpm;
    @XmlElement(name = "KIM")
    protected double kim;
    @XmlElement(name = "VMMAX")
    protected double vmmax;
    @XmlElement(name = "VMMIN")
    protected double vmmin;
    @XmlElement(name = "KG")
    protected double kg;
    @XmlElement(name = "KP")
    protected double kp;
    @XmlElement(name = "KI")
    protected double ki;
    @XmlElement(name = "VBMAX")
    protected double vbmax;
    @XmlElement(name = "KC")
    protected double kc;
    @XmlElement(name = "XL")
    protected double xl;
    @XmlElement(name = "THETAP")
    protected double thetap;

    /**
     * Gets the value of the tr property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public TimePeriodXmlType getTR() {
        return tr;
    }

    /**
     * Sets the value of the tr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public void setTR(TimePeriodXmlType value) {
        this.tr = value;
    }

    /**
     * Gets the value of the kpr property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getKPR() {
        return kpr;
    }

    /**
     * Sets the value of the kpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setKPR(Double value) {
        this.kpr = value;
    }

    /**
     * Gets the value of the kir property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getKIR() {
        return kir;
    }

    /**
     * Sets the value of the kir property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setKIR(Double value) {
        this.kir = value;
    }

    /**
     * Gets the value of the kpm property.
     * 
     */
    public double getKPM() {
        return kpm;
    }

    /**
     * Sets the value of the kpm property.
     * 
     */
    public void setKPM(double value) {
        this.kpm = value;
    }

    /**
     * Gets the value of the kim property.
     * 
     */
    public double getKIM() {
        return kim;
    }

    /**
     * Sets the value of the kim property.
     * 
     */
    public void setKIM(double value) {
        this.kim = value;
    }

    /**
     * Gets the value of the vmmax property.
     * 
     */
    public double getVMMAX() {
        return vmmax;
    }

    /**
     * Sets the value of the vmmax property.
     * 
     */
    public void setVMMAX(double value) {
        this.vmmax = value;
    }

    /**
     * Gets the value of the vmmin property.
     * 
     */
    public double getVMMIN() {
        return vmmin;
    }

    /**
     * Sets the value of the vmmin property.
     * 
     */
    public void setVMMIN(double value) {
        this.vmmin = value;
    }

    /**
     * Gets the value of the kg property.
     * 
     */
    public double getKG() {
        return kg;
    }

    /**
     * Sets the value of the kg property.
     * 
     */
    public void setKG(double value) {
        this.kg = value;
    }

    /**
     * Gets the value of the kp property.
     * 
     */
    public double getKP() {
        return kp;
    }

    /**
     * Sets the value of the kp property.
     * 
     */
    public void setKP(double value) {
        this.kp = value;
    }

    /**
     * Gets the value of the ki property.
     * 
     */
    public double getKI() {
        return ki;
    }

    /**
     * Sets the value of the ki property.
     * 
     */
    public void setKI(double value) {
        this.ki = value;
    }

    /**
     * Gets the value of the vbmax property.
     * 
     */
    public double getVBMAX() {
        return vbmax;
    }

    /**
     * Sets the value of the vbmax property.
     * 
     */
    public void setVBMAX(double value) {
        this.vbmax = value;
    }

    /**
     * Gets the value of the kc property.
     * 
     */
    public double getKC() {
        return kc;
    }

    /**
     * Sets the value of the kc property.
     * 
     */
    public void setKC(double value) {
        this.kc = value;
    }

    /**
     * Gets the value of the xl property.
     * 
     */
    public double getXL() {
        return xl;
    }

    /**
     * Sets the value of the xl property.
     * 
     */
    public void setXL(double value) {
        this.xl = value;
    }

    /**
     * Gets the value of the thetap property.
     * 
     */
    public double getTHETAP() {
        return thetap;
    }

    /**
     * Sets the value of the thetap property.
     * 
     */
    public void setTHETAP(double value) {
        this.thetap = value;
    }

}
