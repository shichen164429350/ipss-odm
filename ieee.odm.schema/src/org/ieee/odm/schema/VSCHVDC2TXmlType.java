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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VSCHVDC2TXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VSCHVDC2TXmlType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ieee.org/odm/Schema/2008}BaseBranchXmlType">
 *       &lt;sequence>
 *         &lt;element name="Rdc" type="{http://www.ieee.org/odm/Schema/2008}RXmlType"/>
 *         &lt;element name="MVARating" type="{http://www.ieee.org/odm/Schema/2008}ApparentPowerXmlType" minOccurs="0"/>
 *         &lt;element name="rectifier" type="{http://www.ieee.org/odm/Schema/2008}VSCConverterXmlType"/>
 *         &lt;element name="inverter" type="{http://www.ieee.org/odm/Schema/2008}VSCConverterXmlType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VSCHVDC2TXmlType", propOrder = {
    "rdc",
    "mvaRating",
    "rectifier",
    "inverter"
})
public class VSCHVDC2TXmlType
    extends BaseBranchXmlType
{

    @XmlElement(name = "Rdc", required = true)
    protected RXmlType rdc;
    @XmlElement(name = "MVARating")
    protected ApparentPowerXmlType mvaRating;
    @XmlElement(required = true)
    protected VSCConverterXmlType rectifier;
    @XmlElement(required = true)
    protected VSCConverterXmlType inverter;

    /**
     * Gets the value of the rdc property.
     * 
     * @return
     *     possible object is
     *     {@link RXmlType }
     *     
     */
    public RXmlType getRdc() {
        return rdc;
    }

    /**
     * Sets the value of the rdc property.
     * 
     * @param value
     *     allowed object is
     *     {@link RXmlType }
     *     
     */
    public void setRdc(RXmlType value) {
        this.rdc = value;
    }

    /**
     * Gets the value of the mvaRating property.
     * 
     * @return
     *     possible object is
     *     {@link ApparentPowerXmlType }
     *     
     */
    public ApparentPowerXmlType getMVARating() {
        return mvaRating;
    }

    /**
     * Sets the value of the mvaRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApparentPowerXmlType }
     *     
     */
    public void setMVARating(ApparentPowerXmlType value) {
        this.mvaRating = value;
    }

    /**
     * Gets the value of the rectifier property.
     * 
     * @return
     *     possible object is
     *     {@link VSCConverterXmlType }
     *     
     */
    public VSCConverterXmlType getRectifier() {
        return rectifier;
    }

    /**
     * Sets the value of the rectifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link VSCConverterXmlType }
     *     
     */
    public void setRectifier(VSCConverterXmlType value) {
        this.rectifier = value;
    }

    /**
     * Gets the value of the inverter property.
     * 
     * @return
     *     possible object is
     *     {@link VSCConverterXmlType }
     *     
     */
    public VSCConverterXmlType getInverter() {
        return inverter;
    }

    /**
     * Sets the value of the inverter property.
     * 
     * @param value
     *     allowed object is
     *     {@link VSCConverterXmlType }
     *     
     */
    public void setInverter(VSCConverterXmlType value) {
        this.inverter = value;
    }

}
