//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.05 at 10:46:24 PM PDT 
//


package org.ieee.odm.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 		SC Bus with Aclf info
 * 		
 * 
 * <p>Java class for ShortCircuitBusXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShortCircuitBusXmlType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ieee.org/odm/Schema/2008}LoadflowBusXmlType">
 *       &lt;sequence>
 *         &lt;element name="swithedShuntLoadZeroY" type="{http://www.ieee.org/odm/Schema/2008}YXmlType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="scCode" type="{http://www.ieee.org/odm/Schema/2008}ShortCircuitBusEnumType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShortCircuitBusXmlType", propOrder = {
    "swithedShuntLoadZeroY"
})
@XmlSeeAlso({
    DStabBusXmlType.class
})
public class ShortCircuitBusXmlType
    extends LoadflowBusXmlType
{

    protected YXmlType swithedShuntLoadZeroY;
    @XmlAttribute(name = "scCode")
    protected ShortCircuitBusEnumType scCode;

    /**
     * Gets the value of the swithedShuntLoadZeroY property.
     * 
     * @return
     *     possible object is
     *     {@link YXmlType }
     *     
     */
    public YXmlType getSwithedShuntLoadZeroY() {
        return swithedShuntLoadZeroY;
    }

    /**
     * Sets the value of the swithedShuntLoadZeroY property.
     * 
     * @param value
     *     allowed object is
     *     {@link YXmlType }
     *     
     */
    public void setSwithedShuntLoadZeroY(YXmlType value) {
        this.swithedShuntLoadZeroY = value;
    }

    /**
     * Gets the value of the scCode property.
     * 
     * @return
     *     possible object is
     *     {@link ShortCircuitBusEnumType }
     *     
     */
    public ShortCircuitBusEnumType getScCode() {
        return scCode;
    }

    /**
     * Sets the value of the scCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShortCircuitBusEnumType }
     *     
     */
    public void setScCode(ShortCircuitBusEnumType value) {
        this.scCode = value;
    }

}
