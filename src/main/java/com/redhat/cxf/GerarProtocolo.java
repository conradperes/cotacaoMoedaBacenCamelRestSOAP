
package com.redhat.cxf;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Classe Java de gerarProtocolo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="gerarProtocolo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tipoProtocolo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="origemProtocolo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gerarProtocolo", propOrder = {
    "tipoProtocolo",
    "origemProtocolo"
})
public class GerarProtocolo
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected String tipoProtocolo;
    protected String origemProtocolo;

    /**
     * Obtém o valor da propriedade tipoProtocolo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoProtocolo() {
        return tipoProtocolo;
    }

    /**
     * Define o valor da propriedade tipoProtocolo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoProtocolo(String value) {
        this.tipoProtocolo = value;
    }

    /**
     * Obtém o valor da propriedade origemProtocolo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigemProtocolo() {
        return origemProtocolo;
    }

    /**
     * Define o valor da propriedade origemProtocolo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigemProtocolo(String value) {
        this.origemProtocolo = value;
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
