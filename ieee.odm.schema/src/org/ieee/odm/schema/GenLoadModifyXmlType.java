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
 * 
 *     		Data structure for storing ED information. The info will be used to modify Loadflow 
 *     		network object
 *     	
 * 
 * <p>Java class for GenLoadModifyXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenLoadModifyXmlType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ieee.org/odm/Schema/2008}ModifyRecordXmlType">
 *       &lt;sequence>
 *         &lt;element name="edRecord" type="{http://www.interpss.org/Schema/odm/2008}EDDailyGenRecXmlType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenLoadModifyXmlType", namespace = "http://www.interpss.org/Schema/odm/2008", propOrder = {
    "edRecord"
})
public class GenLoadModifyXmlType
    extends ModifyRecordXmlType
{

    protected List<EDDailyGenRecXmlType> edRecord;

    /**
     * Gets the value of the edRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the edRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEdRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EDDailyGenRecXmlType }
     * 
     * 
     */
    public List<EDDailyGenRecXmlType> getEdRecord() {
        if (edRecord == null) {
            edRecord = new ArrayList<EDDailyGenRecXmlType>();
        }
        return this.edRecord;
    }

}
