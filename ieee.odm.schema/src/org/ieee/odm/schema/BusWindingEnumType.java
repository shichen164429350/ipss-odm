//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.09 at 11:05:44 AM CST 
//


package org.ieee.odm.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusWindingEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BusWindingEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Primary"/>
 *     &lt;enumeration value="Secondary"/>
 *     &lt;enumeration value="Tertiary"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BusWindingEnumType")
@XmlEnum
public enum BusWindingEnumType {

    @XmlEnumValue("Primary")
    PRIMARY("Primary"),
    @XmlEnumValue("Secondary")
    SECONDARY("Secondary"),
    @XmlEnumValue("Tertiary")
    TERTIARY("Tertiary");
    private final String value;

    BusWindingEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BusWindingEnumType fromValue(String v) {
        for (BusWindingEnumType c: BusWindingEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
