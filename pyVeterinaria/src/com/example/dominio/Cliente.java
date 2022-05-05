/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dominio;

public class Cliente {
    private int numeroCliente;
    private String nombreCliente;
    private int antiguedad;
    private Mascota miMascota;

    public Cliente(int numeroCliente, String nombreCliente, int antiguedad) {
        this.numeroCliente = numeroCliente;
        this.nombreCliente = nombreCliente;
        this.antiguedad = antiguedad;
    }

    public Cliente() {
    }
    
    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public void asignarMascota(Mascota nuevo) {
        miMascota = nuevo;
    }

    //delegacion de responabilidad
    public int getEdadMascota() {
        return miMascota.getEdad();
    }
}
