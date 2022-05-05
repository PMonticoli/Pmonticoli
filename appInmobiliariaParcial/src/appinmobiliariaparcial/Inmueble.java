
package appinmobiliariaparcial;


public class Inmueble {
    private int numero;
    private double precioMensual;
    private int cantHabitaciones;
    private boolean existenciaPileta;
    private double superficie;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getPrecioMensual() {
        return precioMensual;
    }

    public void setPrecioMensual(double precioMensual) {
        this.precioMensual = precioMensual;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isExistenciaPileta() {
        return existenciaPileta;
    }

    public void setExistenciaPileta(boolean existenciaPileta) {
        this.existenciaPileta = existenciaPileta;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public Inmueble(int numero, double precioMensual, int cantHabitaciones, boolean existenciaPileta, double superficie) {
        this.numero = numero;
        this.precioMensual = precioMensual;
        this.cantHabitaciones = cantHabitaciones;
        this.existenciaPileta = existenciaPileta;
        this.superficie = superficie;
    }

    @Override
    public String toString() {
        return "Inmueble{" + "numero=" + numero + ", precioMensual=" + precioMensual + ", cantHabitaciones=" + cantHabitaciones + ", existenciaPileta=" + existenciaPileta + ", superficie=" + superficie + '}';
    }

    
    
    
}
