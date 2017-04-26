
package com.redhat.cxf;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Classe Java de gerarProtocoloResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="gerarProtocoloResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="protocoloResponse" type="{http://service.anbima.com.br/corp/protocolo}protocolo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gerarProtocoloResponse", propOrder = {
    "protocoloResponse"
})
public class GerarProtocoloResponse
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected Protocolo protocoloResponse;

    /**
     * Obtém o valor da propriedade protocoloResponse.
     * 
     * @return
     *     possible object is
     *     {@link Protocolo }
     *     
     */
    public Protocolo getProtocoloResponse() {
        return protocoloResponse;
    }

    /**
     * Define o valor da propriedade protocoloResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link Protocolo }
     *     
     */
    public void setProtocoloResponse(Protocolo value) {
        this.protocoloResponse = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
    }

}
