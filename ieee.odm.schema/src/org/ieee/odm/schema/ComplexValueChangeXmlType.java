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
 * <p>Java class for ComplexValueChangeXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComplexValueChangeXmlType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ieee.org/odm/Schema/2008}ValueChangeXmlType">
 *       &lt;sequence>
 *         &lt;element name="value" type="{http://www.ieee.org/odm/Schema/2008}ComplexXmlType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComplexValueChangeXmlType", propOrder = {
    "value"
})
public class ComplexValueChangeXmlType
    extends ValueChangeXmlType
{

    protected ComplexXmlType value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexXmlType }
     *     
     */
    public ComplexXmlType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexXmlType }
     *     
     */
    public void setValue(ComplexXmlType value) {
        this.value = value;
    }

}
