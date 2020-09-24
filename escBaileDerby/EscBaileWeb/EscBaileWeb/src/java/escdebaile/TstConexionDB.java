/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escdebaile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author aalex
 */
public class TstConexionDB {
    public static void main(String[] args) {
        String connectionURL = "jdbc:derby://localhost:1527/EscDeBaile";
//ConnectionURL, username and password should be specified in getConnection()
        try {
            Connection conn = DriverManager.getConnection(connectionURL, "rafa", "rafa");
            System.out.println("Connect successfully ! ");
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Connect failed ! ");
        }
    }
}
