
package tstescbailepojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bajaEq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bajaEq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cveAlumno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bajaEq", propOrder = {
    "cveAlumno"
})
public class BajaEq {

    protected String cveAlumno;

    /**
     * Gets the value of the cveAlumno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCveAlumno() {
        return cveAlumno;
    }

    /**
     * Sets the value of the cveAlumno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCveAlumno(String value) {
        this.cveAlumno = value;
    }

}
