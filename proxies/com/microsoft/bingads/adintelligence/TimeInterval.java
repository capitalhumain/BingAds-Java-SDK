
package com.microsoft.bingads.adintelligence;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeInterval.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TimeInterval">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Last30Days"/>
 *     &lt;enumeration value="Last7Days"/>
 *     &lt;enumeration value="LastDay"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TimeInterval")
@XmlEnum
public enum TimeInterval {

    @XmlEnumValue("Last30Days")
    LAST_30_DAYS("Last30Days"),
    @XmlEnumValue("Last7Days")
    LAST_7_DAYS("Last7Days"),
    @XmlEnumValue("LastDay")
    LAST_DAY("LastDay");
    private final String value;

    TimeInterval(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimeInterval fromValue(String v) {
        for (TimeInterval c: TimeInterval.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
