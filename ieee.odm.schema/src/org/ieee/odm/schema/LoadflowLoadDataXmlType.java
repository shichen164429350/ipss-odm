//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.06 at 11:22:51 PM PDT 
//


package org.ieee.odm.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 		It is used to define LoadflowBusXmlType equivLoad and contribLoad list
 * 		
 * 
 * 
 * 				When code = FunctionLoad, the ZIP load units should be the same
 * 				
 * 
 * <p>Java class for LoadflowLoadDataXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadflowLoadDataXmlType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ieee.org/odm/Schema/2008}IDRecordXmlType">
 *       &lt;sequence>
 *         &lt;element name="constPLoad" type="{http://www.ieee.org/odm/Schema/2008}PowerXmlType" minOccurs="0"/>
 *         &lt;element name="constILoad" type="{http://www.ieee.org/odm/Schema/2008}PowerXmlType" minOccurs="0"/>
 *         &lt;element name="constZLoad" type="{http://www.ieee.org/odm/Schema/2008}PowerXmlType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="code" use="required" type="{http://www.ieee.org/odm/Schema/2008}LFLoadCodeEnumType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadflowLoadDataXmlType", propOrder = {
    "constPLoad",
    "constILoad",
    "constZLoad"
})
@XmlSeeAlso({
    ShortCircuitLoadDataXmlType.class
})
public class LoadflowLoadDataXmlType
    extends IDRecordXmlType
{

    protected PowerXmlType constPLoad;
    protected PowerXmlType constILoad;
    protected PowerXmlType constZLoad;
    @XmlAttribute(name = "code", required = true)
    protected LFLoadCodeEnumType code;

    /**
     * Gets the value of the constPLoad property.
     * 
     * @return
     *     possible object is
     *     {@link PowerXmlType }
     *     
     */
    public PowerXmlType getConstPLoad() {
        return constPLoad;
    }

    /**
     * Sets the value of the constPLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerXmlType }
     *     
     */
    public void setConstPLoad(PowerXmlType value) {
        this.constPLoad = value;
    }

    /**
     * Gets the value of the constILoad property.
     * 
     * @return
     *     possible object is
     *     {@link PowerXmlType }
     *     
     */
    public PowerXmlType getConstILoad() {
        return constILoad;
    }

    /**
     * Sets the value of the constILoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerXmlType }
     *     
     */
    public void setConstILoad(PowerXmlType value) {
        this.constILoad = value;
    }

    /**
     * Gets the value of the constZLoad property.
     * 
     * @return
     *     possible object is
     *     {@link PowerXmlType }
     *     
     */
    public PowerXmlType getConstZLoad() {
        return constZLoad;
    }

    /**
     * Sets the value of the constZLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerXmlType }
     *     
     */
    public void setConstZLoad(PowerXmlType value) {
        this.constZLoad = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link LFLoadCodeEnumType }
     *     
     */
    public LFLoadCodeEnumType getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link LFLoadCodeEnumType }
     *     
     */
    public void setCode(LFLoadCodeEnumType value) {
        this.code = value;
    }

}
