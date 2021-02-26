/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mariokart;

import static com.mycompany.mariokart.Carro.MOTOR_GENERICO;
import static com.mycompany.mariokart.Carro.MOTOR_BASICO;
import static com.mycompany.mariokart.Carro.MOTOR_MEDIO;
import static com.mycompany.mariokart.Carro.MOTOR_ALTO_RENDIMIENTO;

import static com.mycompany.mariokart.Carro.LLANTAS_GENERICAS;
import static com.mycompany.mariokart.Carro.LLANTAS_CALIDAD_ALTA;
import static com.mycompany.mariokart.Carro.LLANTAS_CALIDAD_BAJA;
import static com.mycompany.mariokart.Carro.LLANTAS_CALIDAD_MEDIA;

/**
 *
 * @author David
 */
public class Garage {
    
    public static final int COSTO_MOTOR_BASICO = 5; // Se compra con gemas
    public static final int COSTO_MOTOR_MEDIO = 20;
    public static final int COSTO_MOTOR_ALTO_RENDIMIENTO = 35;
    
    public static final double COSTO_LLANTAS_CALIDAD_BAJA = 25; // se compra con oro
    public static final double COSTO_LLANTAS_CALIDAD_MEDIA = 50;
    public static final double COSTO_LLANTAS_CALIDAD_ALTA = 75;
    
    public static final double COSTO_NUEVO_COLOR = 20; // se compra con oro
    
    public static final double COSTO_NUEVO_CARRO = 100; // se compra con oro
    
    public static final Carro carroInicial1 = new Carro(MOTOR_GENERICO,LLANTAS_GENERICAS,100,"negro");
    public static final Carro carroInicial2 = new Carro(MOTOR_GENERICO,LLANTAS_GENERICAS,100,"Blanco");
    public static final Carro carroInicial3 = new Carro(MOTOR_GENERICO,LLANTAS_GENERICAS,100,"Gris");
    public static final Carro CARRO_NUEVO = new Carro(MOTOR_GENERICO,LLANTAS_GENERICAS,100,"amarillo");
    
    Carro[] carrosIniciales = {carroInicial1,carroInicial2,carroInicial3};
    
    int seleccionGarage;

    public Garage() {
        this.seleccionGarage = 0;
    }
    
    public void modificarMotor(Jugador jugador, Garage garage, String seleccionMenuMotor){
        int tipoDeMejoraMotor = 0;
        int costoDelMotor = 0;
        String comproMotor = "";
        
        
        if(seleccionMenuMotor.equalsIgnoreCase("1")){
            tipoDeMejoraMotor = MOTOR_BASICO;
            costoDelMotor = COSTO_MOTOR_BASICO;
            comproMotor = "Compro el Motor Basico. ";
        } else if(seleccionMenuMotor.equalsIgnoreCase("2")){
            tipoDeMejoraMotor = MOTOR_MEDIO;
            costoDelMotor = COSTO_MOTOR_MEDIO;
            comproMotor = "Compro el Motor de Medio Rendimiento. ";
        } else if(seleccionMenuMotor.equalsIgnoreCase("3")){
            tipoDeMejoraMotor = MOTOR_ALTO_RENDIMIENTO;
            costoDelMotor = COSTO_MOTOR_ALTO_RENDIMIENTO;
            comproMotor = "Compro el Motor de Alto Rendimeinto. ";
        }
        
        if(jugador.getCarrosDelJugador()[garage.seleccionGarage].getMotor() == tipoDeMejoraMotor){
                    System.out.println("Ya posee este Motor. ");
        }else {
            if(jugador.getGemas() < costoDelMotor){
                System.out.println("No tiene suficientes Gemas para comprar este Motor. ");
            } else {
                jugador.getCarrosDelJugador()[garage.seleccionGarage].setMotor(tipoDeMejoraMotor);
                jugador.setGemas(jugador.getGemas() - costoDelMotor);
                System.out.println(comproMotor);
            }
        } 
    }
    
