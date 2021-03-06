
package com.microsoft.bingads.customermanagement;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "ApiFault", targetNamespace = "https://bingads.microsoft.com/Customer/v9")
public class ApiFault_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ApiFault faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public ApiFault_Exception(String message, ApiFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public ApiFault_Exception(String message, ApiFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.microsoft.bingads.customermanagement.ApiFault
     */
    public ApiFault getFaultInfo() {
        return faultInfo;
    }

}
