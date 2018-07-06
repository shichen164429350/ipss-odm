//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.05 at 10:46:24 PM PDT 
//


package org.ieee.odm.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NodeTransferAnalysisXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeTransferAnalysisXmlType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.interpss.org/Schema/odm/2008}DclfBranchSensitivityXmlType">
 *       &lt;sequence>
 *         &lt;element name="transderAmountMW" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="deratingFactor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeTransferAnalysisXmlType", namespace = "http://www.interpss.org/Schema/odm/2008", propOrder = {
    "transderAmountMW",
    "deratingFactor"
})
@XmlSeeAlso({
    AreaTransferAnalysisXmlType.class
})
public class NodeTransferAnalysisXmlType
    extends DclfBranchSensitivityXmlType
{

    protected double transderAmountMW;
    protected Double deratingFactor;

    /**
     * Gets the value of the transderAmountMW property.
     * 
     */
    public double getTransderAmountMW() {
        return transderAmountMW;
    }

    /**
     * Sets the value of the transderAmountMW property.
     * 
     */
    public void setTransderAmountMW(double value) {
        this.transderAmountMW = value;
    }

    /**
     * Gets the value of the deratingFactor property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDeratingFactor() {
        return deratingFactor;
    }

    /**
     * Sets the value of the deratingFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDeratingFactor(Double value) {
        this.deratingFactor = value;
    }

}
