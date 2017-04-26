
package com.redhat.cxf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Classe Java de gerarListaProtocolosResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="gerarListaProtocolosResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="listaProtocoloResponse" type="{http://service.anbima.com.br/corp/protocolo}protocolo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gerarListaProtocolosResponse", propOrder = {
    "listaProtocoloResponse"
})
public class GerarListaProtocolosResponse
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected List<Protocolo> listaProtocoloResponse;

    /**
     * Gets the value of the listaProtocoloResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaProtocoloResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaProtocoloResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Protocolo }
     * 
     * 
     */
    public List<Protocolo> getListaProtocoloResponse() {
        if (listaProtocoloResponse == null) {
            listaProtocoloResponse = new ArrayList<Protocolo>();
        }
        return this.listaProtocoloResponse;
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
