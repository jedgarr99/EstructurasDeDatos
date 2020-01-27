
package objetosvoladores;

public class Pajaro implements ObjVolador {
    
    private String nombre;
    private static  int gen=0;
    private int cu;
    private String habitat;
    
    public Pajaro(String nombre,String habitat){
        this.nombre=nombre;
        this.cu=gen;
        this.habitat=habitat;
        gen++;
    }
    public Pajaro(int cu){
        this.cu=cu;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    
    public void despega(){
        System.out.println("El pajaro hace un gran esfuerzo para dejar de tocar tierra "); 
    }
     public void aterriza(){
        System.out.println("Estrepitosamente el pajaro choca con el suelo"); 
    }
     public void seDesplaza(){
        System.out.println("Se mueve "); 
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.cu;
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
        final Pajaro other = (Pajaro) obj;
        if (this.cu != other.cu) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pajaro{" + "nombre=" + nombre + ", cu=" + cu + ", habitat=" + habitat + '}';
    }
    
    
}
