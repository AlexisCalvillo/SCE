/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tstejbmessagepojo;

/**
 *
 * @author aalex
 */
public class TstEJBMessagePojo {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int id=1;
        Message msg = find(id);
        System.out.println("msg: " + msg.getId() + " -> " + msg.getMessage());
        java.util.List<tstejbmessagepojo.Message> listMessagges = findAll();
        
        //Creación de mensajes aleatorios
        tstejbmessagepojo.Message nuevoMsj = new tstejbmessagepojo.Message();
        for (int i = 0; i < 10; i++) {
            nuevoMsj.setMessage("Mensaje nuevo número "+ i );
            create( nuevoMsj );
        }
        
        listMessagges.forEach( (messagge)->{
            System.out.println("El mensaje con ID: " + messagge.getId() + " es " + messagge.getMessage());
        });
        
        //Edit de mensaje
        tstejbmessagepojo.Message msjEditado = new tstejbmessagepojo.Message();
        msjEditado.setId(new Long(1));
        msjEditado.setMessage("Se editó el perro");
        edit(msjEditado);
        creaMensaje("Mensaje creado con string");
        listMessagges = findAll();
        listMessagges.forEach( (messagge)->{
            System.out.println("El mensaje con ID: " + messagge.getId() + " es " + messagge.getMessage());
        });
    }

    private static Message find(int id) {
        tstejbmessagepojo.WSMensajes_Service service = new tstejbmessagepojo.WSMensajes_Service();
        tstejbmessagepojo.WSMensajes port = service.getWSMensajesPort();
        return port.find(id);
    }

    private static java.util.List<tstejbmessagepojo.Message> findAll() {
        tstejbmessagepojo.WSMensajes_Service service = new tstejbmessagepojo.WSMensajes_Service();
        tstejbmessagepojo.WSMensajes port = service.getWSMensajesPort();
        return port.findAll();
    }

    private static void create(tstejbmessagepojo.Message entity) {
        tstejbmessagepojo.WSMensajes_Service service = new tstejbmessagepojo.WSMensajes_Service();
        tstejbmessagepojo.WSMensajes port = service.getWSMensajesPort();
        port.create(entity);
    }

    private static void edit(tstejbmessagepojo.Message entity) {
        tstejbmessagepojo.WSMensajes_Service service = new tstejbmessagepojo.WSMensajes_Service();
        tstejbmessagepojo.WSMensajes port = service.getWSMensajesPort();
        port.edit(entity);
    }

    private static boolean creaMensaje(java.lang.String strMensaje) {
        tstejbmessagepojo.WSMensajes_Service service = new tstejbmessagepojo.WSMensajes_Service();
        tstejbmessagepojo.WSMensajes port = service.getWSMensajesPort();
        return port.creaMensaje(strMensaje);
    }
 
    
    
    
    
}
