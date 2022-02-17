/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.swing.JTextField;
import modelo.Usuario;
import vista.VistaLogin;
/**
 *
 * @author Fausto
 */
public class ControladorLogin {
    
    public static VistaLogin ventana = new VistaLogin();
    public static void mostrarVentana(){ ventana.setVisible(true);}
    public static void centrar(){ventana.setLocationRelativeTo(null);
                                 ventana.setTitle("SISTEMA VETERINARIA");}
    public static void ocultarVentana(){ ventana.setVisible(false);}
    
    
    public static void login(){
        
        Usuario user = new Usuario();
        String usuario = ventana.getTxtUsuario().getText();
        String password = ventana.getTxtPassword().getText();
        Boolean OK;
        OK=user.autenticar(usuario,password);
        if(OK==true){
        ocultarVentana();
        ControladorPrincipal.mostrarVentana();
        ControladorPrincipal.centrar();
        }else{
            limpiar();
        }
    }
    public static void limpiar(){
     
        ventana.getTxtUsuario().setText("");
        ventana.getTxtPassword().setText("");
        ventana.getTxtUsuario().requestFocus();
      
    }
    
}
