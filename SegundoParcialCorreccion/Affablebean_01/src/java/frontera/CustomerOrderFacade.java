/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontera;

import entidades.CustomerOrder;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author aalex
 */
@Stateless
public class CustomerOrderFacade extends AbstractFacade<CustomerOrder> {

    @PersistenceContext(unitName = "Affablebean_01PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CustomerOrderFacade() {
        super(CustomerOrder.class);
    }
    
    public CustomerOrder findById(int id)
    {
        em = getEntityManager();
        TypedQuery<CustomerOrder> queryCatByName = em.createNamedQuery("CustomerOrder.findById", CustomerOrder.class);
        queryCatByName.setParameter("productId", id);
        java.util.List<CustomerOrder> lista= queryCatByName.getResultList();

        return lista.get(0);
    }
    
    public double getTotAmount()
    {
        em = getEntityManager();
        Query queryCatByName;
        queryCatByName = em.createNativeQuery("SELECT SUM(c.amount) FROM Customer_Order c");
        //queryCatByName = em.createQuery("SELECT SUM(c.amount) FROM CustomerOrder c");
        Object co= queryCatByName.getSingleResult();
        return Double.parseDouble(co.toString());
    }
    
    public double getTotAmountForCustOrd(int id)
    {
        em = getEntityManager();
        Query queryCatByName = em.createNativeQuery("SELECT SUM(c.AMOUNT) FROM Customer_Order c WHERE c.customer_Id="+id);
        Object co= queryCatByName.getSingleResult();

        return Double.parseDouble(co.toString());
    }
    
}
