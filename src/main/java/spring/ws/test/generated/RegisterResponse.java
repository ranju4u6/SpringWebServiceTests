//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.19 at 08:36:22 AM IST 
//


package spring.ws.test.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegisterResponse" type="{http://spring.ws.study.xsd/Register/}RegisterResponseType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "registerResponse"
})
@XmlRootElement(name = "RegisterResponse")
public class RegisterResponse {

    @XmlElement(name = "RegisterResponse", required = true)
    protected RegisterResponseType registerResponse;

    /**
     * Gets the value of the registerResponse property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterResponseType }
     *     
     */
    public RegisterResponseType getRegisterResponse() {
        return registerResponse;
    }

    /**
     * Sets the value of the registerResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterResponseType }
     *     
     */
    public void setRegisterResponse(RegisterResponseType value) {
        this.registerResponse = value;
    }

}