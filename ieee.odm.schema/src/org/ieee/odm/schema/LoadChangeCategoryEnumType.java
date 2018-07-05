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
 * <p>Java class for LoadChangeCategoryEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LoadChangeCategoryEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LowFrequence"/>
 *     &lt;enumeration value="LowVoltage"/>
 *     &lt;enumeration value="FixedTime"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LoadChangeCategoryEnumType", namespace = "http://www.interpss.org/Schema/odm/2008")
@XmlEnum
public enum LoadChangeCategoryEnumType {

    @XmlEnumValue("LowFrequence")
    LOW_FREQUENCE("LowFrequence"),
    @XmlEnumValue("LowVoltage")
    LOW_VOLTAGE("LowVoltage"),
    @XmlEnumValue("FixedTime")
    FIXED_TIME("FixedTime");
    private final String value;

    LoadChangeCategoryEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoadChangeCategoryEnumType fromValue(String v) {
        for (LoadChangeCategoryEnumType c: LoadChangeCategoryEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}