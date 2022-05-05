
package appveterinaria;

public class Cliente {
    private int nroCliente;
    private String nombreCliente;
    private int antiguedad;
    private Mascota miMascota;

    public int getNroCliente() {
        return nroCliente;
    }

    public void setNroCliente(int nroCliente) {
        this.nroCliente = nroCliente;
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

    public Mascota getMiMascota() {
        return miMascota;
    }

    public void setMiMascota(Mascota miMascota) {
        this.miMascota = miMascota;
    }

    public Cliente(int nroCliente, String nombreCliente, int antiguedad) {
        this.nroCliente = nroCliente;
        this.nombreCliente = nombreCliente;
        this.antiguedad = antiguedad;
    }
    
        //delegacion de responabilidad
    public int getEdadMascota() {
        return miMascota.getEdad();
    }
     public void asignarMascota(Mascota nuevo) {
        miMascota = nuevo;
    }
}
