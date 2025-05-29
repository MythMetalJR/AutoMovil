/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.automovil;


public class Automovil {
    
    private String marca;
    private int modelo;
    private float motor;
    private TipoCombustible tipoCombustible;
    private TipoAutomovil tipoAutomovil;
    private int cantAsientos;
    private int cantPuertas;
    private float velocidadMax;
    private float velocidadActual;
    private Color color;

    public Automovil(String marca, int modelo, float motor, TipoCombustible tipoCombustible,
                     TipoAutomovil tipoAutomovil, int cantPuertas, int cantAsientos,
                     float velocidadMax, float velocidadActual, Color color) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.cantPuertas = cantPuertas;
        this.cantAsientos = cantAsientos;
        this.velocidadMax = velocidadMax;
        this.velocidadActual = velocidadActual;
        this.color = color;
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public int getModelo() { return modelo; }
    public void setModelo(int modelo) { this.modelo = modelo; }

    public float getMotor() { return motor; }
    public void setMotor(float motor) { this.motor = motor; }

    public TipoCombustible getTipoCombustible() { return tipoCombustible; }
    public void setTipoCombustible(TipoCombustible tipoCombustible) { this.tipoCombustible = tipoCombustible; }

    public TipoAutomovil getTipoAutomovil() { return tipoAutomovil; }
    public void setTipoAutomovil(TipoAutomovil tipoAutomovil) { this.tipoAutomovil = tipoAutomovil; }

    public int getCantAsientos() { return cantAsientos; }
    public void setCantAsientos(int cantAsientos) { this.cantAsientos = cantAsientos; }

    public int getCantPuertas() { return cantPuertas; }
    public void setCantPuertas(int cantPuertas) { this.cantPuertas = cantPuertas; }

    public float getVelocidadMax() { return velocidadMax; }
    public void setVelocidadMax(float velocidadMax) { this.velocidadMax = velocidadMax; }

    public float getVelocidadActual() { return velocidadActual; }
    public void setVelocidadActual(float velocidadActual) { this.velocidadActual = velocidadActual; }

    public Color getColor() { return color; }
    public void setColor(Color color) { this.color = color; }

    public float acelerar(float cantidad) {
        if (velocidadActual + cantidad <= velocidadMax) {
            velocidadActual += cantidad;
        } else {
            System.out.println("No se puede superar la velocidad máxima.");
        }
        return velocidadActual;
    }

    public float desacelerar(float cantidad) {
        if (velocidadActual - cantidad >= 0) {
            velocidadActual -= cantidad;
        } else {
            System.out.println("No se puede desacelerar a velocidad negativa.");
        }
        return velocidadActual;
    }

    public float frenar(float cantidad) {
        velocidadActual = 0;
        return velocidadActual;
    }

    public float calcularTiempoLlegada(float distancia) {
        if (velocidadActual > 0) {
            return distancia / velocidadActual;
        } else {
            System.out.println("Velocidad actual es 0, no se puede calcular el tiempo.");
            return -1;
        }
    }

    public void mostrarAtributos() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Motor: " + motor);
        System.out.println("Tipo Combustible: " + tipoCombustible);
        System.out.println("Tipo Automovil: " + tipoAutomovil);
        System.out.println("Cantidad Puertas: " + cantPuertas);
        System.out.println("Cantidad Asientos: " + cantAsientos);
        System.out.println("Velocidad Máxima: " + velocidadMax);
        System.out.println("Velocidad Actual: " + velocidadActual);
        System.out.println("Color: " + color);
    }
}
