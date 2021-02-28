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
