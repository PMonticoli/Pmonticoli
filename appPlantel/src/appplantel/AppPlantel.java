
package appplantel;
import java.util.Scanner;

public class AppPlantel {

    public static void main(String[] args) {
        Equipo equipo;
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese la cantidad de jugadores: ");
        equipo = new Equipo(teclado.nextInt());
        for (int i = 0; i < equipo.getNroJugadores(); i++) {
            System.out.println("Ingrese el nombre de jugador: ");
            String nombre =teclado.next();
            System.out.println("Ingrese su posicion");
            System.out.println("(1: arquero, 2: defensor, 3: \n" +
            "mediocampo, 4: delantero)");
            int posicion=teclado.nextInt();
            System.out.println("Ingrese el numero de camiseta: ");
            int numero =teclado.nextInt();
            System.out.println("Ingrese la cantidad de partidos jugados: ");
            int partidos=teclado.nextInt();
            System.out.println("Ingrese el porcentaje estado fisico");
            System.out.println("100 equivale a un jugador sano y 0 a uno imposibilitado \n" +
            "de jugar por lesiones)");
            int estado =teclado.nextInt();
            Jugador jugador = new Jugador(nombre,posicion,numero,partidos,estado);
            equipo.agregarJugador(jugador);            
        }
        //SALIDAS
        System.out.println("Cantidad de jugadores con menos de 10 partidos"+ " "+equipo.cantJugadorMenos10());
        System.out.println("Nombre de jugador con mayor cantidad partidos"+" " +equipo.jugadorMasPartidos().getNombre());
        System.out.println("Promedio estado fisico"+ equipo.promedioEstado());
        System.out.println("Escriba el numero de camiseta de jugador que quiere saber estado fisico");
        int numeroCamiseta = teclado.nextInt();
        System.out.println("Estado fisico del jugador con numero camiseta"+ " "+equipo.getEstadoByCamiseta(numeroCamiseta));
        System.out.println("El promedio de partidos jugador por posicion: ");
        double [] promedio=equipo.promedioByPosicion();
        System.out.println("Arquero : "+ promedio[0]);
        System.out.println("Defensor : "+ promedio[1]);
        System.out.println("Medio campo : "+ promedio[2]);
        System.out.println("Delantero : "+ promedio[3]);
        
    }
    
}
