
package appveterinaria;


public class Veterinaria {
    private Cliente []clientes;

public Veterinaria(int cantidad)
{
    clientes = new Cliente[cantidad];
}
    
public void agregarCliente(Cliente nuevoCliente)
{
    for (int i = 0; i < clientes.length; i++) {
        if(clientes[i]==null)
        {
            clientes[i]=nuevoCliente;
            break;
        }        
    }

}
public double promedioEdadMascota()
{
    double aux=0;
    int contador=0;
    for (Cliente c : clientes) {
        if(c!=null)
        {
          aux+=c.getAntiguedad();
          contador++;
        }
    }
    if(contador>=0)
    {
        double promedio=(double)aux/contador;
        return promedio;
    }
    else
    {
        return 0;
    }      
}

public int clientesConAntiguedadMayorOIgualA5(){
        int may = 0;
        for (Cliente c : clientes){
            if(c!=null && c.getAntiguedad() >=5)
            {
                may++;
            }
        }
        return may;
}












}
