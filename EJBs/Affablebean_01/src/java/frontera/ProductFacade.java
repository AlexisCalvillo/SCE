/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontera;

import entidades.Product;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author aalex
 */
@Stateless
public class ProductFacade extends AbstractFacade<Product> {

    @PersistenceContext(unitName = "Affablebean_01PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProductFacade() {
        super(Product.class);
    }
    
     public java.util.List<Product> findByName(String nombre)
    {
        em = getEntityManager();
        TypedQuery<Product> queryCatByName = em.createNamedQuery("Product.findByName", Product.class);
        queryCatByName.setParameter("name", nombre);
        java.util.List<Product> lista= queryCatByName.getResultList();

        return lista;
    }
}
