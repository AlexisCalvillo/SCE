/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tstwsprodpojo;

/**
 *
 * @author aalex
 */
public class Tstwsprodpojo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Son "+ count() + " productos");
        java.util.List<wsprod.Product> lista = findAll();
        for (wsprod.Product prod:lista) {
            System.out.println(prod.getId() + "---" + prod.getName() + "---" + prod.getCategoryId().getId());
        }
        
    }

    private static int count() {
        wsprod.WSProd_Service service = new wsprod.WSProd_Service();
        wsprod.WSProd port = service.getWSProdPort();
        return port.count();
    }

    private static java.util.List<wsprod.Product> findAll() {
        wsprod.WSProd_Service service = new wsprod.WSProd_Service();
        wsprod.WSProd port = service.getWSProdPort();
        return port.findAll();
    }

    private static java.util.List<wsprod.Product> findByName(java.lang.String name) {
        wsprod.WSProd_Service service = new wsprod.WSProd_Service();
        wsprod.WSProd port = service.getWSProdPort();
        return port.findByName(name);
    }
    
}
