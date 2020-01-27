

package trabajadores;

public class Operario extends Empleado{
    private int horasE;
    
    public Operario(){
        super();
    }
    public Operario(String nombre, double sueldoB, int horasE){
        super(nombre,sueldoB);
        this.horasE=horasE;
        
    }
     public String toString(){
        StringBuilder bui=new StringBuilder();
        
        bui.append(super.toString());
        bui.append("\n Las horas extras son: "+horasE);
         
         return bui.toString();
    }
     public double calculaSalario(double pres, double deduc, double precioHE){
         return super.calcularSalario(pres, deduc)+horasE*precioHE;
     }
}
