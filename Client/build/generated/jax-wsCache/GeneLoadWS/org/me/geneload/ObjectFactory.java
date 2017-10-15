
package org.me.geneload;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.me.geneload package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Gene_QNAME = new QName("http://geneLoad.me.org/", "Gene");
    private final static QName _GeneResponse_QNAME = new QName("http://geneLoad.me.org/", "GeneResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.me.geneload
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Gene }
     * 
     */
    public Gene createGene() {
        return new Gene();
    }

    /**
     * Create an instance of {@link GeneResponse }
     * 
     */
    public GeneResponse createGeneResponse() {
        return new GeneResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Gene }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://geneLoad.me.org/", name = "Gene")
    public JAXBElement<Gene> createGene(Gene value) {
        return new JAXBElement<Gene>(_Gene_QNAME, Gene.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeneResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://geneLoad.me.org/", name = "GeneResponse")
    public JAXBElement<GeneResponse> createGeneResponse(GeneResponse value) {
        return new JAXBElement<GeneResponse>(_GeneResponse_QNAME, GeneResponse.class, null, value);
    }

}
