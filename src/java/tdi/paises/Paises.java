/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdi.paises;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import net.webservicex.GlobalWeather;
import net.webservicex.GlobalWeatherSoap;

/**
 *
 * @author agtaf
 */
@WebService(serviceName = "Paises")
public class Paises {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "")
    public String obtenerCiudades(@WebParam(name = "pais") String pais) {
        GlobalWeather gw = new GlobalWeather();
        GlobalWeatherSoap gwSoap = gw.getGlobalWeatherSoap();
        
        String cities = gwSoap.getCitiesByCountry(pais);
        return cities;
    }
}
