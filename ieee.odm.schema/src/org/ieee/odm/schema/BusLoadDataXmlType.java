//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.06 at 07:48:32 PM CST 
//


package org.ieee.odm.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusLoadDataXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusLoadDataXmlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ieee.org/odm/Schema/2008}contributeLoad" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusLoadDataXmlType", propOrder = {
    "contributeLoad"
})
public class BusLoadDataXmlType {

    @XmlElementRef(name = "contributeLoad", namespace = "http://www.ieee.org/odm/Schema/2008", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends LoadflowLoadDataXmlType>> contributeLoad;

    /**
     * Gets the value of the contributeLoad property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contributeLoad property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContributeLoad().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DStabLoadDataXmlType }{@code >}
     * {@link JAXBElement }{@code <}{@link LoadflowLoadDataXmlType }{@code >}
     * {@link JAXBElement }{@code <}{@link ShortCircuitLoadDataXmlType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends LoadflowLoadDataXmlType>> getContributeLoad() {
        if (contributeLoad == null) {
            contributeLoad = new ArrayList<JAXBElement<? extends LoadflowLoadDataXmlType>>();
        }
        return this.contributeLoad;
    }

}
