//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.05 at 10:46:24 PM PDT 
//


package org.ieee.odm.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IncCostXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncCostXmlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="costModel" type="{http://www.ieee.org/odm/Schema/2008}CostModelEnumType"/>
 *         &lt;element name="pieceWiseLinearModel" type="{http://www.ieee.org/odm/Schema/2008}pieceWiseLinearModelXmlType" minOccurs="0"/>
 *         &lt;element name="quadraticModel" type="{http://www.ieee.org/odm/Schema/2008}quadraticModelXmlType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncCostXmlType", propOrder = {
    "costModel",
    "pieceWiseLinearModel",
    "quadraticModel"
})
public class IncCostXmlType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CostModelEnumType costModel;
    protected PieceWiseLinearModelXmlType pieceWiseLinearModel;
    protected QuadraticModelXmlType quadraticModel;

    /**
     * Gets the value of the costModel property.
     * 
     * @return
     *     possible object is
     *     {@link CostModelEnumType }
     *     
     */
    public CostModelEnumType getCostModel() {
        return costModel;
    }

    /**
     * Sets the value of the costModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostModelEnumType }
     *     
     */
    public void setCostModel(CostModelEnumType value) {
        this.costModel = value;
    }

    /**
     * Gets the value of the pieceWiseLinearModel property.
     * 
     * @return
     *     possible object is
     *     {@link PieceWiseLinearModelXmlType }
     *     
     */
    public PieceWiseLinearModelXmlType getPieceWiseLinearModel() {
        return pieceWiseLinearModel;
    }

    /**
     * Sets the value of the pieceWiseLinearModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PieceWiseLinearModelXmlType }
     *     
     */
    public void setPieceWiseLinearModel(PieceWiseLinearModelXmlType value) {
        this.pieceWiseLinearModel = value;
    }

    /**
     * Gets the value of the quadraticModel property.
     * 
     * @return
     *     possible object is
     *     {@link QuadraticModelXmlType }
     *     
     */
    public QuadraticModelXmlType getQuadraticModel() {
        return quadraticModel;
    }

    /**
     * Sets the value of the quadraticModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuadraticModelXmlType }
     *     
     */
    public void setQuadraticModel(QuadraticModelXmlType value) {
        this.quadraticModel = value;
    }

}
