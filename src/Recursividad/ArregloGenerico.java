/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividad;

public class ArregloGenerico <T extends Comparable<T>> {
    private int total;
    private T[] arreglo;
    private final int MAX=20;
    
    public ArregloGenerico(){
        total=0;
        arreglo=(T[]) new Comparable[MAX];
    }
     public ArregloGenerico(int maximo){
        total=0;
        arreglo=(T[]) new Comparable[maximo];
    }
     public boolean alta(T objeto){
         boolean res=false;
         
         if(total<arreglo.length){
             arreglo[total]=objeto;
             total++;
             res=true;
         }
         return res;
     }
     public int busquedaSecuencial(T dato){
         return busqueda(dato, total);
     }
     private int busqueda(T dato, int pos){
         if(pos==-1||dato.equals(arreglo[pos])){
            return pos; 
         }else
             return busqueda(dato, pos-1);
     }
     
     public String toString(){
         StringBuilder b=new StringBuilder();
         
         return toStringAux(total,b);
     }
     private String toStringAux(int pos,StringBuilder b){
         if(pos>0){
             toStringAux(pos-1,b);
             b.append(arreglo[pos-1].toString()+" ");   
         }
         return b.toString();
     }
     
    public int posMayor(){
         return posMayorA(total-1);
     }
     private int posMayorA(int tot){
         T max=arreglo[tot];
         return posMayorAux(tot, max, tot);
     }
     private int posMayorAux(int res, T max, int pos){
         
         if(pos==-1)
             return res;   
         else{
             if(max.compareTo(arreglo[pos])<0){
                 max=arreglo[pos];
                 res=pos;
             }
              return posMayorAux(res, max, pos-1);
         }  
     }
     public void eliminaOcurrencias(T objeto){
         eliminaOcurrenciasAux(objeto, total-1);
     }
    private void eliminaOcurrenciasAux(T objeto, int pos){
        if(pos!=-1){
            if(arreglo[pos].equals(objeto)){
                for(int i=pos;i<total-1;i++){
                    arreglo[i]=arreglo[i+1];
                }
                total--;
            }
             eliminaOcurrenciasAux(objeto, pos-1);   
        }     
    }
    public void ordSeleccionDirecta(){
        ordSeleccionDirectaAux(total-1);
    }
    private void ordSeleccionDirectaAux(int pos){
        int a;
        T o;
        
        if(pos!=-1){
            o=arreglo[pos];
            a=posMayorA(pos);
            arreglo[pos]=arreglo[a];
            arreglo[a]=o;
            ordSeleccionDirectaAux(pos-1);
        }
    }
}
