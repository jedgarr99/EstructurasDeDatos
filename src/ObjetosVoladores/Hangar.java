
package objetosvoladores;

public class Hangar {

    private int cantP;
    private int cantA;
    private String nombre;
    private Avion[] aviones;
    private Pajaro[] pajaros;
    private final int MAX=20;
    
    public Hangar(String nombre){
        this.nombre=nombre;
        aviones=new Avion[MAX];
        pajaros=new Pajaro[MAX];
      
        cantA=0;
        cantP=0;
        
    }
        public boolean registrar(String nombre,String habitat){
            boolean res=false;
            Pajaro p;
            if(cantP<MAX){
                p=new Pajaro(nombre,habitat);
                res=true;
                pajaros[cantP]=p;
                cantP++;
            }
            return res;

        }
        public boolean registrar(String nombre,int numPasajeros){
            boolean res=false;
            Avion p;
            
            if(cantP<MAX){
                p=new Avion(nombre,numPasajeros);
                res=true;
                aviones[cantA]=p;
                cantP++;
            }
            return res;
        
    }
        public String infoPajaro(int cu){
            Pajaro p=new Pajaro(cu);
            int pos;
            String res;
            
            pos=MAG.busqueda(pajaros, p, cantP);
            if (pos==-1)
                res="El pajaro no esta registerado";
            else
                res=pajaros[pos].toString();
            return res; 
        }
        
        public String infoPasajerosAvion(int cu){
            Avion p=new Avion(cu);
            int pos;
            String res;
            
            pos=MAG.busqueda(aviones, p, cantA);
            if (pos==-1)
                res="El avion no esta registerado";
            else
                res="el numero de pasajeros es"+aviones[pos].getNumPasajeros();
            return res; 
        }
        public boolean actualizarHabitat(int cu, String habitat){
            Pajaro p=new Pajaro(cu);
            int pos;
            boolean res=false;
            
            pos=MAG.busqueda(pajaros, p, cantP);
            if (pos!=-1)
                pajaros[pos].setHabitat(habitat);

            return res; 
        }
        
}
