
package wsordprod;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for orderedProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="orderedProduct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerOrder" type="{http://wsPedidoItem/}customerOrder" minOccurs="0"/>
 *         &lt;element name="orderedProductPK" type="{http://wsPedidoItem/}orderedProductPK" minOccurs="0"/>
 *         &lt;element name="product" type="{http://wsPedidoItem/}product" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orderedProduct", propOrder = {
    "customerOrder",
    "orderedProductPK",
    "product",
    "quantity"
})
public class OrderedProduct {

    protected CustomerOrder customerOrder;
    protected OrderedProductPK orderedProductPK;
    protected Product product;
    protected short quantity;

    /**
     * Gets the value of the customerOrder property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrder }
     *     
     */
    public CustomerOrder getCustomerOrder() {
        return customerOrder;
    }

    /**
     * Sets the value of the customerOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrder }
     *     
     */
    public void setCustomerOrder(CustomerOrder value) {
        this.customerOrder = value;
    }

    /**
     * Gets the value of the orderedProductPK property.
     * 
     * @return
     *     possible object is
     *     {@link OrderedProductPK }
     *     
     */
    public OrderedProductPK getOrderedProductPK() {
        return orderedProductPK;
    }

    /**
     * Sets the value of the orderedProductPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderedProductPK }
     *     
     */
    public void setOrderedProductPK(OrderedProductPK value) {
        this.orderedProductPK = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setProduct(Product value) {
        this.product = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     */
    public short getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(short value) {
        this.quantity = value;
    }

}
