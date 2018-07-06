//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.05 at 10:46:24 PM PDT 
//


package org.ieee.odm.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			Data structure for defining line outage distribution factor.
 * 		
 * 
 * <p>Java class for LineOutageDFactorXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LineOutageDFactorXmlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outageType" type="{http://www.interpss.org/Schema/odm/2008}LODFOutageEnumType"/>
 *         &lt;element name="outageBranch" type="{http://www.ieee.org/odm/Schema/2008}BranchRefXmlType" maxOccurs="unbounded"/>
 *         &lt;element name="monitorBranch" type="{http://www.interpss.org/Schema/odm/2008}LODFMonitorBranchXmlType" maxOccurs="unbounded"/>
 *         &lt;element name="monitorInterface" type="{http://www.interpss.org/Schema/odm/2008}LODFMonitorInterfaceXmlType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineOutageDFactorXmlType", namespace = "http://www.interpss.org/Schema/odm/2008", propOrder = {
    "outageType",
    "outageBranch",
    "monitorBranch",
    "monitorInterface"
})
public class LineOutageDFactorXmlType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected LODFOutageEnumType outageType;
    @XmlElement(required = true)
    protected List<BranchRefXmlType> outageBranch;
    @XmlElement(required = true)
    protected List<LODFMonitorBranchXmlType> monitorBranch;
    protected List<LODFMonitorInterfaceXmlType> monitorInterface;

    /**
     * Gets the value of the outageType property.
     * 
     * @return
     *     possible object is
     *     {@link LODFOutageEnumType }
     *     
     */
    public LODFOutageEnumType getOutageType() {
        return outageType;
    }

    /**
     * Sets the value of the outageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LODFOutageEnumType }
     *     
     */
    public void setOutageType(LODFOutageEnumType value) {
        this.outageType = value;
    }

    /**
     * Gets the value of the outageBranch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outageBranch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutageBranch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BranchRefXmlType }
     * 
     * 
     */
    public List<BranchRefXmlType> getOutageBranch() {
        if (outageBranch == null) {
            outageBranch = new ArrayList<BranchRefXmlType>();
        }
        return this.outageBranch;
    }

    /**
     * Gets the value of the monitorBranch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monitorBranch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonitorBranch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LODFMonitorBranchXmlType }
     * 
     * 
     */
    public List<LODFMonitorBranchXmlType> getMonitorBranch() {
        if (monitorBranch == null) {
            monitorBranch = new ArrayList<LODFMonitorBranchXmlType>();
        }
        return this.monitorBranch;
    }

    /**
     * Gets the value of the monitorInterface property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monitorInterface property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonitorInterface().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LODFMonitorInterfaceXmlType }
     * 
     * 
     */
    public List<LODFMonitorInterfaceXmlType> getMonitorInterface() {
        if (monitorInterface == null) {
            monitorInterface = new ArrayList<LODFMonitorInterfaceXmlType>();
        }
        return this.monitorInterface;
    }

}
