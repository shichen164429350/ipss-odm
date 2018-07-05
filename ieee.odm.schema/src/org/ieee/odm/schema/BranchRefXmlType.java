//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.09 at 11:05:44 AM CST 
//


package org.ieee.odm.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BranchRefXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BranchRefXmlType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ieee.org/odm/Schema/2008}NameTagXmlType">
 *       &lt;attribute name="branchId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fromBusId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="toBusId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tertiaryBusId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="circuitId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BranchRefXmlType")
@XmlSeeAlso({
    FlowInterfaceBranchXmlType.class,
    BranchChangeRecXmlType.class,
    DclfContingencyBranchXmlType.class,
    ScheduledBranchOutageXmlType.class
})
public class BranchRefXmlType
    extends NameTagXmlType
{

    @XmlAttribute(name = "branchId", required = true)
    protected String branchId;
    @XmlAttribute(name = "fromBusId", required = true)
    protected String fromBusId;
    @XmlAttribute(name = "toBusId", required = true)
    protected String toBusId;
    @XmlAttribute(name = "tertiaryBusId")
    protected String tertiaryBusId;
    @XmlAttribute(name = "circuitId")
    protected String circuitId;

    /**
     * Gets the value of the branchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchId() {
        return branchId;
    }

    /**
     * Sets the value of the branchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchId(String value) {
        this.branchId = value;
    }

    /**
     * Gets the value of the fromBusId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromBusId() {
        return fromBusId;
    }

    /**
     * Sets the value of the fromBusId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromBusId(String value) {
        this.fromBusId = value;
    }

    /**
     * Gets the value of the toBusId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToBusId() {
        return toBusId;
    }

    /**
     * Sets the value of the toBusId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToBusId(String value) {
        this.toBusId = value;
    }

    /**
     * Gets the value of the tertiaryBusId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTertiaryBusId() {
        return tertiaryBusId;
    }

    /**
     * Sets the value of the tertiaryBusId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTertiaryBusId(String value) {
        this.tertiaryBusId = value;
    }

    /**
     * Gets the value of the circuitId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCircuitId() {
        return circuitId;
    }

    /**
     * Sets the value of the circuitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCircuitId(String value) {
        this.circuitId = value;
    }

}
