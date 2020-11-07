/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nnextpojo;

import wsprod.Product;
import java.math.BigDecimal;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import wscust.Customer;


/**
 *
 * @author rggh
 */
public class NnextPojo 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      XMLGregorianCalendar fecha = null;
        boolean primero            = true;
        wsprod.Product prod        = new wsprod.Product();
        wsprod.Category cat        = new wsprod.Category();
        
        System.out.println("Son " + count_Product() + " productos");
        System.out.println("--------------Product.findAll() ----------------------------");
        java.util.List<wsprod.Product> lisprod = findAll_Product();
        for(wsprod.Product p:lisprod)
        {
            System.out.println(p.getId() + " " + p.getName() + " " + p.getDescription() + " " +
                    p.getPrice() + " " + p.getLastUpdate() + " Cat:" +
                    p.getCategoryId().getId() + " " + p.getCategoryId().getName());
            if(primero)
            {
              //cat   = p.getCategoryId(); // se obtiene la categoría
              cat.setId(p.getCategoryId().getId());
              cat.setName(p.getCategoryId().getName());
              fecha = p.getLastUpdate();
              primero = false;
            }
        }
        int id = 1;
        System.out.println("-------------------------- id = " + id + " --------------------------");
        System.out.println("El producto con id " + id + " es:");
        wsprod.Product p = find_Product(id);
        System.out.println(p.getId() + " " + p.getName() + " " + p.getDescription() + " " +
                    p.getPrice() + " " + p.getLastUpdate() + " Cat:" +
                    p.getCategoryId().getId() + " " + p.getCategoryId().getName());
        String strByName = "chocolate cookies";
        System.out.println("------------------ name = " + strByName + " ------------------------");
        
        java.util.List<wsprod.Product> prodsName = findByName(strByName);
        prodsName.forEach((pr) -> {
            System.out.println(pr.getId() + " " + pr.getName() + " " + pr.getDescription() + " " +
                    pr.getPrice() + " " + pr.getLastUpdate() + " Cat:" +
                    pr.getCategoryId().getId() + " " + pr.getCategoryId().getName());
        });
           
        prod.setCategoryId(cat);
        prod.setId(0);
        prod.setName("Producto nuevisimo");
        prod.setDescription("Descripcion del producto fase 3");
        prod.setPrice(new BigDecimal(55.0));
        
        XMLGregorianCalendar xmlFecha = null;
        try {
            xmlFecha = DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar());
        } catch (DatatypeConfigurationException ex) {
            Logger.getLogger(NnextPojo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        prod.setLastUpdate(  xmlFecha);
                
        create_Product(prod);
     
        // --------------------------------- Customer --------------------------------  
        wscust.Customer cust = new wscust.Customer();
     
        cust.setCcNumber("ccNumber");
        cust.setCityRegion("MT");
        cust.setEmail("rgamboa@itam.mx");
        cust.setAddress("Rio Hondo 1");
        cust.setPhone("5556284061");
        cust.setName("Rafael Gregorio");
       
        create_customer(cust);
    }
}

