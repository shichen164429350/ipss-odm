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
 * <p>Java class for PtBranchAnalysisEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PtBranchAnalysisEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SingleBranchOutage"/>
 *     &lt;enumeration value="MultiBranchOutage"/>
 *     &lt;enumeration value="GenContribution"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PtBranchAnalysisEnumType", namespace = "http://www.interpss.org/Schema/odm/2008")
@XmlEnum
public enum PtBranchAnalysisEnumType {

    @XmlEnumValue("SingleBranchOutage")
    SINGLE_BRANCH_OUTAGE("SingleBranchOutage"),
    @XmlEnumValue("MultiBranchOutage")
    MULTI_BRANCH_OUTAGE("MultiBranchOutage"),
    @XmlEnumValue("GenContribution")
    GEN_CONTRIBUTION("GenContribution");
    private final String value;

    PtBranchAnalysisEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PtBranchAnalysisEnumType fromValue(String v) {
        for (PtBranchAnalysisEnumType c: PtBranchAnalysisEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
