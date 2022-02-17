/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import vista.VistaPrincipal;

/**
 *
 * @author Fausto
 */
public class ControladorPrincipal {
  
    public static VistaPrincipal ventana = new VistaPrincipal();
    public static void mostrarVentana(){ventana.setVisible(true);}
    public static void centrar(){ventana.setLocationRelativeTo(null);}
    public static void ocultarVentana(){ventana.setVisible(false);}
    
    
    
}
