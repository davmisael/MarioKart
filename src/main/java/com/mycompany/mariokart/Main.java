/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mariokart;
import static com.mycompany.mariokart.Carro.TANQUE_LLENO;
import static com.mycompany.mariokart.Garage.carroInicial1;
import static com.mycompany.mariokart.Garage.carroInicial2;
import static com.mycompany.mariokart.Garage.carroInicial3;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class Main {
    static private Jugador jugador = new Jugador();
    static private Carro carro = new Carro();
    static private Garage garage = new Garage();
    static private Ruleta ruleta = new Ruleta();
    static private Utilidad utilidad = new Utilidad();
    static Scanner scanner = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               
        String seleccion;
        System.out.println("--Bienvenido--\n");
        
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
                    if(utilidad.verificarSiEsNumero(edad)){
                        jugador.setEdad(Integer.valueOf(edad));
                        break;
                    }else{
                        System.out.println("Ingrese una edad Valida. ");
                    }                     
                } while (true);
                Main.elegirCarroInicial();
                Main.mostrarMenuPrincipal();
                seleccion = "3";
            }else if(seleccion.equalsIgnoreCase("2")){
                System.out.println("\nSolo acepte para empezar el juego\n");
            }else if(seleccion.equalsIgnoreCase("3")){
                System.out.println("Vuelva pronto\n"+"Adios");
            }
            
        } while (!seleccion.equalsIgnoreCase("3"));
        
        jugador.mostrarDatosJugador(jugador);
        
        for (int i = 0; i < jugador.getCarrosDelJugador().length; i++) {
            carro.mostrarDatosDelCarro(jugador.getCarrosDelJugador()[i]);
        }   
    }
    
    public static void elegirCarroInicial(){
        String seleccionCarro;
        
        System.out.println("\n\nEstos son los carros Iniciales que puedes elegir: ");
        for (int i = 0; i < garage.carrosIniciales.length; i++) {
            System.out.println("Opcion " + (i+1));
            carro.mostrarDatosDelCarro(garage.carrosIniciales[i]);
        }
        System.out.println("Elija el numero que corresponde al Carro que quiere seleccionar");
        
        do {
            seleccionCarro = scanner.nextLine();
            if (seleccionCarro.equalsIgnoreCase("1")){
                Carro[] carroInicialOpcion1 = {carroInicial1, null, null, null, null};
                jugador.setCarrosDelJugador(carroInicialOpcion1);
                break;
            } else if (seleccionCarro.equalsIgnoreCase("2")){
                Carro[] carroInicialOpcion1 = {carroInicial2, null, null, null, null};
                jugador.setCarrosDelJugador(carroInicialOpcion1);
                break;
            } else if (seleccionCarro.equalsIgnoreCase("3")){
                Carro[] carroInicialOpcion1 = {carroInicial3, null, null, null, null};
                jugador.setCarrosDelJugador(carroInicialOpcion1);
                break;
            } else{
                System.out.println("----------Elija un opcion correcta----------");
            }
        } while (true);    
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
                ruleta.girarRuleta();
                jugador.setOro(jugador.getOro() + ruleta.getOro());
                jugador.setGemas(jugador.getGemas()+ ruleta.getGemas());
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
                carro.mostrarDatosDelCarro(jugador.getCarrosDelJugador()[garage.seleccionGarage]);
            }else if(seleccionMenuGarage.equalsIgnoreCase("2")){
                Main.mostrarMenuMejorarMotor();
            }else if(seleccionMenuGarage.equalsIgnoreCase("3")){
                Main.mostrarMenuMejorarLlantas();
            }else if(seleccionMenuGarage.equalsIgnoreCase("4")){
                Main.mostrarMenuAgregarGasolina();
            }else if(seleccionMenuGarage.equalsIgnoreCase("5")){
                Main.mostrarMenuCambiarColor();
            }else if(seleccionMenuGarage.equalsIgnoreCase("6")){
                garage.comprarCarro(jugador);
            }else if(seleccionMenuGarage.equalsIgnoreCase("7")){
                Main.mostrarMenuCambiarDeCarro();
            }else if(seleccionMenuGarage.equalsIgnoreCase("8")){
                System.out.println("Salio del Menu Garage");
                
            }
        } while (!seleccionMenuGarage.equalsIgnoreCase("8"));
        
    }
    
    public static void mostrarMenuMejorarMotor(){
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
                garage.modificarMotor(jugador, garage, seleccionMenuMotor);
            }
        } while (!seleccionMenuMotor.equalsIgnoreCase("4"));
        
    }
    
    public static void mostrarMenuMejorarLlantas(){
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
                garage.modificarMotor(jugador, garage, seleccionMenuLlantas);
            }
        } while (!seleccionMenuLlantas.equalsIgnoreCase("4"));
    }
    
    public static void mostrarMenuCambiarColor(){
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
                garage.modificarColor(jugador, garage, seleccionMenuColor);
            }
        } while (!seleccionMenuColor.equalsIgnoreCase("4"));
    }
    
    public static void mostrarMenuAgregarGasolina(){
        String seleccionMenuGasolina;
        int cantidadDeGalones;
        
        do {
            jugador.mostrarDatosJugador(jugador);
            System.out.println("\nBienvenidos, aqui pudes llanar de gasolina tu autio");
            System.out.println("Cada galon de Gasolina cuesta 2.5 piesas de oro");
            System.out.println("1. Si quieres llenar el tanque de Gasolina");
            System.out.println("2. Si quieres ponerle cierta canitidad de galones de Gasolina");
            System.out.println("3. Regresaar al Menu Garage. ");
            System.out.println("Seleccione ");
            seleccionMenuGasolina = scanner.nextLine();
            
            if(seleccionMenuGasolina.equalsIgnoreCase("1")){
                if(jugador.getCarrosDelJugador()[garage.seleccionGarage].getGasolina() == TANQUE_LLENO){
                    System.out.println("El tanque del Carro esta lleno ");
                }else {
                    jugador.getCarrosDelJugador()[garage.seleccionGarage].setGasolina(TANQUE_LLENO);
                }
            }else if(seleccionMenuGasolina.equalsIgnoreCase("2")){
                if(jugador.getCarrosDelJugador()[garage.seleccionGarage].getGasolina() == TANQUE_LLENO){
                    System.out.println("El tanque del Carro esta lleno ");
                }else {
                    System.out.println("Ingresa cuantos galoes le quieres agregar a tu auto");
                    cantidadDeGalones = Integer.valueOf(scanner.nextLine());
                    jugador.getCarrosDelJugador()[garage.seleccionGarage].setGasolina(cantidadDeGalones);
                }
            }else if(seleccionMenuGasolina.equalsIgnoreCase("3")){
                System.out.println("---------- Salio del Menu Agregar Gasolina ----------");
            }else {
                System.out.println("Seleccione Una opcion Valida");
            }
        } while (!seleccionMenuGasolina.equalsIgnoreCase("3"));
    }
    
    public static void mostrarMenuCambiarDeCarro(){
        String seleccionMenuCambiarCarro;
        boolean salir = true;
        do {
            for (int i = 0; i < jugador.getCarrosDelJugador().length; i++) {
                    carro.mostrarDatosDelCarro(jugador.getCarrosDelJugador()[i]);
                }
        System.out.println("Seleccione un Carro. ");
        seleccionMenuCambiarCarro = scanner.nextLine();
        salir = garage.cambiarDeCarro(jugador, garage, seleccionMenuCambiarCarro);
        } while (salir);
        
        
    }
}