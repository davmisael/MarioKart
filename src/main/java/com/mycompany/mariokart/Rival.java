/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mariokart;

import com.mycompany.mariokart.Carro;

import static com.mycompany.mariokart.Carro.MOTOR_GENERICO;
import static com.mycompany.mariokart.Carro.MOTOR_BASICO;
import static com.mycompany.mariokart.Carro.MOTOR_MEDIO;
import static com.mycompany.mariokart.Carro.MOTOR_ALTO_RENDIMIENTO;

import static com.mycompany.mariokart.Carro.LLANTAS_GENERICAS;
import static com.mycompany.mariokart.Carro.LLANTAS_CALIDAD_ALTA;
import static com.mycompany.mariokart.Carro.LLANTAS_CALIDAD_BAJA;
import static com.mycompany.mariokart.Carro.LLANTAS_CALIDAD_MEDIA;

import static com.mycompany.mariokart.Carro.TANQUE_LLENO;

import java.util.Random;

/**
 *
 * @author David
 */
public final class Rival extends Persona{
    
    Random random = new Random();
    
    Carro carro;

    public Rival(String nombre){
        super(nombre);
        this.posicionEnPodio = 0;
        this.carro = generarCarroAleatorio();
     }
    
    public Rival(){
        super();
        this.posicionEnPodio = 0;
        this.carro = generarCarroAleatorio();
    }
    
    public Carro generarCarroAleatorio(){
        Carro carroGenerado = new Carro();
        carroGenerado.setGasolina(TANQUE_LLENO);
        
        int tipoMotor = (int)(Math.random()*4+1);
        switch (tipoMotor){
            case 1:
                carroGenerado.setMotor(MOTOR_GENERICO);
                break;
            case 2:
                carroGenerado.setMotor(MOTOR_BASICO);
                break;
            case 3:
                carroGenerado.setMotor(MOTOR_MEDIO);
                break;
            case 4:
                carroGenerado.setMotor(MOTOR_ALTO_RENDIMIENTO);
                break;
        }
        
        int tipoLlantas = (int)(Math.random()*4+1);
        switch (tipoLlantas){
            case 1:
                carroGenerado.setLlantas(LLANTAS_GENERICAS);
                break;
            case 2:
                carroGenerado.setLlantas(LLANTAS_CALIDAD_BAJA);
                break;
            case 3:
                carroGenerado.setLlantas(LLANTAS_CALIDAD_MEDIA);
                break;
            case 4:
                carroGenerado.setLlantas(LLANTAS_CALIDAD_ALTA);
                break;
        }
        
        int tipocolor = (int)(Math.random()*4+1);
        switch (tipocolor){
            case 1:
                carroGenerado.setColor("Amarillo");
                break;
            case 2:
                carroGenerado.setColor("Azul");
                break;
            case 3:
                carroGenerado.setColor("Rojo");
                break;
            case 4:
                carroGenerado.setColor("Verde");
                break;
        }
        return carroGenerado;
    }

    
    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Carro getCarro() {
        return carro;
    }
       
}
