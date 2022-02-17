/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.*;
import java.util.ArrayList;
import modelo.Usuario;
/**
 *
 * @author Fausto
 */
public class UsuarioDAO {
    
    private Conexion conexcion = new Conexion();
    private PreparedStatement ps;
    private ResultSet rs;
    
    private Connection cn;
    
    public ArrayList<Usuario> obtenerUsuarios(){
        
      ArrayList<Usuario> usuarios = new ArrayList<>();
      
      String consulta_sql = "select * from usuario";
      
        try {
            cn = conexcion.conectar();
            ps = cn.prepareStatement(consulta_sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Usuario usuario = new Usuario();
                usuario.setIdusuario(rs.getInt(1));
                usuario.setUsuario(rs.getString(2));
                usuario.setPassword(rs.getString(3));
                usuario.setRol(rs.getString(4));
                usuario.setEstado(rs.getBoolean(5));
                usuario.setId_empleado(rs.getInt(6));
                
                usuarios.add(usuario);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
      return usuarios;
    }
    
}
