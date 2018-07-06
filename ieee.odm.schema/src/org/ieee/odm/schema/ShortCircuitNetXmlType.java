//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.06 at 07:48:32 PM CST 
//


package org.ieee.odm.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			Data structure for defining Acsc network
 * 		
 * 
 * <p>Java class for ShortCircuitNetXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShortCircuitNetXmlType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ieee.org/odm/Schema/2008}LoadflowNetXmlType">
 *       &lt;sequence>
 *         &lt;element name="hasLoadflowData" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="positiveSeqDataOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShortCircuitNetXmlType", propOrder = {
    "hasLoadflowData",
    "positiveSeqDataOnly"
})
@XmlSeeAlso({
    DStabNetXmlType.class
})
public class ShortCircuitNetXmlType
    extends LoadflowNetXmlType
{

    protected boolean hasLoadflowData;
    protected boolean positiveSeqDataOnly;

    /**
     * Gets the value of the hasLoadflowData property.
     * 
     */
    public boolean isHasLoadflowData() {
        return hasLoadflowData;
    }

    /**
     * Sets the value of the hasLoadflowData property.
     * 
     */
    public void setHasLoadflowData(boolean value) {
        this.hasLoadflowData = value;
    }

    /**
     * Gets the value of the positiveSeqDataOnly property.
     * 
     */
    public boolean isPositiveSeqDataOnly() {
        return positiveSeqDataOnly;
    }

    /**
     * Sets the value of the positiveSeqDataOnly property.
     * 
     */
    public void setPositiveSeqDataOnly(boolean value) {
        this.positiveSeqDataOnly = value;
    }

}
