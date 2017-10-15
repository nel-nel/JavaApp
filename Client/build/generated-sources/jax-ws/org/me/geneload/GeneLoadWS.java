
package org.me.geneload;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "GeneLoadWS", targetNamespace = "http://geneLoad.me.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface GeneLoadWS {


    /**
     * 
     * @param addName
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Gene")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Gene", targetNamespace = "http://geneLoad.me.org/", className = "org.me.geneload.Gene")
    @ResponseWrapper(localName = "GeneResponse", targetNamespace = "http://geneLoad.me.org/", className = "org.me.geneload.GeneResponse")
    @Action(input = "http://geneLoad.me.org/GeneLoadWS/GeneRequest", output = "http://geneLoad.me.org/GeneLoadWS/GeneResponse")
    public String gene(
        @WebParam(name = "addName", targetNamespace = "")
        String addName);

}
