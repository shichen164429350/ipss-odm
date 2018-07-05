//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.09 at 11:05:44 AM CST 
//


package org.ieee.odm.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DStabGenDataXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DStabGenDataXmlType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ieee.org/odm/Schema/2008}ShortCircuitGenDataXmlType">
 *       &lt;sequence>
 *         &lt;element name="ownerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pContributionPercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="qContributionPercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element ref="{http://www.ieee.org/odm/Schema/2008}machineModel"/>
 *         &lt;element ref="{http://www.ieee.org/odm/Schema/2008}exciter" minOccurs="0"/>
 *         &lt;element ref="{http://www.ieee.org/odm/Schema/2008}governor" minOccurs="0"/>
 *         &lt;element ref="{http://www.ieee.org/odm/Schema/2008}stabilizer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DStabGenDataXmlType", propOrder = {
    "ownerName",
    "pContributionPercent",
    "qContributionPercent",
    "machineModel",
    "exciter",
    "governor",
    "stabilizer"
})
public class DStabGenDataXmlType
    extends ShortCircuitGenDataXmlType
{

    protected String ownerName;
    protected Double pContributionPercent;
    protected Double qContributionPercent;
    @XmlElementRef(name = "machineModel", namespace = "http://www.ieee.org/odm/Schema/2008", type = JAXBElement.class)
    protected JAXBElement<? extends MachineModelXmlType> machineModel;
    @XmlElementRef(name = "exciter", namespace = "http://www.ieee.org/odm/Schema/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends ExciterModelXmlType> exciter;
    @XmlElementRef(name = "governor", namespace = "http://www.ieee.org/odm/Schema/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends GovernorModelXmlType> governor;
    @XmlElementRef(name = "stabilizer", namespace = "http://www.ieee.org/odm/Schema/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends StabilizerModelXmlType> stabilizer;

    /**
     * Gets the value of the ownerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Sets the value of the ownerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerName(String value) {
        this.ownerName = value;
    }

    /**
     * Gets the value of the pContributionPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPContributionPercent() {
        return pContributionPercent;
    }

    /**
     * Sets the value of the pContributionPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPContributionPercent(Double value) {
        this.pContributionPercent = value;
    }

    /**
     * Gets the value of the qContributionPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQContributionPercent() {
        return qContributionPercent;
    }

    /**
     * Sets the value of the qContributionPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQContributionPercent(Double value) {
        this.qContributionPercent = value;
    }

    /**
     * Gets the value of the machineModel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EquiMachineXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ClassicMachineXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link Eq1Ed1MachineXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link Eq11MachineXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link Eq11Ed11MachineXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link Eq1Ed1MachineXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link Eq11Ed11MachineXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link Eq1MachineXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MachineModelXmlType }{@code >}
     *     
     */
    public JAXBElement<? extends MachineModelXmlType> getMachineModel() {
        return machineModel;
    }

    /**
     * Sets the value of the machineModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EquiMachineXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ClassicMachineXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link Eq1Ed1MachineXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link Eq11MachineXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link Eq11Ed11MachineXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link Eq1Ed1MachineXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link Eq11Ed11MachineXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link Eq1MachineXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MachineModelXmlType }{@code >}
     *     
     */
    public void setMachineModel(JAXBElement<? extends MachineModelXmlType> value) {
        this.machineModel = value;
    }

    /**
     * Gets the value of the exciter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExcBPAFOXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcBPAFNXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcIEEE1968Type2XmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcBPAFQXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcIEEE2005TypeST4BXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcIEEE1968Type1XmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcBPAFRXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcBPAFKXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcBPAFVXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcBPAFMXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcIEEE1981ST1XmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExciterModelXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcIEEE1968Type4XmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcIEEE1981TypeAC2XmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcIEEE1992TypeST1AXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcBPAECXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcIEEE1981TypeDC1XmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcIEEE1981TypeDC2XmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcIEEE2005TypeST3AXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcIEEE1981TypeAC1XmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcBPAFUXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcSimpleTypeXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcIEEE1992TypeAC1AXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcBPAFSXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcBPAFPXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcIEEEModified1968Type1XmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcBPAFJXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcBPAFTXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcTSATTypeEXC34XmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcIEEE1968Type1SXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcBPAEKXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcIEEE1968Type3XmlType }{@code >}
     *     
     */
    public JAXBElement<? extends ExciterModelXmlType> getExciter() {
        return exciter;
    }

    /**
     * Sets the value of the exciter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExcBPAFOXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcBPAFNXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcIEEE1968Type2XmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcBPAFQXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcIEEE2005TypeST4BXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcIEEE1968Type1XmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcBPAFRXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcBPAFKXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcBPAFVXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcBPAFMXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcIEEE1981ST1XmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExciterModelXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcIEEE1968Type4XmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcIEEE1981TypeAC2XmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcIEEE1992TypeST1AXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcBPAECXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcIEEE1981TypeDC1XmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcIEEE1981TypeDC2XmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcIEEE2005TypeST3AXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcIEEE1981TypeAC1XmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcBPAFUXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcSimpleTypeXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcIEEE1992TypeAC1AXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcBPAFSXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcBPAFPXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcIEEEModified1968Type1XmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcBPAFJXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcBPAFTXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcTSATTypeEXC34XmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcIEEE1968Type1SXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcBPAEKXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcIEEE1968Type3XmlType }{@code >}
     *     
     */
    public void setExciter(JAXBElement<? extends ExciterModelXmlType> value) {
        this.exciter = value;
    }

    /**
     * Gets the value of the governor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GovSimpleTypeXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GovPSSETGOV1ModelXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GovBPAHydroTurbineGHXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GovBPAGiGaTbCombinedModelXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GovSteamTCSRXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GovIEEE1981Type2XmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GovHydroTurbineXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GovHydroXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GovPSSEGASTModelXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GovIEEE1981Type3XmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GovSteamNRXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GovIEEE1981Type1XmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GovHydroSteamGeneralModelXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GovernorModelXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GovBPAGsTbCombinedModelXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GovSteamTCDRXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GovPSSEIEESGOModelXmlType }{@code >}
     *     
     */
    public JAXBElement<? extends GovernorModelXmlType> getGovernor() {
        return governor;
    }

    /**
     * Sets the value of the governor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GovSimpleTypeXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GovPSSETGOV1ModelXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GovBPAHydroTurbineGHXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GovBPAGiGaTbCombinedModelXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GovSteamTCSRXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GovIEEE1981Type2XmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GovHydroTurbineXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GovHydroXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GovPSSEGASTModelXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GovIEEE1981Type3XmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GovSteamNRXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GovIEEE1981Type1XmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GovHydroSteamGeneralModelXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GovernorModelXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GovBPAGsTbCombinedModelXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GovSteamTCDRXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GovPSSEIEESGOModelXmlType }{@code >}
     *     
     */
    public void setGovernor(JAXBElement<? extends GovernorModelXmlType> value) {
        this.governor = value;
    }

    /**
     * Gets the value of the stabilizer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PssIEEEDualInputXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PssIEEE1AXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PssIEEE1992Type2AXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StabilizerModelXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PssBpaSpTypeXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PssIEE2STXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PssBPADualInputXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PssIEEE1981TypeXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PssBpaSsTypeXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PssSimpleTypeXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PssBpaSgTypeXmlType }{@code >}
     *     
     */
    public JAXBElement<? extends StabilizerModelXmlType> getStabilizer() {
        return stabilizer;
    }

    /**
     * Sets the value of the stabilizer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PssIEEEDualInputXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PssIEEE1AXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PssIEEE1992Type2AXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StabilizerModelXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PssBpaSpTypeXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PssIEE2STXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PssBPADualInputXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PssIEEE1981TypeXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PssBpaSsTypeXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PssSimpleTypeXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PssBpaSgTypeXmlType }{@code >}
     *     
     */
    public void setStabilizer(JAXBElement<? extends StabilizerModelXmlType> value) {
        this.stabilizer = value;
    }

}
