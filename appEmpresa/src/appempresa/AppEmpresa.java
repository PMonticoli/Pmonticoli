
package appempresa;
import java.util.Scanner;

public class AppEmpresa {

    public static void main(String[] args) {
// TODO code application logic here
        Empresa empresa;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de empleados de la empresa:");
        empresa = new Empresa(teclado.nextInt());
        for (int i = 0; i < empresa.getNroEmpleados(); i++) {
            System.out.println("Ingrese el legajo del empleado N° " + (i+1));
            int legajo = teclado.nextInt();
            System.out.println("Ingrese el numero de inasistencias del empleado N° " + (i+1));
            int nroInasistencias = teclado.nextInt();
            System.out.println("Ingrese los minutos de demora del empleado N° " + (i+1));
            int minutosDemora = teclado.nextInt();         
            Empleado empleado = new Empleado(legajo, nroInasistencias, minutosDemora);
            empresa.AgregarEmpleado(empleado);
        }
        System.out.println("Total de horas de trabajo perdidas:" + empresa.CalcularHorasPerdidas());
        System.out.println("Promedio de inasistencias por empleado:" + empresa.CalcularPromedioInasistencias());
        System.out.println("Ingresar parametro de faltas a comparar: ");
        int faltas = teclado.nextInt();
        System.out.println("La cantidad de empleados con mas de "+faltas+" faltas es: "+ empresa.CantidadEmpleadosMasFaltas(faltas));
    }
    
}
