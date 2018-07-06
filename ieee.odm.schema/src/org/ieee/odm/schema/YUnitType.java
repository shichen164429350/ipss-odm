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
 * <p>Java class for YUnitType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="YUnitType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PU"/>
 *     &lt;enumeration value="VAR"/>
 *     &lt;enumeration value="KVAR"/>
 *     &lt;enumeration value="MVAR"/>
 *     &lt;enumeration value="MHO"/>
 *     &lt;enumeration value="MICROMHO"/>
 *     &lt;enumeration value="MHOPerMile"/>
 *     &lt;enumeration value="MHOPerFt"/>
 *     &lt;enumeration value="MHOPerKM"/>
 *     &lt;enumeration value="MHOPerM"/>
 *     &lt;enumeration value="MICROMHOPerMile"/>
 *     &lt;enumeration value="MICROMHOPerFt"/>
 *     &lt;enumeration value="MICROMHOPerM"/>
 *     &lt;enumeration value="MICROMHOPerKM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "YUnitType")
@XmlEnum
public enum YUnitType {

    PU("PU"),
    VAR("VAR"),
    KVAR("KVAR"),
    MVAR("MVAR"),
    MHO("MHO"),
    MICROMHO("MICROMHO"),
    @XmlEnumValue("MHOPerMile")
    MHO_PER_MILE("MHOPerMile"),
    @XmlEnumValue("MHOPerFt")
    MHO_PER_FT("MHOPerFt"),
    @XmlEnumValue("MHOPerKM")
    MHO_PER_KM("MHOPerKM"),
    @XmlEnumValue("MHOPerM")
    MHO_PER_M("MHOPerM"),
    @XmlEnumValue("MICROMHOPerMile")
    MICROMHO_PER_MILE("MICROMHOPerMile"),
    @XmlEnumValue("MICROMHOPerFt")
    MICROMHO_PER_FT("MICROMHOPerFt"),
    @XmlEnumValue("MICROMHOPerM")
    MICROMHO_PER_M("MICROMHOPerM"),
    @XmlEnumValue("MICROMHOPerKM")
    MICROMHO_PER_KM("MICROMHOPerKM");
    private final String value;

    YUnitType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static YUnitType fromValue(String v) {
        for (YUnitType c: YUnitType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
