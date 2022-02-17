/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Fausto
 */
public class Persona {
    
    
    private int iddatospersonal;
    private String dni;
    private String nombre;
    private String tel_fijo;
    private String tel_celular;
    private Date fecha_nacimiento;
    private String correo;
    private Date ingreso;

    public Persona() {
    }

    public Persona(int iddatospersonal, String dni, String nombre, String tel_fijo, String tel_celular, Date fecha_nacimiento, String correo, Date ingreso) {
        this.iddatospersonal = iddatospersonal;
        this.dni = dni;
        this.nombre = nombre;
        this.tel_fijo = tel_fijo;
        this.tel_celular = tel_celular;
        this.fecha_nacimiento = fecha_nacimiento;
        this.correo = correo;
        this.ingreso = ingreso;
    }

    public int getIddatospersonal() {
        return iddatospersonal;
    }

    public void setIddatospersonal(int iddatospersonal) {
        this.iddatospersonal = iddatospersonal;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTel_fijo() {
        return tel_fijo;
    }

    public void setTel_fijo(String tel_fijo) {
        this.tel_fijo = tel_fijo;
    }

    public String getTel_celular() {
        return tel_celular;
    }

    public void setTel_celular(String tel_celular) {
        this.tel_celular = tel_celular;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getIngreso() {
        return ingreso;
    }

    public void setIngreso(Date ingreso) {
        this.ingreso = ingreso;
    }
    

}
