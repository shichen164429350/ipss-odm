//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.05 at 10:46:24 PM PDT 
//


package org.ieee.odm.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcscFaultTypeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AcscFaultTypeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BusFault"/>
 *     &lt;enumeration value="BranchFault"/>
 *     &lt;enumeration value="BranchOutage"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AcscFaultTypeEnumType")
@XmlEnum
public enum AcscFaultTypeEnumType {

    @XmlEnumValue("BusFault")
    BUS_FAULT("BusFault"),
    @XmlEnumValue("BranchFault")
    BRANCH_FAULT("BranchFault"),
    @XmlEnumValue("BranchOutage")
    BRANCH_OUTAGE("BranchOutage");
    private final String value;

    AcscFaultTypeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AcscFaultTypeEnumType fromValue(String v) {
        for (AcscFaultTypeEnumType c: AcscFaultTypeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
