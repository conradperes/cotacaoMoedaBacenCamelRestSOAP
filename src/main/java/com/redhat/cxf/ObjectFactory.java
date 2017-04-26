
package com.redhat.cxf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.redhat.cxf package. 
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

    private final static QName _GerarListaProtocolos_QNAME = new QName("http://service.anbima.com.br/corp/protocolo", "gerarListaProtocolos");
    private final static QName _GerarListaProtocolosResponse_QNAME = new QName("http://service.anbima.com.br/corp/protocolo", "gerarListaProtocolosResponse");
    private final static QName _GerarProtocolo_QNAME = new QName("http://service.anbima.com.br/corp/protocolo", "gerarProtocolo");
    private final static QName _GerarProtocoloResponse_QNAME = new QName("http://service.anbima.com.br/corp/protocolo", "gerarProtocoloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.redhat.cxf
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GerarListaProtocolos }
     * 
     */
    public GerarListaProtocolos createGerarListaProtocolos() {
        return new GerarListaProtocolos();
    }

    /**
     * Create an instance of {@link GerarListaProtocolosResponse }
     * 
     */
    public GerarListaProtocolosResponse createGerarListaProtocolosResponse() {
        return new GerarListaProtocolosResponse();
    }

    /**
     * Create an instance of {@link GerarProtocolo }
     * 
     */
    public GerarProtocolo createGerarProtocolo() {
        return new GerarProtocolo();
    }

    /**
     * Create an instance of {@link GerarProtocoloResponse }
     * 
     */
    public GerarProtocoloResponse createGerarProtocoloResponse() {
        return new GerarProtocoloResponse();
    }

    /**
     * Create an instance of {@link Protocolo }
     * 
     */
    public Protocolo createProtocolo() {
        return new Protocolo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GerarListaProtocolos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.anbima.com.br/corp/protocolo", name = "gerarListaProtocolos")
    public JAXBElement<GerarListaProtocolos> createGerarListaProtocolos(GerarListaProtocolos value) {
        return new JAXBElement<GerarListaProtocolos>(_GerarListaProtocolos_QNAME, GerarListaProtocolos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GerarListaProtocolosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.anbima.com.br/corp/protocolo", name = "gerarListaProtocolosResponse")
    public JAXBElement<GerarListaProtocolosResponse> createGerarListaProtocolosResponse(GerarListaProtocolosResponse value) {
        return new JAXBElement<GerarListaProtocolosResponse>(_GerarListaProtocolosResponse_QNAME, GerarListaProtocolosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GerarProtocolo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.anbima.com.br/corp/protocolo", name = "gerarProtocolo")
    public JAXBElement<GerarProtocolo> createGerarProtocolo(GerarProtocolo value) {
        return new JAXBElement<GerarProtocolo>(_GerarProtocolo_QNAME, GerarProtocolo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GerarProtocoloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.anbima.com.br/corp/protocolo", name = "gerarProtocoloResponse")
    public JAXBElement<GerarProtocoloResponse> createGerarProtocoloResponse(GerarProtocoloResponse value) {
        return new JAXBElement<GerarProtocoloResponse>(_GerarProtocoloResponse_QNAME, GerarProtocoloResponse.class, null, value);
    }

}
