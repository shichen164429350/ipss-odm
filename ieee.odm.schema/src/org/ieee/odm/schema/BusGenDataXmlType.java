//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.06 at 11:22:51 PM PDT 
//


package org.ieee.odm.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusGenDataXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusGenDataXmlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ieee.org/odm/Schema/2008}contributeGen" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="code" use="required" type="{http://www.ieee.org/odm/Schema/2008}LFGenCodeEnumType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusGenDataXmlType", propOrder = {
    "contributeGen"
})
public class BusGenDataXmlType {

    @XmlElementRef(name = "contributeGen", namespace = "http://www.ieee.org/odm/Schema/2008", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends LoadflowGenDataXmlType>> contributeGen;
    @XmlAttribute(name = "code", required = true)
    protected LFGenCodeEnumType code;

    /**
     * Gets the value of the contributeGen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contributeGen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContributeGen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DStabGenDataXmlType }{@code >}
     * {@link JAXBElement }{@code <}{@link LoadflowGenDataXmlType }{@code >}
     * {@link JAXBElement }{@code <}{@link ShortCircuitGenDataXmlType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends LoadflowGenDataXmlType>> getContributeGen() {
        if (contributeGen == null) {
            contributeGen = new ArrayList<JAXBElement<? extends LoadflowGenDataXmlType>>();
        }
        return this.contributeGen;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link LFGenCodeEnumType }
     *     
     */
    public LFGenCodeEnumType getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link LFGenCodeEnumType }
     *     
     */
    public void setCode(LFGenCodeEnumType value) {
        this.code = value;
    }

}
