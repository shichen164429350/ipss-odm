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
 * <p>Java class for SwitchedShuntModeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SwitchedShuntModeEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Fixed"/>
 *     &lt;enumeration value="Discrete"/>
 *     &lt;enumeration value="Continuous"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SwitchedShuntModeEnumType")
@XmlEnum
public enum SwitchedShuntModeEnumType {

    @XmlEnumValue("Fixed")
    FIXED("Fixed"),
    @XmlEnumValue("Discrete")
    DISCRETE("Discrete"),
    @XmlEnumValue("Continuous")
    CONTINUOUS("Continuous");
    private final String value;

    SwitchedShuntModeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SwitchedShuntModeEnumType fromValue(String v) {
        for (SwitchedShuntModeEnumType c: SwitchedShuntModeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
