//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.09 at 11:05:44 AM CST 
//


package org.ieee.odm.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DynamicStaticLoadEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DynamicStaticLoadEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONST_Z"/>
 *     &lt;enumeration value="CONST_P"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DynamicStaticLoadEnumType", namespace = "http://www.interpss.org/Schema/odm/2008")
@XmlEnum
public enum DynamicStaticLoadEnumType {

    CONST_Z,
    CONST_P;

    public String value() {
        return name();
    }

    public static DynamicStaticLoadEnumType fromValue(String v) {
        return valueOf(v);
    }

}
