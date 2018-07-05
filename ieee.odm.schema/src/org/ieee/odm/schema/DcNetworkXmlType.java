//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.09 at 11:05:44 AM CST 
//


package org.ieee.odm.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			Data structure for defining DC system network   
 * 		
 * 
 * <p>Java class for DcNetworkXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DcNetworkXmlType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ieee.org/odm/Schema/2008}NetworkXmlType">
 *       &lt;sequence>
 *         &lt;element name="ratedVoltage" type="{http://www.ieee.org/odm/Schema/2008}VoltageXmlType"/>
 *         &lt;element name="pvModelList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ieee.org/odm/Schema/2008}pvModel" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DcNetworkXmlType", propOrder = {
    "ratedVoltage",
    "pvModelList"
})
public class DcNetworkXmlType
    extends NetworkXmlType
{

    @XmlElement(required = true)
    protected VoltageXmlType ratedVoltage;
    protected DcNetworkXmlType.PvModelList pvModelList;

    /**
     * Gets the value of the ratedVoltage property.
     * 
     * @return
     *     possible object is
     *     {@link VoltageXmlType }
     *     
     */
    public VoltageXmlType getRatedVoltage() {
        return ratedVoltage;
    }

    /**
     * Sets the value of the ratedVoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoltageXmlType }
     *     
     */
    public void setRatedVoltage(VoltageXmlType value) {
        this.ratedVoltage = value;
    }

    /**
     * Gets the value of the pvModelList property.
     * 
     * @return
     *     possible object is
     *     {@link DcNetworkXmlType.PvModelList }
     *     
     */
    public DcNetworkXmlType.PvModelList getPvModelList() {
        return pvModelList;
    }

    /**
     * Sets the value of the pvModelList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DcNetworkXmlType.PvModelList }
     *     
     */
    public void setPvModelList(DcNetworkXmlType.PvModelList value) {
        this.pvModelList = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.ieee.org/odm/Schema/2008}pvModel" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "pvModel"
    })
    public static class PvModelList {

        @XmlElementRef(name = "pvModel", namespace = "http://www.ieee.org/odm/Schema/2008", type = JAXBElement.class)
        protected List<JAXBElement<? extends BasePVModelXmlType>> pvModel;

        /**
         * Gets the value of the pvModel property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pvModel property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPvModel().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link BasePVModelXmlType }{@code >}
         * {@link JAXBElement }{@code <}{@link PVModelIVCurveXmlType }{@code >}
         * {@link JAXBElement }{@code <}{@link PVModelIVFunctionXmlType }{@code >}
         * 
         * 
         */
        public List<JAXBElement<? extends BasePVModelXmlType>> getPvModel() {
            if (pvModel == null) {
                pvModel = new ArrayList<JAXBElement<? extends BasePVModelXmlType>>();
            }
            return this.pvModel;
        }

    }

}
