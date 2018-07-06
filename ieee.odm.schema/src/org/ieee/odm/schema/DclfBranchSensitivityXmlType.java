//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.06 at 07:48:32 PM CST 
//


package org.ieee.odm.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			Data structure for defining branch sensitivity calculation. It is used, for example,
 * 			for defining GSF calculation.
 * 		
 * 
 * <p>Java class for DclfBranchSensitivityXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DclfBranchSensitivityXmlType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.interpss.org/Schema/odm/2008}DclfSensitivityXmlType">
 *       &lt;sequence>
 *         &lt;element name="branchSFactor" type="{http://www.interpss.org/Schema/odm/2008}BranchShiftFactorXmlType" maxOccurs="unbounded"/>
 *         &lt;element name="interfaceSFactor" type="{http://www.interpss.org/Schema/odm/2008}InterfaceShiftFactorXmlType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DclfBranchSensitivityXmlType", namespace = "http://www.interpss.org/Schema/odm/2008", propOrder = {
    "branchSFactor",
    "interfaceSFactor"
})
@XmlSeeAlso({
    NodeTransferAnalysisXmlType.class
})
public class DclfBranchSensitivityXmlType
    extends DclfSensitivityXmlType
{

    @XmlElement(required = true)
    protected List<BranchShiftFactorXmlType> branchSFactor;
    protected List<InterfaceShiftFactorXmlType> interfaceSFactor;

    /**
     * Gets the value of the branchSFactor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the branchSFactor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBranchSFactor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BranchShiftFactorXmlType }
     * 
     * 
     */
    public List<BranchShiftFactorXmlType> getBranchSFactor() {
        if (branchSFactor == null) {
            branchSFactor = new ArrayList<BranchShiftFactorXmlType>();
        }
        return this.branchSFactor;
    }

    /**
     * Gets the value of the interfaceSFactor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interfaceSFactor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterfaceSFactor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterfaceShiftFactorXmlType }
     * 
     * 
     */
    public List<InterfaceShiftFactorXmlType> getInterfaceSFactor() {
        if (interfaceSFactor == null) {
            interfaceSFactor = new ArrayList<InterfaceShiftFactorXmlType>();
        }
        return this.interfaceSFactor;
    }

}
