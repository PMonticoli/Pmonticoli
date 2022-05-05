
package appempresa;

public class Empresa {
    private int nroEmpleados;
    private Empleado[] empleados;

    public Empresa(int nroEmpleados) {
        this.nroEmpleados = nroEmpleados;
        this.empleados = new Empleado[nroEmpleados];
    }

    public Empresa() {
    }

    public int getNroEmpleados() {
        return nroEmpleados;
    }

    public void setNroEmpleados(int nroEmpleados) {
        this.nroEmpleados = nroEmpleados;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public double CalcularHorasPerdidas() {
        double acum = 0;
        for (Empleado e : empleados) {
            if(e != null){
                acum += e.getNroInasistencias() * 8;
                acum += (double)e.getMinutosDemora() / 60;
            }
       
        }
        return acum;
    }
    public double CalcularPromedioInasistencias(){
        int acum = 0;
        int count = 0;
        for (Empleado e : empleados) {
            if(e != null){
                acum += e.getNroInasistencias();
                count++;
            }
        }
        if(count > 0){
            double result = (double)acum / count;
            return result;
        }
        else{
            return 0;
        }
            
        
    }
    public int CantidadEmpleadosMasFaltas(int cantidadFaltas) {
        int count = 0;
        for (Empleado e : empleados) {
            if(e != null && e.getNroInasistencias() > cantidadFaltas) {
                count++;
            }
            
        }
        return count;
    }
    public void AgregarEmpleado(Empleado empleado) {
        for (int i = 0; i < this.getNroEmpleados(); i++) {
            if(this.empleados[i] == null) {
                empleados[i] = empleado;
                break;
            }
        }
    }
     
}
