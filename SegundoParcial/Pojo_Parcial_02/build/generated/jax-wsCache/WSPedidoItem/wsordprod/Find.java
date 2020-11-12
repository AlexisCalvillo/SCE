
package wsordprod;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for find complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="find">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="custord_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="prod_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "find", propOrder = {
    "custordId",
    "prodId"
})
public class Find {

    @XmlElement(name = "custord_id")
    protected int custordId;
    @XmlElement(name = "prod_id")
    protected int prodId;

    /**
     * Gets the value of the custordId property.
     * 
     */
    public int getCustordId() {
        return custordId;
    }

    /**
     * Sets the value of the custordId property.
     * 
     */
    public void setCustordId(int value) {
        this.custordId = value;
    }

    /**
     * Gets the value of the prodId property.
     * 
     */
    public int getProdId() {
        return prodId;
    }

    /**
     * Sets the value of the prodId property.
     * 
     */
    public void setProdId(int value) {
        this.prodId = value;
    }

}
