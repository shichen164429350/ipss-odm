//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.06 at 11:22:51 PM PDT 
//


package org.ieee.odm.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PVModuleXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PVModuleXmlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pvModuleItem" type="{http://www.ieee.org/odm/Schema/2008}PVModuleItemXmlType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="dataType" use="required" type="{http://www.ieee.org/odm/Schema/2008}PVModuleDataEnumType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PVModuleXmlType", propOrder = {
    "pvModuleItem"
})
public class PVModuleXmlType {

    @XmlElement(required = true)
    protected List<PVModuleItemXmlType> pvModuleItem;
    @XmlAttribute(name = "dataType", required = true)
    protected PVModuleDataEnumType dataType;

    /**
     * Gets the value of the pvModuleItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pvModuleItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPvModuleItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PVModuleItemXmlType }
     * 
     * 
     */
    public List<PVModuleItemXmlType> getPvModuleItem() {
        if (pvModuleItem == null) {
            pvModuleItem = new ArrayList<PVModuleItemXmlType>();
        }
        return this.pvModuleItem;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link PVModuleDataEnumType }
     *     
     */
    public PVModuleDataEnumType getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PVModuleDataEnumType }
     *     
     */
    public void setDataType(PVModuleDataEnumType value) {
        this.dataType = value;
    }

}
