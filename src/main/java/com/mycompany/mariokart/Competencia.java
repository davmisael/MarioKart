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
public class Competencia {
    public static final Rival RIVAL1 = new Rival("LUIGI");
    public static final Rival RIVAL2 = new Rival("BOWSER");
    public static final Rival RIVAL3 = new Rival("PEACH");
    public static final Rival RIVAL4 = new Rival("TOAD");
    public static final Rival RIVAL5 = new Rival("YOSHI");
    
    public static final Rival[] RIVALES_INICIALES = {RIVAL1,RIVAL2,RIVAL3,RIVAL4,RIVAL5};
    
    public static final Pista  PISTA_TIERRA = new Pista(80,4,"Rojo","PISTA DE TIERRA");
    public static final Pista  PISTA_ARENA = new Pista(90,4,"Amarillo","PISTA DE ARENA");
    public static final Pista  PISTA_CONCRETO = new Pista(100,4,"Blanco","PISTA DE CONCRETO");
    
    public static final Pista[] PISTAS_TOTALES = {PISTA_TIERRA,PISTA_ARENA,PISTA_CONCRETO};
    
    private Rival[] rivales = new Rival[5];
    private Pista[] pista = new Pista[3];
    private int turno;
    private int pistaSeleccionada;
    
    public Competencia() {
        this.rivales = RIVALES_INICIALES;
        this.pista = PISTAS_TOTALES;
        this.turno = turno;
        this.pistaSeleccionada = pistaSeleccionada;
    }
    
    public void seleccionarPista(){
        
    }
    
    public Rival[] getRivales() {
        return rivales;
    }

    public void setRivales(Rival[] rivales) {
        this.rivales = rivales;
    }

    public Pista[] getPista() {
        return pista;
    }

    public void setPista(Pista[] pista) {
        this.pista = pista;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public int getPistaSeleccionada() {
        return pistaSeleccionada;
    }

    public void setPistaSeleccionada(int pistaSeleccionada) {
        this.pistaSeleccionada = pistaSeleccionada;
    }
    
}
