/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tstwsjson;

import java.time.LocalDate;
import org.json.JSONObject;
import tstjson_00.ClsPersona;

/**
 *
 * @author aalex
 */
public class TstWSJson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String strJson = obtenPersona(1L);
        System.out.println("strJsonPersona: \n " + strJson);
         ClsPersona op = new ClsPersona();
        JSONObject ojop = new JSONObject(strJson);
        //System.out.println("\n--------------------------\nojop");
        //System.out.println(ojop);
        op.setApMaterno(ojop.getString("apPaterno"));
        op.setApPaterno(ojop.getString("apMaterno"));
        op.setNombre(ojop.getString("nombre"));
        LocalDate ld = LocalDate.parse(ojop.getString("fechaNac"));
        op.setFechaNac(ld);
    }

    private static String obtenPersona(long idPersona) {
        tstwsjson.WsJsonPersona_Service service = new tstwsjson.WsJsonPersona_Service();
        tstwsjson.WsJsonPersona port = service.getWsJsonPersonaPort();
        return port.obtenPersona(idPersona);
    }
        
}
