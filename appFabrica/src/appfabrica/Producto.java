package appfabrica;
import java.util.Arrays;
public class Producto {

    private String descripcion;
    private Material[] materiales;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Producto(String descripcion, int cantidad) {
        this.descripcion = descripcion;
        this.materiales = new Material[cantidad];
    }

    public void agregarMaterial(Material nuevoMaterial) {
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i] == null) {
                materiales[i] = nuevoMaterial;
                break;
            }
        }
    }

    public double calcularCostoTotal() {
        double acum = 0;
        for (Material m : materiales) {
            if (m != null) {
                acum += m.getValorUnitario();
            }
        }
        return acum;
    }

    public boolean existeMaterial(int id) {
        for (Material m : materiales) {
            if (m != null && m.getCodigo() == id) {
                return true;
            }
        }
        return false;
    }

    
    public Material [] obtenerMateriales(double valor)
    {
        int count = 0;
        for (Material m : materiales) {
            if(m!=null && m.getValorUnitario()<valor){
                count++;
            }
        }
        Material [] m2=new Material[count];
        int i= 0;
        for (Material m : materiales) {
            if(m!=null && m.getValorUnitario()<valor){
                m2[i]=m;
                i++;
            }
        }
        return m2;      
    }
    
    
    public int [] rangoPrecio()
    {
        int [] arr= new int [4];
        for (Material m : materiales) {
            if(m!=null)
            {
                double precio = m.getValorUnitario();
                if(precio> 0 && precio<=10){
                    arr[0]+=1;
                } else if(precio> 10 && precio<=20){
                    arr[1]+=1;
                }else if(precio> 20 && precio<=30){
                    arr[2]+=1;
                }else if(precio> 30){
                    arr[3]+=1;
                }              
            }
        }
        return arr;
    }

    @Override
    public String toString() {
        return "Producto{" + "descripcion=" + descripcion + ", materiales=" + Arrays.toString(materiales) + '}';
    }
    
    
    
    
    
    
    
    
}
