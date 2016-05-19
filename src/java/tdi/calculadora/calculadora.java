/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdi.calculadora;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author agtaf
 */
@WebService(serviceName = "calculadora")
public class calculadora {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "sumar")
    public double sumar(@WebParam(name = "n1") double n1, @WebParam(name = "n2") double n2 ) {
        return n1+n2;
    }
}
