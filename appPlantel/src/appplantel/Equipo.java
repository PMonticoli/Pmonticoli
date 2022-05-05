
package appplantel;


public class Equipo {
    private Jugador [] plantel;
    private int nroJugadores;

    public int getNroJugadores() {
        return nroJugadores;
    }
    
    public Equipo()
    {
        
    }

    public Equipo(int nroJugadores) {
        this.nroJugadores = nroJugadores;
        plantel = new Jugador[nroJugadores];
    }
    public void agregarJugador(Jugador nuevoJugador)
    {
        for (int i = 0; i < this.getNroJugadores(); i++) {
            if(plantel[i]==null)
            {
                plantel[i]=nuevoJugador;
                break;
            }            
        }
    }
    
    public int cantJugadorMenos10()
    {
        int contador=0;
        for (Jugador j : plantel) {
            if(j!=null && j.getPartidos()<10)
            {
                contador++;
            }
        }
        return contador;
    }
    
    public Jugador jugadorMasPartidos()
    {
        Jugador mayor = plantel[0];
        for (Jugador j : plantel) {
            if(j!=null && j.getPartidos()>mayor.getPartidos())
            {
                mayor=j;
            }
        }
        Jugador encontrado = mayor;
        return encontrado;
    }
    
    public double promedioEstado()
    {
        int acum=0;
        int contador=0;
        for (Jugador j : plantel) {
            if(j!=null)
            {
                acum+= j.getEstado();
                contador++;
            }
        }
        if(contador>0)
        {
        double promedio = (double)acum/contador;    
        return promedio;      
        }
        else
        {
            return 0;
        }
    }

   public int getEstadoByCamiseta(int numeroCamiseta)
   {
       int result=-1;
       for (Jugador j : plantel) {
           if(j.getNumero()==numeroCamiseta)
           {
               result=j.getEstado();
               break;
           }
       }
       return result;      
   }
    public double[] promedioByPosicion()
    {
        int acumulador1=0;
        int acumulador2=0;
        int acumulador3=0;
        int acumulador4=0;
        int contador1=0;
        int contador2=0;
        int contador3=0;
        int contador4=0;
        for (Jugador j : plantel) {
            if(j!=null && j.getPosicion()==1)
            {
                acumulador1+=j.getPartidos();
                contador1++;
            }
            else if(j!=null && j.getPosicion()==2)
            {
                acumulador2+=j.getPartidos();
                contador2++;
            }
            else if(j!=null && j.getPosicion()==3)
            {
                acumulador3+=j.getPartidos();
                contador3++; 
            }
             else if(j!=null && j.getPosicion()==4)
            {
                acumulador4+=j.getPartidos();
                contador4++;
            }
        }
        double promedio1=(double)acumulador1/contador1;
        double promedio2=(double)acumulador2/contador2;
        double promedio3=(double)acumulador3/contador3;
        double promedio4=(double)acumulador4/contador4;
        double[] resultado={promedio1,promedio2,promedio3,promedio4};     
        return resultado;
    }

        
    
    
    
    
    
    
    
    
    
    
}
