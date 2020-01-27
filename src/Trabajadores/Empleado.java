
package trabajadores;

public class Empleado {
    private static int serie=100;
    private int clave;
    private String nombreE;
    private double sueldoB;
    
    public Empleado(){
        
    }
    public Empleado(String nombre, double sueldoBase){
        nombreE=nombre;
        sueldoB=sueldoBase;
        clave=serie;
        serie++;
    }

    public String getNombreE() {
        int a=3;
        return nombreE;
    }

    public double getSueldoB() {
        return sueldoB;
    }

    @Override
    public String toString() {
        StringBuilder bui=new StringBuilder();
        
        bui.append("La clave es: "+clave +"\n");
        bui.append("El nombre del empleado es: "+nombreE+"\n");
        bui.append("El sueldo Base del empleado es: "+sueldoB+"\n");
        return bui.toString();
       
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.clave;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        if (this.clave != other.clave) {
            return false;
        }
        return true;
    }
    
    public double calcularSalario(double pres, double deduc){
        return sueldoB+pres-deduc;
    }
    
}
