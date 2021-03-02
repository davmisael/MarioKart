/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mariokart;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class Ruleta {
    Random random = new Random();

    Scanner scanner = new Scanner(System.in);
    public Ruleta() {
    }
    
    public void mostrarMenuRuleta(Jugador jugador){
        String seleccionRuleta;
        System.out.println("\n--- BIENVENIDO AL MINI JUEGO ---");
        System.out.println(  "----------- RULETA -------------\n");
        imprimirRuleta();
        System.out.println("\n\nEstos son los premios que puedes garan en la ruleta");
        System.out.println("1. Girar ruleta. ");
        System.out.println("2. Regresar al Menu Principal. ");
        System.out.println("Escriba la opcion que desee realizar: ");
        do {
            seleccionRuleta = scanner.nextLine();
            if (seleccionRuleta.equalsIgnoreCase("1")){
                girarRuleta(jugador);
                System.out.println("\n1. Girar ruleta. ");
                System.out.println("2. Regresar al Menu Principal. ");
                System.out.println("Escriba la opcion que desee realizar: ");
            } else if(seleccionRuleta.equalsIgnoreCase("2")){
                break;
            } else{
                System.out.println("Ingrese una opcion valida. ");
            }
        } while (true);   
    }
    
    public void imprimirRuleta(){
        System.out.println("\n\nQZQRQMQMQRQRQQQQBBBQBQBQBBBBBBBBBBBQBRQRQRQRQQQRQg\n" +
                           "MbDDZgZDZgDggBQBBBbSsr.  J  .7sSZBBBBBMgggDgZgDgDd\n" +
                           "QZQMQMQMQQBBBBgu         s        .1gBBBBQQMQgQMQD\n" +
                           "MgMQgRMQBBBgs            E            jRBBBQRQMQMg\n" +
                           "QZRMQQBBBd.              d              :EBBBMRMRD\n" +
                           "MDMQQBBM.                Z                rBBBRRRg\n" +
                           "RZQRBBI                  b                  KBBQQD\n" +
                           "MgQBBv       10 ORO      d    40 GEMAS       JQBQg\n" +
                           "QgBQL v:                 b                 iv sBBg\n" +
                           "RQBJ   rj1:              E             rrUJi   IBQ\n" +
                           "BQg       r1j:           b           .7ri       QB\n" +
                           "BB           ruj:        d        i1J:          7B\n" +
                           "BD              i11i     P     i2Ji              B\n" +
                           "BU                 rUj:  j  iUJi                 R\n" +
                           "Bv                    :7jdsr.                    P\n" +
                           "BY    5 GEMAS         .71ZL7.      75 ORO        d\n" +
                           "B1                 iusi  L  iuu:                 g\n" +
                           "BZ              iuji     P     rU1:              B\n" +
                           "BB           iuJi        P        r11:          rB\n" +
                           "QBE       :jL:           d           iJJ:       QB\n" +
                           "QQBL   :u1i              P               ii:   1BR\n" +
                           "MgBB7 7i                 P                  7 vBBM\n" +
                           "QZQBB7     2000 ORO      P   1000 GEMAS      LBQQD\n" +
                           "MgRQBBu                  b                  IBBQMg\n" +
                           "QZRMQBBg.                P                :MBBQRQZ\n" +
                           "RggRMQQBBb               E              .DBBQQgQRg\n" +
                           "QZQgQMQQBBBDJ            b            ugBBBQQMRRQD\n" +
                           "RgMQMQMQRBBBBBE1         S         IZBBBBBRQRRRQRg\n" +
                           "QPgDgDgZggggQQBQBBBDbsi. P .iuPDBBBBBBQggDgDgDgDgd");
        
    }
    
    public void girarRuleta(Jugador jugador){
        double oro;
        int gemas;
        
        int numeroRuleta = (int)(Math.random()*100+1);
        
        if (numeroRuleta <= 10){
            oro = 0;
            gemas = 40;
        } else if (numeroRuleta <= 25){
           oro = 75;
           gemas = 0;
        } else if (numeroRuleta <= 30){
            oro = 0;
            gemas = 1000;
        }else if (numeroRuleta <= 35){
            oro = 2000;
            gemas = 0;
        }else if (numeroRuleta <= 65){
            oro = 0;
            gemas = 5;
        }else {
            oro = 10;
            gemas = 0;
        }
        jugador.setOro(jugador.getOro() + oro);
        jugador.setGemas(jugador.getGemas()+ gemas);
        System.out.println("____________________________________________________");
        System.out.println("\nGanaste " + oro + " de Oro. ");
        System.out.println("Ganaste " + gemas + " Gemas. ");
        System.out.println("\nAhora tienes " + jugador.getOro() + " de Oro");
        System.out.println("Ahora tienes " + jugador.getGemas() + " Gemas");
        System.out.println("____________________________________________________");
    }
}
