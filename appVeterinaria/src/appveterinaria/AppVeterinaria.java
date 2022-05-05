
package appveterinaria;
import java.util.Scanner;

public class AppVeterinaria {

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       
        System.out.println("Ingrese la cantidad de clientes");
        int cantidad = teclado.nextInt();
        Veterinaria v= new Veterinaria(cantidad);
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el numero del cliente");
            int numero = teclado.nextInt();
            System.out.println("Ingrese el nombre del cliente");
            String nombreCliente=teclado.next();
            System.out.println("Ingrese la antiguedad del cliente");
            int antiguedad= teclado.nextInt();
            System.out.println("Ingrese el nombre de la mascota");
            String nombreMascota = teclado.next();
            System.out.println("Ingrese la edad de la mascota");
            int edad = teclado.nextInt();
            Mascota m = new Mascota(nombreMascota,edad);
            Cliente c = new Cliente(numero,nombreCliente,antiguedad);
            c.asignarMascota(m);
            v.agregarCliente(c);
        }
        //SALIDAS
        System.out.println("La cantidad de clientes que tiene la veterinaria es de: "+ cantidad);
        System.out.println("El promedio de edad de las mascotas es de: "+v.promedioEdadMascota());
        System.out.println("La cantidad de clietnes que tiene antiguedad mayor a 5 años es de: "+v.clientesConAntiguedadMayorOIgualA5());
       
    }
    
}
