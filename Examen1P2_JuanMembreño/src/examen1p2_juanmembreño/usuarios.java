/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_juanmembreño;

import java.util.Date;

/**
 *
 * @author usuario
 */
public class usuarios {
    private String nombreusuario;
    private String contraseña;
    private Date fechadenacimiento;
    private int numtel;
    private String nombrecompleto;
    private String generofav;

    public usuarios() {
    }

    public usuarios(String nombreusuario, String contraseña) {
        this.nombreusuario = nombreusuario;
        this.contraseña = contraseña;
    }

    public usuarios(String nombreusuario, String contraseña, Date fechadenacimiento, int numtel, String nombrecompleto, String generofav) {
        this.nombreusuario = nombreusuario;
        this.contraseña = contraseña;
        this.fechadenacimiento = fechadenacimiento;
        this.numtel = numtel;
        this.nombrecompleto = nombrecompleto;
        this.generofav = generofav;
    }

    public usuarios(String nombreusuario, String contraseña, int numtel, String generofav) {
        this.nombreusuario = nombreusuario;
        this.contraseña = contraseña;
        this.numtel = numtel;
        this.generofav = generofav;
    }
    

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Date getFechadenacimiento() {
        return fechadenacimiento;
    }

    public void setFechadenacimiento(Date fechadenacimiento) {
        this.fechadenacimiento = fechadenacimiento;
    }

    public int getNumtel() {
        return numtel;
    }

    public void setNumtel(int numtel) {
        this.numtel = numtel;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
    }

    public String getGenerofav() {
        return generofav;
    }

    public void setGenerofav(String generofav) {
        this.generofav = generofav;
    }

    @Override
    public String toString() {
        return "usuarios{" + "nombreusuario=" + nombreusuario + ", contrase\u00f1a=" + contraseña + ", fechadenacimiento=" + fechadenacimiento + ", numtel=" + numtel + ", nombrecompleto=" + nombrecompleto + ", generofav=" + generofav + '}';
    }
    
}
