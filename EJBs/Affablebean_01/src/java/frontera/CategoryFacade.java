/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontera;

import entidades.Category;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author aalex
 */
@Stateless
public class CategoryFacade extends AbstractFacade<Category> {

    @PersistenceContext(unitName = "Affablebean_01PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CategoryFacade() {
        super(Category.class);
    }
    
     public java.util.List<Category> findByName(String nombre)
    {
        em = getEntityManager();
        TypedQuery<Category> queryCatByName = em.createNamedQuery("Category.findByName", Category.class);
        queryCatByName.setParameter("name", nombre);
        java.util.List<Category> lista= queryCatByName.getResultList();

        return lista;
    }
     
      public java.util.List<Category> findByNameLike(String nombre)
    {
        em = getEntityManager();
        TypedQuery<Category> queryCatByName = em.createNamedQuery("Category.findByNameLike", Category.class);
        queryCatByName.setParameter("name", nombre);
        java.util.List<Category> lista= queryCatByName.getResultList();

        return lista;
    }
    
}
