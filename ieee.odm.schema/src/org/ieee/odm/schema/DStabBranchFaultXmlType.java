//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.09 at 11:05:44 AM CST 
//


package org.ieee.odm.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DStabBranchFaultXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DStabBranchFaultXmlType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ieee.org/odm/Schema/2008}BaseDStabFaultXmlType">
 *       &lt;sequence>
 *         &lt;element name="fromBus" type="{http://www.ieee.org/odm/Schema/2008}IDRefRecordXmlType"/>
 *         &lt;element name="toBus" type="{http://www.ieee.org/odm/Schema/2008}IDRefRecordXmlType" minOccurs="0"/>
 *         &lt;element name="faultedCirId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fromBusRatedV" type="{http://www.ieee.org/odm/Schema/2008}VoltageXmlType" minOccurs="0"/>
 *         &lt;element name="toBusRatedV" type="{http://www.ieee.org/odm/Schema/2008}VoltageXmlType" minOccurs="0"/>
 *         &lt;element name="faultLocationFromFromSide" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DStabBranchFaultXmlType", propOrder = {
    "fromBus",
    "toBus",
    "faultedCirId",
    "fromBusRatedV",
    "toBusRatedV",
    "faultLocationFromFromSide"
})
public class DStabBranchFaultXmlType
    extends BaseDStabFaultXmlType
{

    @XmlElement(required = true)
    protected IDRefRecordXmlType fromBus;
    protected IDRefRecordXmlType toBus;
    protected List<String> faultedCirId;
    protected VoltageXmlType fromBusRatedV;
    protected VoltageXmlType toBusRatedV;
    protected Double faultLocationFromFromSide;

    /**
     * Gets the value of the fromBus property.
     * 
     * @return
     *     possible object is
     *     {@link IDRefRecordXmlType }
     *     
     */
    public IDRefRecordXmlType getFromBus() {
        return fromBus;
    }

    /**
     * Sets the value of the fromBus property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDRefRecordXmlType }
     *     
     */
    public void setFromBus(IDRefRecordXmlType value) {
        this.fromBus = value;
    }

    /**
     * Gets the value of the toBus property.
     * 
     * @return
     *     possible object is
     *     {@link IDRefRecordXmlType }
     *     
     */
    public IDRefRecordXmlType getToBus() {
        return toBus;
    }

    /**
     * Sets the value of the toBus property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDRefRecordXmlType }
     *     
     */
    public void setToBus(IDRefRecordXmlType value) {
        this.toBus = value;
    }

    /**
     * Gets the value of the faultedCirId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the faultedCirId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFaultedCirId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFaultedCirId() {
        if (faultedCirId == null) {
            faultedCirId = new ArrayList<String>();
        }
        return this.faultedCirId;
    }

    /**
     * Gets the value of the fromBusRatedV property.
     * 
     * @return
     *     possible object is
     *     {@link VoltageXmlType }
     *     
     */
    public VoltageXmlType getFromBusRatedV() {
        return fromBusRatedV;
    }

    /**
     * Sets the value of the fromBusRatedV property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoltageXmlType }
     *     
     */
    public void setFromBusRatedV(VoltageXmlType value) {
        this.fromBusRatedV = value;
    }

    /**
     * Gets the value of the toBusRatedV property.
     * 
     * @return
     *     possible object is
     *     {@link VoltageXmlType }
     *     
     */
    public VoltageXmlType getToBusRatedV() {
        return toBusRatedV;
    }

    /**
     * Sets the value of the toBusRatedV property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoltageXmlType }
     *     
     */
    public void setToBusRatedV(VoltageXmlType value) {
        this.toBusRatedV = value;
    }

    /**
     * Gets the value of the faultLocationFromFromSide property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFaultLocationFromFromSide() {
        return faultLocationFromFromSide;
    }

    /**
     * Sets the value of the faultLocationFromFromSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFaultLocationFromFromSide(Double value) {
        this.faultLocationFromFromSide = value;
    }

}