    public void modificarLlantas(Jugador jugador, Garage garage, String seleccionMenuLlantas){
        int tipoDeMejoraLlantas = 0;
        double costoDeLasLLantas = 0;
        String comproMotor = "";
        
        
        if(seleccionMenuLlantas.equalsIgnoreCase("1")){
            tipoDeMejoraLlantas = LLANTAS_CALIDAD_MEDIA;
            costoDeLasLLantas = COSTO_LLANTAS_CALIDAD_BAJA;
            comproMotor = "Compro las Llantas de calidad Baja. ";
        } else if(seleccionMenuLlantas.equalsIgnoreCase("2")){
            tipoDeMejoraLlantas = LLANTAS_CALIDAD_MEDIA;
            costoDeLasLLantas = COSTO_LLANTAS_CALIDAD_MEDIA;
            comproMotor = "Compro las Llantas de calidad Media. ";
        } else if(seleccionMenuLlantas.equalsIgnoreCase("3")){
            tipoDeMejoraLlantas = LLANTAS_CALIDAD_ALTA;
            costoDeLasLLantas = COSTO_LLANTAS_CALIDAD_ALTA;
            comproMotor = "Compro las Llantas de calidad Alta. ";
        }
        
        if(jugador.getCarrosDelJugador()[garage.seleccionGarage].getLlantas() == tipoDeMejoraLlantas){
                    System.out.println("Ya posee estas Lantas. ");
        }else {
            if(jugador.getOro() < costoDeLasLLantas){
                System.out.println("No tiene suficientes Oro para comprar estas Llantas. ");
            } else {
                jugador.getCarrosDelJugador()[garage.seleccionGarage].setLlantas(tipoDeMejoraLlantas);
                jugador.setOro(jugador.getOro() - costoDeLasLLantas);
                System.out.println(comproMotor);
            }
        } 
    }
    
    public void modificarColor(Jugador jugador, Garage garage, String seleccionMenuColor){
        String nuevoColor = "";
        String comproColor = "";
        
        
        if(seleccionMenuColor.equalsIgnoreCase("1")){
            nuevoColor = "Azul";
            comproColor = "Ahora el Carro es de Color Azul. ";
        } else if(seleccionMenuColor.equalsIgnoreCase("2")){
            nuevoColor = "Rojo";
            comproColor = "Ahora el Carro es de Color Rojo. ";
        } else if(seleccionMenuColor.equalsIgnoreCase("3")){
            nuevoColor = "verde";
            comproColor = "Ahora el Carro es de Color Verde. ";
        }
        
        if(jugador.getCarrosDelJugador()[garage.seleccionGarage].getColor().equalsIgnoreCase(nuevoColor)){
                    System.out.println("El Carro ya es de este Color. ");
        }else {
            if(jugador.getOro() < COSTO_NUEVO_COLOR){
                System.out.println("No tiene suficientes Oro para Cambiar de Color el Carro. ");
            } else {
                jugador.getCarrosDelJugador()[garage.seleccionGarage].setColor(nuevoColor);
                jugador.setOro(jugador.getOro() - COSTO_NUEVO_COLOR);
                System.out.println(comproColor);
            }
        } 
    }
    
    public int verificarEspacioEnGarage(Jugador jugador){
        int espacioVacio = -1;
        for (int i = 0; i < jugador.getCarrosDelJugador().length; i++) {
            if(jugador.getCarrosDelJugador()[i] == null){
                espacioVacio = i;
                break;
            }       
        }
        return espacioVacio;
    }
    
    public void comprarCarro(Jugador jugador){
        if(verificarEspacioEnGarage(jugador) == -1){
            System.out.println("No tiene espacio para agregar otro Carro. ");
        }else {
            if(jugador.getOro() >= COSTO_NUEVO_CARRO){
            jugador.getCarrosDelJugador()[verificarEspacioEnGarage(jugador)] = CARRO_NUEVO;
            jugador.setOro(jugador.getOro() - COSTO_NUEVO_CARRO);
            } else
                System.out.println("No tiene suficiente dinero para comprar un Carro Nuevo. ");
        }
    } 
    
    public boolean cambiarDeCarro(Jugador jugador, Garage garage, String pocionEnGarage){
        if (pocionEnGarage.equals("1") || 
            pocionEnGarage.equals("2") ||
            pocionEnGarage.equals("3") ||
            pocionEnGarage.equals("4") ||
            pocionEnGarage.equals("5")){
            if(jugador.getCarrosDelJugador()[Integer.valueOf(pocionEnGarage)-1] == null){
                System.out.println("No hay carro en este espacio. ");
                return true;
            } else{
                garage.seleccionGarage = Integer.valueOf(pocionEnGarage) -1;
                return false;
            }
        } else{
            System.out.println("Ingrese una posicion valida. ");
            return true;
        }
    }
}
