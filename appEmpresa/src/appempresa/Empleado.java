package appempresa;

public class Empleado {
    
private int legajo;
private int nroInasistencias;
private int minutosDemora;

    public Empleado() {
    }
    
    public Empleado(int legajo, int nroInasistencias, int minutosDemora) {
        this.legajo = legajo;
        this.nroInasistencias = nroInasistencias;
        this.minutosDemora = minutosDemora;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public int getNroInasistencias() {
        return nroInasistencias;
    }

    public void setNroInasistencias(int nroInasistencias) {
        this.nroInasistencias = nroInasistencias;
    }

    public int getMinutosDemora() {
        return minutosDemora;
    }

    public void setMinutosDemora(int minutosDemora) {
        this.minutosDemora = minutosDemora;
    }
   
    
    
    
}
