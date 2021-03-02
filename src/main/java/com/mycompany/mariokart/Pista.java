package com.mycompany.mariokart;

import java.util.Scanner;

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
    
    Scanner scanner = new Scanner(System.in);
    
    private int tamañoDeLaPista;
    private int coeficienteDeLaPista;
    private String colorDeLaPista;
    private String nombreDeLaPista;
    private String[][] contenidoPista;
    
    public Pista(int tamañoDeLaPista, int coeficienteDeLaPista, 
                String colorDeLaPista, String nombreDeLaPista) {
        this.tamañoDeLaPista = tamañoDeLaPista;
        this.coeficienteDeLaPista = coeficienteDeLaPista;
        this.colorDeLaPista = colorDeLaPista;
        this.nombreDeLaPista = nombreDeLaPista;
        
        int tamañoPista = tamañoDeLaPista + 4;
        
        contenidoPista = new String[14][tamañoPista];

        for(int i = 0; i < 14; i++)
            for(int j=0; j < tamañoPista; j++)
                contenidoPista[i][j] = "  ";
        for(int i = 1; i < 14; i = i+2)
            for(int j=0; j < tamañoPista; j++)
                contenidoPista[i][j] = "_ _ _ _";
        for(int i = 2; i < 14 ; i = i+2)
            contenidoPista[i][0] = "Player ";
        for(int j = 3; j < tamañoPista; j++)
            contenidoPista[0][j] = (j-2)+"";
        contenidoPista[0][1] = "INICIO";
        contenidoPista[0][tamañoPista-1] = "-META-";
        
    }

    public void mostrarMenuPistas(Competencia competencia){
        String seleccionMenuPistas;
        do {
            System.out.println("\nBienvenido al menu Pistas");
            System.out.println("Tenemos 3 clases de Pistas: ");
            System.out.println("1. Pista de Tierra. ");
            System.out.println("2. Pista de Arena. ");
            System.out.println("3. Pista de Concreto. ");
            System.out.println("4. salir. ");
            System.out.println("Elige que pista quieres ver y sus caracteristicas. ");
            seleccionMenuPistas = scanner.nextLine();
            if(seleccionMenuPistas.equalsIgnoreCase("1")){
                competencia.setPistaSeleccionada(Integer.valueOf(seleccionMenuPistas) - 1);
                System.out.println("\nEsta pista esta formada por Tierra");
                System.out.println("La Pista tien un total de: 80 Casilla");
                System.out.println("La pista es de color: Rojo");
                System.out.println("La pista tiene un coeficiente de dificultad: 4\n2");
                imprimirPista(competencia);
            }else if(seleccionMenuPistas.equalsIgnoreCase("2")){
                competencia.setPistaSeleccionada(Integer.valueOf(seleccionMenuPistas) - 1);
                System.out.println("\nEsta pista esta formada por Arena");
                System.out.println("La Pista tien un total de: 90 Casilla");
                System.out.println("La pista es de color: Amarillo");
                System.out.println("La pista tiene un coeficiente de dificultad: 2\n");
                imprimirPista(competencia);
            }else if(seleccionMenuPistas.equalsIgnoreCase("3")){
                competencia.setPistaSeleccionada(Integer.valueOf(seleccionMenuPistas) - 1);
                System.out.println("\nEsta pista esta formada por Concreto");
                System.out.println("La Pista tien un total de: 100 Casilla");
                System.out.println("La pista es de color: Rojo");
                System.out.println("La pista tiene un coeficiente de dificultad: 6\n");
                imprimirPista(competencia);
            }else
                System.out.println("Escriba uan opcion Valida");
                
        } while (!seleccionMenuPistas.equalsIgnoreCase("3")); 
    }
    
    
    public void imprimirPista(Competencia competencia){
        for(int i=0; i < 14; i++)
        {
            for(int j=0; j < competencia.getPista()[competencia.getPistaSeleccionada()].tamañoDeLaPista + 4; j++)
            {
                System.out.print(competencia.getPista()[competencia.getPistaSeleccionada()].contenidoPista[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
    public boolean verificarGasolinaNecesaria(Jugador jugador, Competencia competencia){
        
        if(true){
            System.out.println("No tiene suficiente Gasolina para competir en esta Pista. ");
            return false;
        }else 
            return true;
    }
}
