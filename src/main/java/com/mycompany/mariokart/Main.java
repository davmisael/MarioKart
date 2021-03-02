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
//    static private Jugador jugador = new Jugador();
    static Scanner scanner = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Jugador jugador = new Jugador();
        
        String seleccion;
        
        System.out.println("--Bienvenido--\n");
        //jugador.getUtilidad().mostrarMarioKart();
        
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
                Main.mostrarMenuPrincipal(jugador);
                seleccion = "3";
            }else if(seleccion.equalsIgnoreCase("2")){
                System.out.println("\nSolo acepte para empezar el juego\n");
            }else if(seleccion.equalsIgnoreCase("3")){
                System.out.println("Vuelva pronto\n"+"Adios");
            }
            
        } while (!seleccion.equalsIgnoreCase("3"));
    }

    public static void mostrarMenuPrincipal(Jugador jugador){
        Competencia competencia = new Competencia();
        
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
                System.out.println(competencia.getRivales()[0].getNombre());
                competencia.getRivales()[0].getCarro().mostrarDatosDelCarro(competencia.getRivales()[0].getCarro());
            }else if(seleccionMenu.equalsIgnoreCase("2")){
                jugador.getRuleta().mostrarMenuRuleta(jugador);
            }else if(seleccionMenu.equalsIgnoreCase("3")){
                jugador.getGarage().mostrarMenuGarage(jugador);
            }else if(seleccionMenu.equalsIgnoreCase("4")){
                competencia.getPista()[0].mostrarMenuPistas(competencia);
            }else if(seleccionMenu.equalsIgnoreCase("5")){
                
            }else if(seleccionMenu.equalsIgnoreCase("6")){
                System.out.println("\n--GAME OVER--");
                
            }
        } while (!seleccionMenu.equalsIgnoreCase("6"));
    }
}