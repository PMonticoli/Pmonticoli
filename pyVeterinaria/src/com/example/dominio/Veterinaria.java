package com.example.dominio;

public class Veterinaria {

    private final Cliente clientes[];

    public Veterinaria(int cantidad) {
        clientes = new Cliente[cantidad];
    }

    public void agregarCliente(Cliente c) {
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] == null) {
                clientes[i] = c;
                break;
            }
        }
    }

    public float promedioEdad() {
        float aux = 0;
        int contador = 0;
        for (Cliente c : clientes) {
            if (c != null) {
                aux = aux + c.getEdadMascota();
                contador++;
            }
        }
        return (contador > 0) ? (float) aux / contador : 0F;
    }

    public int clientesConAntiguedadMayorOIgualA5(int antiguedad) {
        int may = 0;
        for (Cliente c : clientes) {
            if (c != null) {
                if (c.getAntiguedad() > antiguedad) {
                    may++;
                }
            }
        }
        return may;
    }
}
