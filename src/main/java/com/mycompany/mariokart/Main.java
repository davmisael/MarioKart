/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mariokart;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class Main {
    static private Jugador jugador = new Jugador();
    static private Carro carro = new Carro();
    static Scanner scanner = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               
        String seleccion;
        System.out.println("--Bienvenido--\n");
        jugador.getUtilidad().mostrarMarioKart();
        
        do {
            System.out.println("\n¿Acepta los termino y condiciones del juego?");
            System.out.println("1. Aceptar. ");
            System.out.println("2. Leer terminos y condiciones. ");
            System.out.println("3. Salir. ");
            seleccion = scanner.nextLine();
            
            if (seleccion.equalsIgnoreCase("1")){
                System.out.println("Ingrese su Nombre: ");
                jugador.setNombre(scanner.nextLine());
                System.out.println("Ingrese su Nickname: ");
                jugador.setNickname(scanner.nextLine());
                do {
                    System.out.println("Ingrese su Edad: ");
                    String edad = scanner.nextLine();
                    if(jugador.getUtilidad().verificarSiEsNumero(edad)){
                        jugador.setEdad(Integer.valueOf(edad));
                        break;
                    }else{
                        System.out.println("Ingrese una edad Valida. ");
                    }                     
                } while (true);
                jugador.getGarage().elegirCarroInicial(jugador);
                Main.mostrarMenuPrincipal();
                seleccion = "3";
            }else if(seleccion.equalsIgnoreCase("2")){
                System.out.println("\nSolo acepte para empezar el juego\n");
            }else if(seleccion.equalsIgnoreCase("3")){
                System.out.println("Vuelva pronto\n"+"Adios");
            }
            
        } while (!seleccion.equalsIgnoreCase("3"));
    }

    public static void mostrarMenuPrincipal(){
        String seleccionMenu;
        do {
            jugador.mostrarDatosJugador(jugador);
            System.out.println("\nBienvenidos al menu Principal");
            System.out.println("1. Competir");
            System.out.println("2. Ruleta");
            System.out.println("3. Garage");
            System.out.println("4. Pistas");
            System.out.println("5. Estadisticas y Reportes");
            System.out.println("6. Salir");
            seleccionMenu = scanner.nextLine();
            
            if(seleccionMenu.equalsIgnoreCase("1")){
                
            }else if(seleccionMenu.equalsIgnoreCase("2")){
                jugador.getRuleta().girarRuleta(jugador);
            }else if(seleccionMenu.equalsIgnoreCase("3")){
                Main.mostrarMenuGarage();
            }else if(seleccionMenu.equalsIgnoreCase("4")){
                
            }else if(seleccionMenu.equalsIgnoreCase("5")){
                
            }else if(seleccionMenu.equalsIgnoreCase("6")){
                System.out.println("\n--GAME OVER--");
                
            }
        } while (!seleccionMenu.equalsIgnoreCase("6"));
    }
    
    public static  void mostrarMenuGarage(){
        String seleccionMenuGarage;
        
        do {
            jugador.mostrarDatosJugador(jugador);
            System.out.println("\nBienvenidos al menu de tu Garage: ");
            System.out.println("1. Mostrar caracteristicas del carro actual: ");
            System.out.println("2. Mejorar la potencia del motor: ");
            System.out.println("3. Mejorar la calidad de las Llantas: ");
            System.out.println("4. llenar el tanque de gasolina: ");
            System.out.println("5. Cambiar el color del Vehículo: ");
            System.out.println("6. Comprar otro Vehículo: ");
            System.out.println("7. Cambiar de Vehiculo: ");
            System.out.println("8. Regresar al menu principal: ");
            seleccionMenuGarage = scanner.nextLine();
            
            if(seleccionMenuGarage.equalsIgnoreCase("1")){
                jugador.getCarrosDelJugador()[0].mostrarDatosDelCarro(jugador.getCarrosDelJugador()[jugador.getGarage().seleccionGarage]);
            }else if(seleccionMenuGarage.equalsIgnoreCase("2")){
                jugador.getGarage().mostrarMenuMejorarMotor(jugador);
            }else if(seleccionMenuGarage.equalsIgnoreCase("3")){
                jugador.getGarage().mostrarMenuMejorarLlantas(jugador);
            }else if(seleccionMenuGarage.equalsIgnoreCase("4")){
                jugador.getGarage().mostrarMenuAgregarGasolina(jugador);
            }else if(seleccionMenuGarage.equalsIgnoreCase("5")){
                jugador.getGarage().mostrarMenuCambiarColor(jugador);
            }else if(seleccionMenuGarage.equalsIgnoreCase("6")){
                jugador.getGarage().comprarCarro(jugador);
            }else if(seleccionMenuGarage.equalsIgnoreCase("7")){
                jugador.getGarage().mostrarMenuCambiarDeCarro(jugador);
            }else if(seleccionMenuGarage.equalsIgnoreCase("8")){
                System.out.println("Salio del Menu Garage");
                
            }
        } while (!seleccionMenuGarage.equalsIgnoreCase("8"));
        
    }
}