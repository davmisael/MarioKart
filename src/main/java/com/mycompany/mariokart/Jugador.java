/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mariokart;
import com.mycompany.mariokart.Carro;

/**
 *
 * @author David
 */
public class Jugador {
    
    public static final double ORO_INICIAL = 50;
    public static final int GEMAS_INICIALES = 30;
    
    private String nombre;
    private String nickname;
    private int edad;
    private Carro [] carrosDelJugador = new Carro[5];
    private double oro;
    private int gemas;
    private int partidasGanadas;
    private int PartidasJugadas;
    private Garage garage = new Garage();
    private Ruleta ruleta = new Ruleta();
    private Utilidad utilidad;
    
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
    }
        
    public void mostrarDatosJugador(Jugador jugador){
        System.out.println("\n\n" + "Nombre: " + this.nombre);
        System.out.println("Nickname: " + this.nickname);
        System.out.println("Edad: " + this.edad);
        System.out.println("Cantidad de oro: " + this.oro);
        System.out.println("Cantidad de gemas: " + this.gemas);
    }   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
