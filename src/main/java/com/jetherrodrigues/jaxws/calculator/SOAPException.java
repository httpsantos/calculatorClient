
package com.jetherrodrigues.jaxws.calculator;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "SOAPException", targetNamespace = "http://interfaces.unisal.br/")
public class SOAPException
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private br.unisal.interfaces.SOAPException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public SOAPException(String message, br.unisal.interfaces.SOAPException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public SOAPException(String message, br.unisal.interfaces.SOAPException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: br.unisal.interfaces.SOAPException
     */
    public br.unisal.interfaces.SOAPException getFaultInfo() {
        return faultInfo;
    }

}
