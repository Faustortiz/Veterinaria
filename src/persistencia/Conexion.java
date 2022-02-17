/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Fausto
 */
public class Conexion {
    
    private Connection conexion;
    private String URL = "jdbc:mysql://localhost/veterinaria";
    private String USER = "root";
    private String PASS = "";
    
    public Connection conectar(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USER, PASS);
            
            System.out.println("CONEXION EXITOSA A LA BASE DE DATOS");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return conexion;
    }
    
    
    
}
