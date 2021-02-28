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
import static com.mycompany.mariokart.Carro.TANQUE_LLENO;

import java.util.Scanner;

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
    
    public static final double COSTO_GALON_DE_GASOLINA = 2.5;
    
    public static final double COSTO_NUEVO_COLOR = 20; // se compra con oro
    
    public static final double COSTO_NUEVO_CARRO = 100; // se compra con oro
    
    public static final Carro CARRO_INICIAL_1 = new Carro(MOTOR_GENERICO,LLANTAS_GENERICAS,100,"negro");
    public static final Carro CARRO_INICIAL_2 = new Carro(MOTOR_GENERICO,LLANTAS_GENERICAS,100,"Blanco");
    public static final Carro CARRO_INICIAL_3 = new Carro(MOTOR_GENERICO,LLANTAS_GENERICAS,100,"Gris");
    
    public static final Carro CARRO_NUEVO = new Carro(MOTOR_GENERICO,LLANTAS_GENERICAS,100,"amarillo");
    
    public static final Carro[] CARROS_INICIALES = {CARRO_INICIAL_1,CARRO_INICIAL_2,CARRO_INICIAL_3};
    
    int seleccionGarage;
    
    Scanner scanner = new Scanner(System.in);

    public Garage() {
        this.seleccionGarage = 0;
    }
    
    
    public void elegirCarroInicial(Jugador jugador){
        String seleccionCarro;
        do {
            System.out.println("\n\nEstos son los carros Iniciales que puedes elegir: ");
            for (int i = 0; i < CARROS_INICIALES.length; i++) {
                System.out.println("Opcion " + (i+1));
                jugador.getCarrosDelJugador()[0].mostrarDatosDelCarro(CARROS_INICIALES[i]);
            }
            System.out.println("Elija el numero que corresponde al Carro que quiere seleccionar");
            seleccionCarro = scanner.nextLine();
            if (seleccionCarro.equalsIgnoreCase("1")){
                Carro[] carroInicialOpcion1 = {CARRO_INICIAL_1, null, null, null, null};
                jugador.setCarrosDelJugador(carroInicialOpcion1);
                break;
            } else if (seleccionCarro.equalsIgnoreCase("2")){
                Carro[] carroInicialOpcion1 = {CARRO_INICIAL_2, null, null, null, null};
                jugador.setCarrosDelJugador(carroInicialOpcion1);
                break;
            } else if (seleccionCarro.equalsIgnoreCase("3")){
                Carro[] carroInicialOpcion1 = {CARRO_INICIAL_1, null, null, null, null};
                jugador.setCarrosDelJugador(carroInicialOpcion1);
                break;
            } else{
                System.out.println("----------Elija un opcion correcta----------");
            }
        } while (true);    
    }
    
    public void mostrarMenuMejorarMotor(Jugador jugador){
        String seleccionMenuMotor;
        
        do {
            jugador.mostrarDatosJugador(jugador);
            System.out.println("\nBienvenidos al Menu mejorar motor: ");
            System.out.println("1. Motor Basico (potencia 4): 5 Gemas");
            System.out.println("2. Motor Medio (potencia 5): 20 Gemas");
            System.out.println("3. Motor de Alto Rendiminto (potencia 7): 35 Gemas");
            System.out.println("4. Regresaar al Menu Garage. ");
            System.out.println("Seleccione ");
            seleccionMenuMotor = scanner.nextLine();
            
            if(seleccionMenuMotor.equalsIgnoreCase("1") ||
               seleccionMenuMotor.equalsIgnoreCase("2")||
               seleccionMenuMotor.equalsIgnoreCase("3")){
               jugador.getGarage().modificarMotor(jugador, seleccionMenuMotor);
            }
        } while (!seleccionMenuMotor.equalsIgnoreCase("4"));
        
    }
    
    public void modificarMotor(Jugador jugador, String seleccionMenuMotor){
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
        
        if(jugador.getCarrosDelJugador()[jugador.getGarage().seleccionGarage].getMotor() == tipoDeMejoraMotor){
                    System.out.println("Ya posee este Motor. ");
        }else {
            if(jugador.getGemas() < costoDelMotor){
                System.out.println("No tiene suficientes Gemas para comprar este Motor. ");
            } else {
                jugador.getCarrosDelJugador()[jugador.getGarage().seleccionGarage].setMotor(tipoDeMejoraMotor);
                jugador.setGemas(jugador.getGemas() - costoDelMotor);
                System.out.println(comproMotor);
            }
        } 
    }
    
    public void mostrarMenuMejorarLlantas(Jugador jugador){
        String seleccionMenuLlantas;
        do {
            jugador.mostrarDatosJugador(jugador);
            System.out.println("\nBienvenidos al Menu mejorar Llantas: ");
            System.out.println("1. Llantas de Calidad Baja (Coeficiente 2): 25 oro");
            System.out.println("2. Llantas de Calidad Media (Coeficiente 3): 50 oro");
            System.out.println("3. Llantas de Calidad Alta (coeficiente 5): 75 oro");
            System.out.println("4. Regresaar al Menu Garage. ");
            System.out.println("Seleccione ");
            seleccionMenuLlantas = scanner.nextLine();
            
            if(seleccionMenuLlantas.equalsIgnoreCase("1") ||
               seleccionMenuLlantas.equalsIgnoreCase("2")||
               seleccionMenuLlantas.equalsIgnoreCase("3")){
               jugador.getGarage().modificarLlantas(jugador, seleccionMenuLlantas);
            }
        } while (!seleccionMenuLlantas.equalsIgnoreCase("4"));
    }
    
    public void modificarLlantas(Jugador jugador, String seleccionMenuLlantas){
        int tipoDeMejoraLlantas = 0;
        double costoDeLasLLantas = 0;
        String comproMotor = "";
        
        
        if(seleccionMenuLlantas.equalsIgnoreCase("1")){
            tipoDeMejoraLlantas = LLANTAS_CALIDAD_BAJA;
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
        
        if(jugador.getCarrosDelJugador()[jugador.getGarage().seleccionGarage].getLlantas() == tipoDeMejoraLlantas){
                    System.out.println("Ya posee estas Lantas. ");
        }else {
            if(jugador.getOro() < costoDeLasLLantas){
                System.out.println("No tiene suficientes Oro para comprar estas Llantas. ");
            } else {
                jugador.getCarrosDelJugador()[jugador.getGarage().seleccionGarage].setLlantas(tipoDeMejoraLlantas);
                jugador.setOro(jugador.getOro() - costoDeLasLLantas);
                System.out.println(comproMotor);
            }
        } 
    }
    
    public void mostrarMenuCambiarColor(Jugador jugador){
        String seleccionMenuColor;
        do {
            jugador.mostrarDatosJugador(jugador);
            System.out.println("\nBienvenidos al Menu cabiar Color de Carro: ");
            System.out.println("1. Color Azul: 20 oro");
            System.out.println("2. Color Rojo: 20 oro");
            System.out.println("3. Color Verde: 20 oro");
            System.out.println("4. Regresaar al Menu Garage. ");
            System.out.println("Seleccione ");
            seleccionMenuColor = scanner.nextLine();
            
            if(seleccionMenuColor.equalsIgnoreCase("1") ||
               seleccionMenuColor.equalsIgnoreCase("2")||
               seleccionMenuColor.equalsIgnoreCase("3")){
                jugador.getGarage().modificarColor(jugador, seleccionMenuColor);
            }
        } while (!seleccionMenuColor.equalsIgnoreCase("4"));
    }
    
    public void mostrarMenuAgregarGasolina(Jugador jugador){
        String seleccionMenuGasolina;
        double costoParaLlenarTanque = ((TANQUE_LLENO - jugador.getCarrosDelJugador()[jugador.getGarage().seleccionGarage].getGasolina()) * COSTO_GALON_DE_GASOLINA);
        int cantidadDeGalones;
        do {
            jugador.mostrarDatosJugador(jugador);
            System.out.println("\nBienvenidos, aqui pudes llanar de gasolina tu autio");
            System.out.println("El auto seleccionado tien " 
                               + jugador.getCarrosDelJugador()[jugador.getGarage().seleccionGarage].getGasolina()
                               + " Galones");
            System.out.println("Cada galon de Gasolina cuesta 2.5 piesas de oro");
            System.out.println("1. Si quieres llenar el tanque de Gasolina");
            System.out.println("2. Si quieres ponerle cierta canitidad de galones de Gasolina");
            System.out.println("3. Regresaar al Menu Garage. ");
            System.out.println("Seleccione ");
            seleccionMenuGasolina = scanner.nextLine();
            
            if(seleccionMenuGasolina.equalsIgnoreCase("1")){
                if(jugador.getCarrosDelJugador()[jugador.getGarage().seleccionGarage].getGasolina() == TANQUE_LLENO){
                    System.out.println("El tanque del Carro esta lleno ");
                }else {
                    if (jugador.getOro() <= costoParaLlenarTanque) {
                        System.out.println("NO tines suficiente oro para llenar de Gasolina el Carro. ");
                    } else{
                        jugador.getCarrosDelJugador()[jugador.getGarage().seleccionGarage].setGasolina(TANQUE_LLENO);
                        jugador.setOro(jugador.getOro() - costoParaLlenarTanque);
                    }
                }
            }else if(seleccionMenuGasolina.equalsIgnoreCase("2")){
                if(jugador.getCarrosDelJugador()[jugador.getGarage().seleccionGarage].getGasolina() == TANQUE_LLENO){
                    System.out.println("El tanque del Carro esta lleno ");
                }else {
                    System.out.println("Ingresa cuantos galoes le quieres agregar a tu auto");
                    cantidadDeGalones = Integer.valueOf(scanner.nextLine());
                    jugador.getCarrosDelJugador()[jugador.getGarage().seleccionGarage].setGasolina(cantidadDeGalones);
                }
            }else if(seleccionMenuGasolina.equalsIgnoreCase("3")){
                System.out.println("---------- Salio del Menu Agregar Gasolina ----------");
            }else {
                System.out.println("Seleccione Una opcion Valida");
            }
        } while (!seleccionMenuGasolina.equalsIgnoreCase("3"));
    }
    
    public void modificarColor(Jugador jugador, String seleccionMenuColor){
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
        
        if(jugador.getCarrosDelJugador()[jugador.getGarage().seleccionGarage].getColor().equalsIgnoreCase(nuevoColor)){
                    System.out.println("El Carro ya es de este Color. ");
        }else {
            if(jugador.getOro() < COSTO_NUEVO_COLOR){
                System.out.println("No tiene suficientes Oro para Cambiar de Color el Carro. ");
            } else {
                jugador.getCarrosDelJugador()[jugador.getGarage().seleccionGarage].setColor(nuevoColor);
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
    
    public void mostrarMenuCambiarDeCarro(Jugador jugador){
        String seleccionMenuCambiarCarro;
        boolean salir = true;
        do {
            for (int i = 0; i < jugador.getCarrosDelJugador().length; i++) {
                    jugador.getCarrosDelJugador()[0].mostrarDatosDelCarro(jugador.getCarrosDelJugador()[i]);
                }
        System.out.println("Seleccione un Carro. ");
        seleccionMenuCambiarCarro = scanner.nextLine();
        
        salir = jugador.getGarage().cambiarDeCarro(jugador, seleccionMenuCambiarCarro);
        } while (salir);   
    }
    
    public boolean cambiarDeCarro(Jugador jugador, String pocionEnGarage){
        if (pocionEnGarage.equals("1") || 
            pocionEnGarage.equals("2") ||
            pocionEnGarage.equals("3") ||
            pocionEnGarage.equals("4") ||
            pocionEnGarage.equals("5")){
            if(jugador.getCarrosDelJugador()[Integer.valueOf(pocionEnGarage)-1] == null){
                System.out.println("No hay carro en este espacio. ");
                return true;
            } else{
                jugador.getGarage().seleccionGarage = Integer.valueOf(pocionEnGarage) -1;
                return false;
            }
        } else{
            System.out.println("Ingrese una posicion valida. ");
            return true;
        }
    }
}
