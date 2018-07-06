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
 * <p>Java class for ContingencyAnalysisEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContingencyAnalysisEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="N-1"/>
 *     &lt;enumeration value="N-1-1"/>
 *     &lt;enumeration value="N-2"/>
 *     &lt;enumeration value="Custom"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContingencyAnalysisEnumType", namespace = "http://www.interpss.org/Schema/odm/2008")
@XmlEnum
public enum ContingencyAnalysisEnumType {

    @XmlEnumValue("N-1")
    N_1("N-1"),
    @XmlEnumValue("N-1-1")
    N_1_1("N-1-1"),
    @XmlEnumValue("N-2")
    N_2("N-2"),
    @XmlEnumValue("Custom")
    CUSTOM("Custom");
    private final String value;

    ContingencyAnalysisEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContingencyAnalysisEnumType fromValue(String v) {
        for (ContingencyAnalysisEnumType c: ContingencyAnalysisEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
