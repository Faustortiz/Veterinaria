
package controlador;

import persistencia.*;
/**
 *
 * @author Fausto
 */
public class Principal {


    public static void main(String[] args) {
       
        Conexion conexion = new Conexion();
        
        conexion.conectar();
        ControladorLogin.centrar();
        ControladorLogin.mostrarVentana();
    }
    
}
