//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.06 at 11:22:51 PM PDT 
//


package org.ieee.odm.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScEquivSourceXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScEquivSourceXmlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="scMva3Phase" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="xOverR3Phase" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="scMva1Phase" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="xOverR1Phase" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScEquivSourceXmlType", propOrder = {
    "scMva3Phase",
    "xOverR3Phase",
    "scMva1Phase",
    "xOverR1Phase"
})
public class ScEquivSourceXmlType {

    protected double scMva3Phase;
    protected double xOverR3Phase;
    protected Double scMva1Phase;
    protected Double xOverR1Phase;

    /**
     * Gets the value of the scMva3Phase property.
     * 
     */
    public double getScMva3Phase() {
        return scMva3Phase;
    }

    /**
     * Sets the value of the scMva3Phase property.
     * 
     */
    public void setScMva3Phase(double value) {
        this.scMva3Phase = value;
    }

    /**
     * Gets the value of the xOverR3Phase property.
     * 
     */
    public double getXOverR3Phase() {
        return xOverR3Phase;
    }

    /**
     * Sets the value of the xOverR3Phase property.
     * 
     */
    public void setXOverR3Phase(double value) {
        this.xOverR3Phase = value;
    }

    /**
     * Gets the value of the scMva1Phase property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getScMva1Phase() {
        return scMva1Phase;
    }

    /**
     * Sets the value of the scMva1Phase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setScMva1Phase(Double value) {
        this.scMva1Phase = value;
    }

    /**
     * Gets the value of the xOverR1Phase property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getXOverR1Phase() {
        return xOverR1Phase;
    }

    /**
     * Sets the value of the xOverR1Phase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setXOverR1Phase(Double value) {
        this.xOverR1Phase = value;
    }

}
