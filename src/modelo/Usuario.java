/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import persistencia.UsuarioDAO;

/**
 *
 * @author Fausto
 */
public class Usuario {
    
    private int idusuario;
    private String usuario;
    private String password;
    private String rol;
    private boolean estado;
    private int id_empleado;

    public Usuario() {
    }
    
    

    public Usuario(int idusuario, String usuario, String password, String rol, boolean estado, int id_empleado) {
        this.idusuario = idusuario;
        this.usuario = usuario;
        this.password = password;
        this.rol = rol;
        this.estado = estado;
        this.id_empleado = id_empleado;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idusuario=" + idusuario + ", usuario=" + usuario + ", password=" + password + ", rol=" + rol + ", estado=" + estado + ", id_empleado=" + id_empleado + '}';
    }

    public boolean autenticar(String usuario, String password) {
        
       UsuarioDAO usuarioBD = new UsuarioDAO();
       
       ArrayList<Usuario> datos = new ArrayList<>();
       
       Boolean usuarioEncontrado = false;
       
       datos = usuarioBD.obtenerUsuarios();
       
        for (Usuario dato : datos) {
            System.out.println(dato.toString());
        }
       
        for (Usuario dato : datos) {
            
            if(dato.usuario.equalsIgnoreCase(usuario)&& dato.password.equalsIgnoreCase(password)){
                System.out.println("LOGIN CORRECTO");
                usuarioEncontrado = true;
            }
        }
        
        if(usuarioEncontrado==false){
            System.out.println("USUARIO O CONTRASEÑA INCORRECTA..");
            
        }
        System.out.println(usuarioEncontrado);
     return usuarioEncontrado;
    }
    
    
}
