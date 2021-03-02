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
public class Utilidad {
    
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    
    public static final String ANSI_RESET = "\u001B[0m";
    
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    
    public Utilidad(){
    }
    
    public boolean verificarSiEsNumero(String entrada){
        String[] numero = {"0","1","2","3","4","5","6","7","8","9"};
        int contador = 0;
        for (int i = 0; i < entrada.length() ; i++) {
            for (int j = 0; j < numero.length ; j++) {
                if (numero[j].equalsIgnoreCase(entrada.charAt(i)+"")){
                    contador++;
                    break;
                }    
            }
        }
        if(contador == entrada.length()){
            return Integer.valueOf(entrada) != 0;
        }else{
            return false;
        }
    }
    
    public void mostrarMarioKart(){
        System.out.println("  __  __                  _           _  __                 _   \n" +
                           " |  \\/  |                (_)         | |/ /                | |  \n" +
                           " | \\  / |   __ _   _ __   _    ___   | ' /    __ _   _ __  | |_ \n" +
                           " | |\\/| |  / _` | | '__| | |  / _ \\  |  <    / _` | | '__| | __|\n" +
                           " | |  | | | (_| | | |    | | | (_) | | . \\  | (_| | | |    | |_ \n" +
                           " |_|  |_|  \\__,_| |_|    |_|  \\___/  |_|\\_\\  \\__,_| |_|     \\__|");
    }
    
}
