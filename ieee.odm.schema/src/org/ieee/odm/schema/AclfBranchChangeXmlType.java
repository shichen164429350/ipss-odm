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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AclfBranchChangeXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AclfBranchChangeXmlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="branchZChange" type="{http://www.ieee.org/odm/Schema/2008}ComplexValueChangeXmlType" minOccurs="0"/>
 *         &lt;element name="ratingChange" type="{http://www.ieee.org/odm/Schema/2008}RatingChangeXmlType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AclfBranchChangeXmlType", propOrder = {
    "branchZChange",
    "ratingChange"
})
public class AclfBranchChangeXmlType {

    protected ComplexValueChangeXmlType branchZChange;
    protected List<RatingChangeXmlType> ratingChange;

    /**
     * Gets the value of the branchZChange property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexValueChangeXmlType }
     *     
     */
    public ComplexValueChangeXmlType getBranchZChange() {
        return branchZChange;
    }

    /**
     * Sets the value of the branchZChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexValueChangeXmlType }
     *     
     */
    public void setBranchZChange(ComplexValueChangeXmlType value) {
        this.branchZChange = value;
    }

    /**
     * Gets the value of the ratingChange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratingChange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatingChange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RatingChangeXmlType }
     * 
     * 
     */
    public List<RatingChangeXmlType> getRatingChange() {
        if (ratingChange == null) {
            ratingChange = new ArrayList<RatingChangeXmlType>();
        }
        return this.ratingChange;
    }

}
