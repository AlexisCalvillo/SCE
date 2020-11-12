/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontera;

import entidades.OrderedProduct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author aalex
 */
@Stateless
public class OrderedProductFacade extends AbstractFacade<OrderedProduct> {

    @PersistenceContext(unitName = "Affablebean_01PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OrderedProductFacade() {
        super(OrderedProduct.class);
    }
    
     public java.util.List<OrderedProduct> findOrderedProductByCustId(int id)
    {
        em = getEntityManager();
        TypedQuery<OrderedProduct> queryCatByName = em.createNamedQuery("OrderedProduct.findByCustomerOrderId", OrderedProduct.class);
        queryCatByName.setParameter("customerOrderId", id);
        java.util.List<OrderedProduct> lista= queryCatByName.getResultList();

        return lista;
    }
}
