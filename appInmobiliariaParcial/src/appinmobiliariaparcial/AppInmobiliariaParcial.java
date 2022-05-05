
package appinmobiliariaparcial;
import java.util.Scanner;
public class AppInmobiliariaParcial {

    public static void main(String[] args) {
        //CREO UN LECTOR SCANNER PARA INGRESAR LOS DATOS EN EL PROGRAMA
        Scanner teclado = new Scanner(System.in);
        Inmobiliaria inmueble;
        
        
        System.out.println("Ingrese la cantidad de inmuebles que necesita cargar al sistema: ");
        inmueble=new Inmobiliaria(teclado.nextInt());
        for (int i = 0; i < inmueble.getCantidadInmuebles(); i++) {
            System.out.println("\"Ingrese el numero del inmueble N°:  "+ (i+1));
            int numero=teclado.nextInt();
            System.out.println("Ingrese el precio mensual del inmueble N°:  "+ (i+1));
            double precio=teclado.nextDouble();
            System.out.println("Ingrese la cantidad de habitaciones del inmueble N°: "+ (i+1));
            int cantidadHabitaciones=teclado.nextInt();
            System.out.println("Ingrese la superficie total del inmueble N°:  "+  (i+1));
            double superficie=teclado.nextDouble();
            System.out.println("Indique TRUE en caso de existencia pileta y FALSE en caso contrario.Inmueble N° "+ (i+1));
            boolean existencia=teclado.nextBoolean();
            Inmueble inm = new Inmueble(numero,precio,cantidadHabitaciones,existencia,superficie);
            inmueble.agregarInmueble(inm);
        }
        
        
        
        //SALIDAS DEL PROGRAMA
        System.out.println("La cantidad de inmuebles con mas de dos habitaciones y superficie mayor a 200 metros es de: "+ inmueble.calcularCantInmueblesByX());
        System.out.println("El promedio de precios de los inmuebles sin pileta es de: "+ inmueble.promedioPrecio());
        System.out.println("Ingrese un parametro superficie a comparar");
        double valor1=teclado.nextDouble();
        System.out.println("Ingrese un nuevo parametro superficie a comparar");
        double valor2=teclado.nextDouble();
        System.out.println("El numero de inmueble mas barato y con superficie entre "+valor1+" " +"y "+valor2+" "+"es de : "+inmueble.numInmuebleMasBarato(valor1, valor2));
        
        
        
        
        
        
        
        
        
        
    }  
}
