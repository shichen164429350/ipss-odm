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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseOpfNetworkXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseOpfNetworkXmlType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ieee.org/odm/Schema/2008}LoadflowNetXmlType">
 *       &lt;sequence>
 *         &lt;element name="opfNetType" type="{http://www.ieee.org/odm/Schema/2008}OpfNetworkEnumType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseOpfNetworkXmlType", propOrder = {
    "opfNetType"
})
@XmlSeeAlso({
    OpfDclfNetworkXmlType.class,
    OpfNetworkXmlType.class
})
public abstract class BaseOpfNetworkXmlType
    extends LoadflowNetXmlType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected OpfNetworkEnumType opfNetType;

    /**
     * Gets the value of the opfNetType property.
     * 
     * @return
     *     possible object is
     *     {@link OpfNetworkEnumType }
     *     
     */
    public OpfNetworkEnumType getOpfNetType() {
        return opfNetType;
    }

    /**
     * Sets the value of the opfNetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpfNetworkEnumType }
     *     
     */
    public void setOpfNetType(OpfNetworkEnumType value) {
        this.opfNetType = value;
    }

}
