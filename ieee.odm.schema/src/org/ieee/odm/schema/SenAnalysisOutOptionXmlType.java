//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.05 at 10:46:24 PM PDT 
//


package org.ieee.odm.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SenAnalysisOutOptionXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SenAnalysisOutOptionXmlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allBranchPoints" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="allInterfacePoints" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SenAnalysisOutOptionXmlType", namespace = "http://www.interpss.org/Schema/odm/2008", propOrder = {
    "allBranchPoints",
    "allInterfacePoints"
})
public class SenAnalysisOutOptionXmlType {

    protected Integer allBranchPoints;
    protected Integer allInterfacePoints;

    /**
     * Gets the value of the allBranchPoints property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAllBranchPoints() {
        return allBranchPoints;
    }

    /**
     * Sets the value of the allBranchPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAllBranchPoints(Integer value) {
        this.allBranchPoints = value;
    }

    /**
     * Gets the value of the allInterfacePoints property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAllInterfacePoints() {
        return allInterfacePoints;
    }

    /**
     * Sets the value of the allInterfacePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAllInterfacePoints(Integer value) {
        this.allInterfacePoints = value;
    }

}
