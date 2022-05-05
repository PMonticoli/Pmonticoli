package appinmobiliariaparcial;

public class Inmobiliaria {

    private int cantidadInmuebles;
    private Inmueble[] inmuebles;

    public int getCantidadInmuebles() {
        return cantidadInmuebles;
    }

    public void setCantidadInmuebles(int cantidadInmuebles) {
        this.cantidadInmuebles = cantidadInmuebles;
    }

    public Inmobiliaria(int cantidadInmuebles) {
        this.cantidadInmuebles = cantidadInmuebles;
        inmuebles = new Inmueble[cantidadInmuebles];
    }

    public void agregarInmueble(Inmueble nuevoInmueble) {
        for (int i = 0; i < this.getCantidadInmuebles(); i++) {
            if (this.inmuebles[i] == null) {
                inmuebles[i] = nuevoInmueble;
                break;
            }
        }
    }

    public int calcularCantInmueblesByX() {
        int acum = 0;
        for (Inmueble inmueble : inmuebles) {
            if (inmueble != null && inmueble.getCantHabitaciones() > 2 && inmueble.getSuperficie() > 200) {
                acum++;
            }
        }
        return acum;
    }

    public double promedioPrecio() {
        int acum = 0;
        int count = 0;

        for (Inmueble inmueble : inmuebles) {
            if (inmueble != null && inmueble.isExistenciaPileta() == false) {
                acum += inmueble.getPrecioMensual();
                count++;
            }
        }
        if (count > 0) {
            double promedio = (double) acum / count;
            return promedio;
        }
        return 0;
    }

    public int numInmuebleMasBarato(double valor1,double valor2)
    {
        int numero=0;
        Inmueble menor = inmuebles[0];
        for (Inmueble inmueble : inmuebles) {
            if(inmueble!=null && inmueble.getSuperficie()>= valor1 && inmueble.getSuperficie()<=valor2 && inmueble.getPrecioMensual()<menor.getPrecioMensual())
            {
                menor=inmueble;
                numero=inmueble.getNumero();
            }
        }
        return numero;
    }
    
    
    
    
    
}
