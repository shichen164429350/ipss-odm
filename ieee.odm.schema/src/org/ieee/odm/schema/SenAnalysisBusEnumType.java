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
 * <p>Java class for SenAnalysisBusEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SenAnalysisBusEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SingleBus"/>
 *     &lt;enumeration value="MultipleBus"/>
 *     &lt;enumeration value="APNode"/>
 *     &lt;enumeration value="LoadDistribution"/>
 *     &lt;enumeration value="UserFile"/>
 *     &lt;enumeration value="NoBus"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SenAnalysisBusEnumType", namespace = "http://www.interpss.org/Schema/odm/2008")
@XmlEnum
public enum SenAnalysisBusEnumType {

    @XmlEnumValue("SingleBus")
    SINGLE_BUS("SingleBus"),
    @XmlEnumValue("MultipleBus")
    MULTIPLE_BUS("MultipleBus"),

    /**
     * 
     *     				Injection buses are defined by an aggregate pricing node.
     *     			
     * 
     */
    @XmlEnumValue("APNode")
    AP_NODE("APNode"),

    /**
     * 
     *     				Withdraw buses might be defined using load distribution factor based on basecase load.
     *     			
     * 
     */
    @XmlEnumValue("LoadDistribution")
    LOAD_DISTRIBUTION("LoadDistribution"),

    /**
     * 
     *     				Withdraw buses might be defined by a user file.
     *     			
     * 
     */
    @XmlEnumValue("UserFile")
    USER_FILE("UserFile"),
    @XmlEnumValue("NoBus")
    NO_BUS("NoBus");
    private final String value;

    SenAnalysisBusEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SenAnalysisBusEnumType fromValue(String v) {
        for (SenAnalysisBusEnumType c: SenAnalysisBusEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
