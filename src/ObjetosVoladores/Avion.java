
package objetosvoladores;

public class Avion implements ObjVolador{
    
    private String nombre;
    private static  int gen=0;
    private int cu;
    private int numPasajeros;
    
    public Avion(String nombre,int NumPasajeros){
        this.nombre=nombre;
        this.cu=gen;
        gen++;
        this.numPasajeros=numPasajeros;
    }
      public Avion(int cu){
        this.cu=cu;
    }
    
     public void despega(){
        System.out.println("El piloto inicia el despegue "); 
    }
     public void aterriza(){
        System.out.println("El autopiloto aterriza"); 
    }
     public void seDesplaza(){
        System.out.println("El avion cae en picada "); 
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }
     

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.cu;
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
        final Avion other = (Avion) obj;
        if (this.cu != other.cu) {
            return false;
        }
        return true;
    }
    
}
