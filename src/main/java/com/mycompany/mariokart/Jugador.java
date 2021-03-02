/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mariokart;
import com.mycompany.mariokart.Carro;
import com.mycompany.mariokart.Garage;
import com.mycompany.mariokart.Ruleta;
import com.mycompany.mariokart.Utilidad;

/**
 *
 * @author David
 */
public class Jugador extends Persona{
    
    public static final double ORO_INICIAL = 50;
    public static final int GEMAS_INICIALES = 30;
    

    private String nickname;
    private int edad;
    private Carro [] carrosDelJugador = new Carro[5];
    private double oro;
    private int gemas;
    private int partidasGanadas;
    private int PartidasJugadas;
    private Garage garage = new Garage();
    private Ruleta ruleta = new Ruleta();
    private Utilidad utilidad = new Utilidad();
    
    public Jugador() {
        this.nombre = nombre;
        this.nickname = nickname;
        this.edad = edad;
        this.carrosDelJugador = carrosDelJugador;
        this.oro = ORO_INICIAL;
        this.gemas = GEMAS_INICIALES;
        this.partidasGanadas = 0;
        this.PartidasJugadas = 0;
        this.garage = garage;
        this.ruleta = ruleta;
        this.utilidad = utilidad;
        this.posicionEnPodio = 0;
    }
        
    public void mostrarDatosJugador(Jugador jugador){
        System.out.println("\n\n" + "Nombre: " + jugador.getNombre() + "\t" 
                           + "Nickname: " + jugador.getNickname() + "\t"
                           + "Edad: " + jugador.getEdad());
                                   
        System.out.println("Cantidad de oro: " + this.oro);
        System.out.println("Cantidad de gemas: " + this.gemas);
    }   

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Carro[] getCarrosDelJugador() {
        return carrosDelJugador;
    }

    public void setCarrosDelJugador(Carro[] carrosDelJugador) {
        this.carrosDelJugador = carrosDelJugador;
    }
    
    public double getOro() {
        return oro;
    }

    public void setOro(double oro) {
        this.oro = oro;
    }

    public int getGemas() {
        return gemas;
    }

    public void setGemas(int gemas) {
        this.gemas = gemas;
    }

    public Garage getGarage() {
        return garage;
    }   

    public Ruleta getRuleta() {
        return ruleta;
    }

    public Utilidad getUtilidad() {
        return utilidad;
    }
    
}
