
package appplantel;

public class Jugador {
 private String nombre;
 private int posicion;
 private int numero;
 private int partidos;
 private int estado;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPartidos() {
        return partidos;
    }

    public void setPartidos(int partidos) {
        this.partidos = partidos;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Jugador(String nombre, int posicion, int numero, int partidos, int estado) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.numero = numero;
        this.partidos = partidos;
        this.estado = estado;
    }
 
}
