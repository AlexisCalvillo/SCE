/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tstescbailepojo;

/**
 *
 * @author aalex
 */
public class TstEscBailePojo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long t0, t1;
        double deltaT,lngSumDeltaT;
        String cveAlumno,nomAlumno,apMatAlumno,apPatAlumno;
        String strSufAlumno;
        String strCadRes;
        boolean blnRes;
        int NVeces=10;
        
        cveAlumno="cveAl_";
        nomAlumno="nomAl_";
        apPatAlumno="apPatAl_";
        apMatAlumno="apMatAl_";
            
        lngSumDeltaT=0;
        for(int i=0; i<=NVeces;i++)
        {
            strSufAlumno=""+i;
            t0=System.currentTimeMillis();
            blnRes=altaAlumno(cveAlumno+strSufAlumno,
                                nomAlumno+strSufAlumno,
                                apPatAlumno+strSufAlumno,
                                apMatAlumno+strSufAlumno);
            t1=System.currentTimeMillis();
            deltaT=(t1-t0)/1000.0;
            lngSumDeltaT+=deltaT;
            strCadRes=blnRes?"Se ha realizado": "No se pudo realizar "+ "el alta de clave " + cveAlumno + strSufAlumno;
            System.out.println(strCadRes+"En: "+ deltaT+" segundos");
        }
        System.out.println("El tiempo promedio de solicitud es: "+ lngSumDeltaT + " segundos");
        t0=System.currentTimeMillis();
        blnRes=bajaLike(cveAlumno+"*");
        t1=System.currentTimeMillis();
        deltaT=(t1-t0)/1000.0;    
        strCadRes=blnRes?"Se ha realizado la baja like": "No se pudo realizar "+ "la bajaa (like) " + cveAlumno;
        System.out.println(strCadRes+"En: "+ deltaT+" segundos");
    }

    private static boolean altaAlumno(java.lang.String cveAlumno, java.lang.String nombreAlumno, java.lang.String apPaternoAlumno, java.lang.String apMaternoAlumno) {
        wsescbaile.NewWebService_Service service = new wsescbaile.NewWebService_Service();
        wsescbaile.NewWebService port = service.getNewWebServicePort();
        return port.altaAlumno(cveAlumno, nombreAlumno, apPaternoAlumno, apMaternoAlumno);
    }

    private static boolean bajaLike(java.lang.String cveAlumno) {
        tstescbailepojo.Bajas_Service service = new tstescbailepojo.Bajas_Service();
        tstescbailepojo.Bajas port = service.getBajasPort();
        return port.bajaLike(cveAlumno);
    }
    
}
