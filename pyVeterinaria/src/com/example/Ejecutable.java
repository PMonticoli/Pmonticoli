/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.example;

import com.example.dominio.*;
import java.util.Scanner;

/**
 *
 * @author marti
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de clientes: ");
        int cantidad = sc.nextInt();

        //dependencia, relacion de uso
        Veterinaria v = new Veterinaria(cantidad);

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el numero del cliente: ");
            int numero = sc.nextInt();
            System.out.println("Ingrese el nombre del cliente: ");
            String nombreCli = sc2.next();
            System.out.println("Ingrese la antiguedad: ");
            int anti = sc.nextInt();
            System.out.println("Ingrese el nombre de la mascota: ");
            String nombreMascota = sc2.next();
            System.out.println("Ingrese la edad de la masota: ");
            int edad = sc.nextInt();

            Mascota m = new Mascota(nombreMascota, edad);
            Cliente c = new Cliente(numero, nombreCli, anti);
            c.asignarMascota(m);
            v.agregarCliente(c);
            System.out.println("-----------------");

        }

        System.out.println("La cantidad de clientes es: " + cantidad);
        System.out.println("Promedio de edad de las mascotas: " + v.promedioEdad());
        System.out.println("Cantidad de clientes con antiguedad mayor o igual a 5: " + v.clientesConAntiguedadMayorOIgualA5(5));
    }
}
