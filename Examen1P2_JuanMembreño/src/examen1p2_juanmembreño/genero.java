/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_juanmembreño;

/**
 *
 * @author usuario
 */
public class genero extends libros {
    private String genero;

    public genero() {
    }

    public genero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "genero{" + "genero=" + genero + '}';
    }
    
}
