//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.05 at 10:46:24 PM PDT 
//


package org.ieee.odm.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StudyCaseXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudyCaseXmlType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ieee.org/odm/Schema/2008}IDRecordXmlType">
 *       &lt;sequence>
 *         &lt;element name="contentInfo" type="{http://www.ieee.org/odm/Schema/2008}ContentInfoXmlType" minOccurs="0"/>
 *         &lt;element name="networkCategory" type="{http://www.ieee.org/odm/Schema/2008}NetworkCategoryEnumType"/>
 *         &lt;element name="analysisCategory" type="{http://www.ieee.org/odm/Schema/2008}AnalysisCategoryEnumType"/>
 *         &lt;element ref="{http://www.ieee.org/odm/Schema/2008}baseCase"/>
 *         &lt;element ref="{http://www.ieee.org/odm/Schema/2008}childNet" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="modificationList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="modification" type="{http://www.ieee.org/odm/Schema/2008}ModifyRecordXmlType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.ieee.org/odm/Schema/2008}studyScenario" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="schemaVersion" type="{http://www.w3.org/2001/XMLSchema}string" fixed="0.9.0" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudyCaseXmlType", propOrder = {
    "contentInfo",
    "networkCategory",
    "analysisCategory",
    "baseCase",
    "childNet",
    "modificationList",
    "studyScenario"
})
public class StudyCaseXmlType
    extends IDRecordXmlType
{

    protected ContentInfoXmlType contentInfo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected NetworkCategoryEnumType networkCategory;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AnalysisCategoryEnumType analysisCategory;
    @XmlElementRef(name = "baseCase", namespace = "http://www.ieee.org/odm/Schema/2008", type = JAXBElement.class)
    protected JAXBElement<? extends NetworkXmlType> baseCase;
    @XmlElementRef(name = "childNet", namespace = "http://www.ieee.org/odm/Schema/2008", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends NetworkXmlType>> childNet;
    protected StudyCaseXmlType.ModificationList modificationList;
    @XmlElementRef(name = "studyScenario", namespace = "http://www.ieee.org/odm/Schema/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends StudyScenarioXmlType> studyScenario;
    @XmlAttribute(name = "schemaVersion")
    protected String schemaVersion;

    /**
     * Gets the value of the contentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInfoXmlType }
     *     
     */
    public ContentInfoXmlType getContentInfo() {
        return contentInfo;
    }

    /**
     * Sets the value of the contentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInfoXmlType }
     *     
     */
    public void setContentInfo(ContentInfoXmlType value) {
        this.contentInfo = value;
    }

    /**
     * Gets the value of the networkCategory property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkCategoryEnumType }
     *     
     */
    public NetworkCategoryEnumType getNetworkCategory() {
        return networkCategory;
    }

    /**
     * Sets the value of the networkCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkCategoryEnumType }
     *     
     */
    public void setNetworkCategory(NetworkCategoryEnumType value) {
        this.networkCategory = value;
    }

    /**
     * Gets the value of the analysisCategory property.
     * 
     * @return
     *     possible object is
     *     {@link AnalysisCategoryEnumType }
     *     
     */
    public AnalysisCategoryEnumType getAnalysisCategory() {
        return analysisCategory;
    }

    /**
     * Sets the value of the analysisCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnalysisCategoryEnumType }
     *     
     */
    public void setAnalysisCategory(AnalysisCategoryEnumType value) {
        this.analysisCategory = value;
    }

    /**
     * 
     * 								Base case power network data for power
     * 								system simulation purpose
     * 							
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NetworkXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OpfDclfNetworkXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistributionNetXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LoadflowNetXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OpfNetworkXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DStabNetXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DcNetworkXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ShortCircuitNetXmlType }{@code >}
     *     
     */
    public JAXBElement<? extends NetworkXmlType> getBaseCase() {
        return baseCase;
    }

    /**
     * Sets the value of the baseCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NetworkXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OpfDclfNetworkXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistributionNetXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LoadflowNetXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OpfNetworkXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DStabNetXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DcNetworkXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ShortCircuitNetXmlType }{@code >}
     *     
     */
    public void setBaseCase(JAXBElement<? extends NetworkXmlType> value) {
        this.baseCase = value;
    }

    /**
     * 
     * 								It is assumed that parent network of the
     * 								child network is always defined before
     * 								the child network in the childNet list
     * 							Gets the value of the childNet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childNet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildNet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DistributionNetXmlType }{@code >}
     * {@link JAXBElement }{@code <}{@link DcNetworkXmlType }{@code >}
     * {@link JAXBElement }{@code <}{@link NetworkXmlType }{@code >}
     * {@link JAXBElement }{@code <}{@link LoadflowNetXmlType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends NetworkXmlType>> getChildNet() {
        if (childNet == null) {
            childNet = new ArrayList<JAXBElement<? extends NetworkXmlType>>();
        }
        return this.childNet;
    }

    /**
     * Gets the value of the modificationList property.
     * 
     * @return
     *     possible object is
     *     {@link StudyCaseXmlType.ModificationList }
     *     
     */
    public StudyCaseXmlType.ModificationList getModificationList() {
        return modificationList;
    }

    /**
     * Sets the value of the modificationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudyCaseXmlType.ModificationList }
     *     
     */
    public void setModificationList(StudyCaseXmlType.ModificationList value) {
        this.modificationList = value;
    }

    /**
     * 
     * 								A study case might include a list of
     * 								study scenarios, for example, Loadflow
     * 								study, SC study ...
     * 							
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IpssStudyScenarioXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StudyScenarioXmlType }{@code >}
     *     
     */
    public JAXBElement<? extends StudyScenarioXmlType> getStudyScenario() {
        return studyScenario;
    }

    /**
     * Sets the value of the studyScenario property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IpssStudyScenarioXmlType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StudyScenarioXmlType }{@code >}
     *     
     */
    public void setStudyScenario(JAXBElement<? extends StudyScenarioXmlType> value) {
        this.studyScenario = value;
    }

    /**
     * Gets the value of the schemaVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaVersion() {
        if (schemaVersion == null) {
            return "0.9.0";
        } else {
            return schemaVersion;
        }
    }

    /**
     * Sets the value of the schemaVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaVersion(String value) {
        this.schemaVersion = value;
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
     *         &lt;element name="modification" type="{http://www.ieee.org/odm/Schema/2008}ModifyRecordXmlType" maxOccurs="unbounded" minOccurs="0"/>
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
        "modification"
    })
    public static class ModificationList {

        protected List<ModifyRecordXmlType> modification;

        /**
         * Gets the value of the modification property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the modification property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getModification().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ModifyRecordXmlType }
         * 
         * 
         */
        public List<ModifyRecordXmlType> getModification() {
            if (modification == null) {
                modification = new ArrayList<ModifyRecordXmlType>();
            }
            return this.modification;
        }

    }

}
