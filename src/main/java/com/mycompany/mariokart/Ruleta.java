/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mariokart;
import java.util.Random;

/**
 *
 * @author David
 */
public class Ruleta {
    Random random = new Random();
    private double oro;
    private int gemas;

    public Ruleta() {
        this.oro = 0;
        this.gemas = 0;
    }
    
    public void girarRuleta(Jugador jugador){
        oro = 0;
        gemas = 0;
        
        int numeroRuleta = (int)(Math.random()*100+1);
        
        if (numeroRuleta <= 10){
            oro = 0;
            gemas = gemas + 40;
        } else if (numeroRuleta <= 25){
           oro = oro + 75;
           gemas = 0;
        } else if (numeroRuleta <= 30){
            oro = 0;
            gemas = gemas + 1000;
        }else if (numeroRuleta <= 35){
            oro = oro + 2000;
            gemas = 0;
        }else if (numeroRuleta <= 65){
            oro = 0;
            gemas = gemas + 5;
        }else {
            oro = oro + 10;
            gemas = 0;
        }
        
        jugador.setOro(jugador.getOro() + jugador.getRuleta().getOro());
        jugador.setGemas(jugador.getGemas()+ jugador.getRuleta().getGemas());
    }

    public double getOro() {
        return oro;
    }

    public int getGemas() {
        return gemas;
    }

}
