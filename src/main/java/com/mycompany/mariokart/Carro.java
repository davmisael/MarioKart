/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mariokart;

/**
 *
 * @author David
 */
public class Carro {
    
    public static final int MOTOR_GENERICO = 2;
    public static final int MOTOR_BASICO = 4;
    public static final int MOTOR_MEDIO = 5;
    public static final int MOTOR_ALTO_RENDIMIENTO = 7;
    
    public static final int LLANTAS_GENERICAS = 1;
    public static final int LLANTAS_CALIDAD_BAJA = 2;
    public static final int LLANTAS_CALIDAD_MEDIA = 3;
    public static final int LLANTAS_CALIDAD_ALTA = 5;
    
    public static final int TANQUE_LLENO =100;
    
    private int motor;                  // potencia     2,4,5,7
    private int llantas;                // coeficiente  1,2,3,
    private int gasolina;               // min-max      0 - 100
    private String color;               // azul, rojo, verde

    public Carro(int motor, int llantas, int gasolina, String color) {
        this.motor = motor;
        this.llantas = llantas;
        this.gasolina = gasolina;
        this.color =color;
    }

    Carro() {
        this.motor = MOTOR_GENERICO;
        this.llantas = LLANTAS_GENERICAS;
        this.gasolina = TANQUE_LLENO;
        this.color = "amarillo";
    }
    
    public void mostrarDatosDelCarro(Carro carro){
        if (carro != null){
            System.out.println("---------------------------------------------------------------------");
            carro.mostrarDatosDelMotor(carro.getMotor());
            carro.mostrarDatosDeLasLlantas(carro.getLlantas());
            System.out.println("nivel de gasolina: " + carro.getGasolina());
            System.out.println("Color del Auto: " + carro.getColor());
            System.out.println("---------------------------------------------------------------------");
        } else  
            System.out.println(" Vacio ");
    }
    
    public void mostrarDatosDelMotor(int nivelDelMotor){
        if (nivelDelMotor == MOTOR_GENERICO ){
            System.out.println("El motor es Generico, de menor redimiento. (La potencia es de: 2)");
        }else if (nivelDelMotor == MOTOR_BASICO ){
            System.out.println("El motor es Basico, de bajo rendimiento. (La potencia es de: 4)");
        }else if (nivelDelMotor == MOTOR_MEDIO ){
            System.out.println("El motor es de rendimiento medio. (La potencia es de: 5)");
        }else if (nivelDelMotor == MOTOR_ALTO_RENDIMIENTO ){
            System.out.println("El motor es de alto rendimeinto. (La potencia es de: 7)");
            System.out.println("La potencia es de: 7");
        }else{
            System.out.print("");
        }
}
    
    public void mostrarDatosDeLasLlantas(int nivelDeLasLlantas){
        if (nivelDeLasLlantas == LLANTAS_GENERICAS ){
            System.out.println("Las llantas son Genericas, es el de menor redimiento. ");
            System.out.println("(Tienen un coeficinete de: 1)");
        }else if (nivelDeLasLlantas == LLANTAS_CALIDAD_BAJA ){
            System.out.println("Las llantas son de Calidad baja, de bajo rendimiento. ");
            System.out.println("(Tienen un coeficinete de: 2)");
        }else if (nivelDeLasLlantas == LLANTAS_CALIDAD_MEDIA ){
            System.out.println("Las llantas son de calidad media, de rendimiento medio. ");
            System.out.println("(Tienen un coeficinete de: 3)");
        }else if (nivelDeLasLlantas == LLANTAS_CALIDAD_ALTA ){
            System.out.println("Las llantas son de calidad alta, es de alto rendimeinto. ");
            System.out.println("(Tienen un coeficinete de: 5)");
        }else{
            System.out.print("");
        }
}
    
    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    public int getGasolina() {
        return gasolina;
    }

    public void setGasolina(int gasolina) {
        this.gasolina = gasolina;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
