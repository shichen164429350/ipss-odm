//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.06 at 07:48:32 PM CST 
//


package org.ieee.odm.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EDGenItemXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EDGenItemXmlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="genName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="busId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="genMW" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="mustRun" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EDGenItemXmlType", namespace = "http://www.interpss.org/Schema/odm/2008")
public class EDGenItemXmlType {

    @XmlAttribute(name = "genName")
    protected String genName;
    @XmlAttribute(name = "busId")
    protected String busId;
    @XmlAttribute(name = "genMW")
    protected Double genMW;
    @XmlAttribute(name = "mustRun")
    protected Boolean mustRun;

    /**
     * Gets the value of the genName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenName() {
        return genName;
    }

    /**
     * Sets the value of the genName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenName(String value) {
        this.genName = value;
    }

    /**
     * Gets the value of the busId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusId() {
        return busId;
    }

    /**
     * Sets the value of the busId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusId(String value) {
        this.busId = value;
    }

    /**
     * Gets the value of the genMW property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGenMW() {
        return genMW;
    }

    /**
     * Sets the value of the genMW property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGenMW(Double value) {
        this.genMW = value;
    }

    /**
     * Gets the value of the mustRun property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMustRun() {
        return mustRun;
    }

    /**
     * Sets the value of the mustRun property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMustRun(Boolean value) {
        this.mustRun = value;
    }

}
