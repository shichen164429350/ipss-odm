//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.06 at 07:48:32 PM CST 
//


package org.ieee.odm.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DStabStaticLoadModelEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DStabStaticLoadModelEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Constant_Z"/>
 *     &lt;enumeration value="Constant_P"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DStabStaticLoadModelEnumType")
@XmlEnum
public enum DStabStaticLoadModelEnumType {

    @XmlEnumValue("Constant_Z")
    CONSTANT_Z("Constant_Z"),
    @XmlEnumValue("Constant_P")
    CONSTANT_P("Constant_P");
    private final String value;

    DStabStaticLoadModelEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DStabStaticLoadModelEnumType fromValue(String v) {
        for (DStabStaticLoadModelEnumType c: DStabStaticLoadModelEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
