package entidades;

import entidades.CustomerOrder;
import entidades.OrderedProductPK;
import entidades.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-11-10T12:44:51")
@StaticMetamodel(OrderedProduct.class)
public class OrderedProduct_ { 

    public static volatile SingularAttribute<OrderedProduct, OrderedProductPK> orderedProductPK;
    public static volatile SingularAttribute<OrderedProduct, Product> product;
    public static volatile SingularAttribute<OrderedProduct, Short> quantity;
    public static volatile SingularAttribute<OrderedProduct, CustomerOrder> customerOrder;

}