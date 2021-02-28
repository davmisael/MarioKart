package com.mycompany.mariokart;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class Pista {
    
    private int tamañoDeLaPista;
    private int coeficienteDeLaPista;
    private int gasolinaNecesariaDeLaPista;
    private String colorDeLaPista;
    private String nombreDeLaPista;
    
    public Pista(int tamañoDeLaPista, int coeficienteDeLaPista, int gasolinaNecesariaDeLaPista, String colorDeLaPista,String nombreDeLaPista) {
        this.tamañoDeLaPista = tamañoDeLaPista;
        this.coeficienteDeLaPista = coeficienteDeLaPista;
        this.gasolinaNecesariaDeLaPista = gasolinaNecesariaDeLaPista;
        this.colorDeLaPista = colorDeLaPista;
        this.nombreDeLaPista = nombreDeLaPista;
    }

    
    
    public boolean verificarGasolinaNecesaria(Jugador jugador, Carro carro, Garage garage){
        
        if(jugador.getCarrosDelJugador()[garage.seleccionGarage].getGasolina() <= 80){
            System.out.println("No tiene suficiente Gasolina para competir en esta Pista. ");
            return false;
        }else 
            return true;
    }
}
