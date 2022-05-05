
package appfabrica;
import java.util.Scanner;
import java.util.Arrays;
public class AppFabrica {

    public static void main(String[] args) {
     
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la descripcion de un producto");
        String descripcion = teclado.next();
        System.out.println("Ingrese la cantidad de materiales");
        int cantMateriales = teclado.nextInt();
        
        Producto prod = new Producto(descripcion,cantMateriales);
        for (int i = 0; i < cantMateriales; i++) {
            System.out.println("Ingresar la descripcion del material: ");
            String descMaterial= teclado.next();
            System.out.println("Ingrese el codigo del material: ");
            int codMaterial=teclado.nextInt();
            System.out.println("Ingresar el valor unitario del material : ");
            double valUnitario = teclado.nextDouble();
            
            Material mat = new Material(descMaterial,codMaterial,valUnitario);
            prod.agregarMaterial(mat);
        }
        
        int opcion=0;
        while(opcion!=-1){
            System.out.println("1 - Costo total del producto");
            System.out.println("2 - Verificar existencia material");
            System.out.println("3 - Precio menor a");
            System.out.println("4 - Materiales por precio");

            opcion = teclado.nextInt();

            if (opcion == 1){
                System.out.println("El costo total del producto es: "+ prod.calcularCostoTotal());
            } else if (opcion==2){
                System.out.println("Ingrese el codigo del material");
                int x = teclado.nextInt();
                System.out.println(prod.existeMaterial(x));
            } else if(opcion==3)
            {
                System.out.println("Ingrese un valor a buscar");
                double y=teclado.nextDouble();
                System.out.println(Arrays.toString(prod.obtenerMateriales(y)));
            } else if(opcion==4)
            {
                System.out.println(Arrays.toString(prod.rangoPrecio()));
            } else if(opcion==-1)
            {
                System.out.println("Usted ha cerrado el menu!");
            } else{
                System.out.println("Ingreso un numero incorrecto! ");
            }
        }
        
        
        
        
        
    }  
}
