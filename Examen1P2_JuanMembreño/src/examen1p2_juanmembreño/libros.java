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
public class libros {

    private String titulo;
    private String descripcion;
    private int puntaje;
    private int copiasdis;
    private String genero;
    private int valor;
    private int edicion;
    private String autor;
    private Date añop;

    public libros() {
    }

    public libros(String titulo, String descripcion, int puntaje, int copiasdis, String genero, int valor, int edicion, String autor, Date añop) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.puntaje = puntaje;
        this.copiasdis = copiasdis;
        this.genero = genero;
        this.valor = valor;
        this.edicion = edicion;
        this.autor = autor;
        this.añop = añop;
    }

    public libros(String genero) {
        this.genero = genero;
    }
    

  

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getCopiasdis() {
        return copiasdis;
    }

    public void setCopiasdis(int copiasdis) {
        this.copiasdis = copiasdis;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getAñop() {
        return añop;
    }

    public void setAñop(Date añop) {
        this.añop = añop;
    }

    @Override
    public String toString() {
        return "libros{" + "titulo=" + titulo + ", descripcion=" + descripcion + ", puntaje=" + puntaje + ", copiasdis=" + copiasdis + ", genero=" + genero + ", valor=" + valor + ", edicion=" + edicion + ", autor=" + autor + ", a\u00f1op=" + añop + '}';
    }

    
    

}
