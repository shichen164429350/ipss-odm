//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.06 at 11:22:51 PM PDT 
//


package org.ieee.odm.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LODFMonitorBranchXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LODFMonitorBranchXmlType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.interpss.org/Schema/odm/2008}LODFMonitorBaseXmlType">
 *       &lt;sequence>
 *         &lt;element name="branch" type="{http://www.ieee.org/odm/Schema/2008}BranchRefXmlType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LODFMonitorBranchXmlType", namespace = "http://www.interpss.org/Schema/odm/2008", propOrder = {
    "branch"
})
public class LODFMonitorBranchXmlType
    extends LODFMonitorBaseXmlType
{

    @XmlElement(required = true)
    protected BranchRefXmlType branch;

    /**
     * Gets the value of the branch property.
     * 
     * @return
     *     possible object is
     *     {@link BranchRefXmlType }
     *     
     */
    public BranchRefXmlType getBranch() {
        return branch;
    }

    /**
     * Sets the value of the branch property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchRefXmlType }
     *     
     */
    public void setBranch(BranchRefXmlType value) {
        this.branch = value;
    }

}
