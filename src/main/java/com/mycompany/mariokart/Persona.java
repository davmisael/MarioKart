/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mariokart;

/**
 *
 * @author David
 */
public class Persona {
    protected String nombre;
    protected int posicionEnPodio;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.posicionEnPodio = 0;
    }
    public Persona(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosicionEnPodio() {
        return posicionEnPodio;
    }

    public void setPosicionEnPocio(int posicionEnPodio) {
        this.posicionEnPodio = posicionEnPodio;
    }
    
}
