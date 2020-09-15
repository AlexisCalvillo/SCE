
package miWSBDAltas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for altaAlumno complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="altaAlumno">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cveAlumno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreAlumno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apPaternoAlumno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apMaternoAlumno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "altaAlumno", propOrder = {
    "cveAlumno",
    "nombreAlumno",
    "apPaternoAlumno",
    "apMaternoAlumno"
})
public class AltaAlumno {

    protected String cveAlumno;
    protected String nombreAlumno;
    protected String apPaternoAlumno;
    protected String apMaternoAlumno;

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

    /**
     * Gets the value of the nombreAlumno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreAlumno() {
        return nombreAlumno;
    }

    /**
     * Sets the value of the nombreAlumno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreAlumno(String value) {
        this.nombreAlumno = value;
    }

    /**
     * Gets the value of the apPaternoAlumno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApPaternoAlumno() {
        return apPaternoAlumno;
    }

    /**
     * Sets the value of the apPaternoAlumno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApPaternoAlumno(String value) {
        this.apPaternoAlumno = value;
    }

    /**
     * Gets the value of the apMaternoAlumno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApMaternoAlumno() {
        return apMaternoAlumno;
    }

    /**
     * Sets the value of the apMaternoAlumno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApMaternoAlumno(String value) {
        this.apMaternoAlumno = value;
    }

}
