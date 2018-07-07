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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DynamicLoadInductionMotorCIM5XmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DynamicLoadInductionMotorCIM5XmlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="modelDesc" type="{http://www.ieee.org/odm/Schema/2008}DynamicLoadEnumType" minOccurs="0"/>
 *         &lt;element name="RA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="XA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="XM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="R1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="X1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="R2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="X2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="E1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="SE1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="E2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="SE2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MBASE" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PMULT" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="H" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VI" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TI" type="{http://www.ieee.org/odm/Schema/2008}TimePeriodXmlType"/>
 *         &lt;element name="TB" type="{http://www.ieee.org/odm/Schema/2008}TimePeriodXmlType"/>
 *         &lt;element name="D" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Tnom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DynamicLoadInductionMotorCIM5XmlType", propOrder = {
    "modelDesc",
    "ra",
    "xa",
    "xm",
    "r1",
    "x1",
    "r2",
    "x2",
    "e1",
    "se1",
    "e2",
    "se2",
    "mbase",
    "pmult",
    "h",
    "vi",
    "ti",
    "tb",
    "d",
    "tnom"
})
public class DynamicLoadInductionMotorCIM5XmlType {

    @XmlSchemaType(name = "string")
    protected DynamicLoadEnumType modelDesc;
    @XmlElement(name = "RA", required = true)
    protected String ra;
    @XmlElement(name = "XA", required = true)
    protected String xa;
    @XmlElement(name = "XM", required = true)
    protected String xm;
    @XmlElement(name = "R1", required = true)
    protected String r1;
    @XmlElement(name = "X1", required = true)
    protected String x1;
    @XmlElement(name = "R2", required = true)
    protected String r2;
    @XmlElement(name = "X2", required = true)
    protected String x2;
    @XmlElement(name = "E1")
    protected double e1;
    @XmlElement(name = "SE1")
    protected double se1;
    @XmlElement(name = "E2")
    protected double e2;
    @XmlElement(name = "SE2")
    protected double se2;
    @XmlElement(name = "MBASE")
    protected double mbase;
    @XmlElement(name = "PMULT")
    protected double pmult;
    @XmlElement(name = "H", required = true)
    protected String h;
    @XmlElement(name = "VI", required = true)
    protected String vi;
    @XmlElement(name = "TI", required = true)
    protected TimePeriodXmlType ti;
    @XmlElement(name = "TB", required = true)
    protected TimePeriodXmlType tb;
    @XmlElement(name = "D")
    protected double d;
    @XmlElement(name = "Tnom")
    protected String tnom;

    /**
     * Gets the value of the modelDesc property.
     * 
     * @return
     *     possible object is
     *     {@link DynamicLoadEnumType }
     *     
     */
    public DynamicLoadEnumType getModelDesc() {
        return modelDesc;
    }

    /**
     * Sets the value of the modelDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicLoadEnumType }
     *     
     */
    public void setModelDesc(DynamicLoadEnumType value) {
        this.modelDesc = value;
    }

    /**
     * Gets the value of the ra property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRA() {
        return ra;
    }

    /**
     * Sets the value of the ra property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRA(String value) {
        this.ra = value;
    }

    /**
     * Gets the value of the xa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXA() {
        return xa;
    }

    /**
     * Sets the value of the xa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXA(String value) {
        this.xa = value;
    }

    /**
     * Gets the value of the xm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXM() {
        return xm;
    }

    /**
     * Sets the value of the xm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXM(String value) {
        this.xm = value;
    }

    /**
     * Gets the value of the r1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getR1() {
        return r1;
    }

    /**
     * Sets the value of the r1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setR1(String value) {
        this.r1 = value;
    }

    /**
     * Gets the value of the x1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX1() {
        return x1;
    }

    /**
     * Sets the value of the x1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX1(String value) {
        this.x1 = value;
    }

    /**
     * Gets the value of the r2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getR2() {
        return r2;
    }

    /**
     * Sets the value of the r2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setR2(String value) {
        this.r2 = value;
    }

    /**
     * Gets the value of the x2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX2() {
        return x2;
    }

    /**
     * Sets the value of the x2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX2(String value) {
        this.x2 = value;
    }

    /**
     * Gets the value of the e1 property.
     * 
     */
    public double getE1() {
        return e1;
    }

    /**
     * Sets the value of the e1 property.
     * 
     */
    public void setE1(double value) {
        this.e1 = value;
    }

    /**
     * Gets the value of the se1 property.
     * 
     */
    public double getSE1() {
        return se1;
    }

    /**
     * Sets the value of the se1 property.
     * 
     */
    public void setSE1(double value) {
        this.se1 = value;
    }

    /**
     * Gets the value of the e2 property.
     * 
     */
    public double getE2() {
        return e2;
    }

    /**
     * Sets the value of the e2 property.
     * 
     */
    public void setE2(double value) {
        this.e2 = value;
    }

    /**
     * Gets the value of the se2 property.
     * 
     */
    public double getSE2() {
        return se2;
    }

    /**
     * Sets the value of the se2 property.
     * 
     */
    public void setSE2(double value) {
        this.se2 = value;
    }

    /**
     * Gets the value of the mbase property.
     * 
     */
    public double getMBASE() {
        return mbase;
    }

    /**
     * Sets the value of the mbase property.
     * 
     */
    public void setMBASE(double value) {
        this.mbase = value;
    }

    /**
     * Gets the value of the pmult property.
     * 
     */
    public double getPMULT() {
        return pmult;
    }

    /**
     * Sets the value of the pmult property.
     * 
     */
    public void setPMULT(double value) {
        this.pmult = value;
    }

    /**
     * Gets the value of the h property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getH() {
        return h;
    }

    /**
     * Sets the value of the h property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setH(String value) {
        this.h = value;
    }

    /**
     * Gets the value of the vi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVI() {
        return vi;
    }

    /**
     * Sets the value of the vi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVI(String value) {
        this.vi = value;
    }

    /**
     * Gets the value of the ti property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public TimePeriodXmlType getTI() {
        return ti;
    }

    /**
     * Sets the value of the ti property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public void setTI(TimePeriodXmlType value) {
        this.ti = value;
    }

    /**
     * Gets the value of the tb property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public TimePeriodXmlType getTB() {
        return tb;
    }

    /**
     * Sets the value of the tb property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public void setTB(TimePeriodXmlType value) {
        this.tb = value;
    }

    /**
     * Gets the value of the d property.
     * 
     */
    public double getD() {
        return d;
    }

    /**
     * Sets the value of the d property.
     * 
     */
    public void setD(double value) {
        this.d = value;
    }

    /**
     * Gets the value of the tnom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTnom() {
        return tnom;
    }

    /**
     * Sets the value of the tnom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTnom(String value) {
        this.tnom = value;
    }

}
