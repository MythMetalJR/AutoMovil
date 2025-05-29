/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.automovil;


public class PruebaAutomovil {
    
    public static void main(String[] args) {
        Automovil auto = new Automovil("Toyota", 2020, 2.0f, TipoCombustible.GASOLINA, 
                                       TipoAutomovil.COMPACTO, 4, 5, 180.0f, 0.0f, Color.ROJO);

        auto.setVelocidadActual(100.0f);
        auto.acelerar(20.0f);
        auto.desacelerar(50.0f);
        auto.frenar(0);
        auto.mostrarAtributos();
    }
}
