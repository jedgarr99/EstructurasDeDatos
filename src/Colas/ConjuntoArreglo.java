/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colas;

import Conjuntos.IteradorArreglo;
import java.util.Iterator;

/**
 *
 * @author edi
 */

public class ConjuntoArreglo <T> implements ConjuntoADT<T> {
    private T[] conjunto;
    private int cardinalidad;
    private final int MAXIMO=20;
    
    public ConjuntoArreglo(){
        conjunto=(T[]) new Object [MAXIMO];
        cardinalidad =0;
    }
    public ConjuntoArreglo(int max){
        conjunto=(T[]) new Object [max];
        cardinalidad =0;
    }
    public Iterator<T> iterator(){
        return new IteradorArreglo(conjunto, cardinalidad );
    }
    /*public boolean contiene(T elem){
        Iterator<T> it= iterator();
        boolean bandera=false;
        
        while(it.hasNext()&& !it.next().equals(elem))
            bandera=it.next().equals(elem);
        
        return bandera;       
    }*/
    
    public boolean contiene(T elem){
        return contiene(elem, iterator());
    }
    private boolean contiene(T elem, Iterator<T> it){
        if(!it.hasNext())
            return false;
        else
            if(it.next().equals(elem))
                return true;
        else
                return contiene(elem, it);
    }
    public boolean agrega(T elem){
        boolean resp=false;
        
        if(!contiene(elem)){
            if(cardinalidad==conjunto.length)
                expande();
            conjunto[cardinalidad]=elem;
            cardinalidad ++;
            resp=true;
        }
        return resp;
    }
     public void expande(){
        T[] nuevo= (T[]) new Object [conjunto.length*2];
        
        for(int i=0; i<cardinalidad;i++){
            nuevo[i]=conjunto[i];
        }
        conjunto=nuevo;
    }
     public boolean estaVacia(){
         return cardinalidad==0;
     }
     public int getCardinalidad(){
         return cardinalidad;
     }
     public T quita(T elem){
         T resp;
         int pos;
         
         pos=buscaPos(elem);
         if(pos>=0){
             resp=conjunto[pos];
             conjunto[pos]=conjunto[cardinalidad-1];
             conjunto[cardinalidad-1]=null;
             cardinalidad--;
         }
         else
             resp=null;
         return resp;    
     }
     private int buscaPos(T elem){
         int i=0;
         
         while(i<cardinalidad && !conjunto[i].equals(elem))
             i++;
         if(i==cardinalidad)
             i=-1;
         return i;
     }

 
    public ConjuntoADT union(ConjuntoADT<T> otro) {
        if(otro==null)
            throw new NullPointerException();
        int max=cardinalidad+otro.getCardinalidad();
        ConjuntoArreglo<T> res= new ConjuntoArreglo(max);
        for(int i=0; i<cardinalidad;i++)
            res.conjunto[i]=conjunto[i];
        Iterator<T> it=otro.iterator();
        while (it.hasNext())
            res.agrega(it.next());
        return res;
    }
     
    public ConjuntoADT<T> interseccion (ConjuntoADT<T> otro){
        if(otro==null)
            throw new NullPointerException();
        Iterator<T> it=otro.iterator();
        int max=cardinalidad;
        ConjuntoArreglo<T> res=new ConjuntoArreglo(max);
        T aux;
        while(it.hasNext()){
            aux=it.next();
            if(contiene(aux))
                res.agrega(aux);
        }
        return res;
    }
    public ConjuntoADT<T> diferencia(ConjuntoADT<T> otro){
        if(otro==null)
            throw new NullPointerException();
        
        int i=0,j=0;
        ConjuntoArreglo<T> res=new ConjuntoArreglo(cardinalidad);
        while(i<cardinalidad){
            if(!otro.contiene(conjunto[i])){
                res.conjunto[j]=conjunto[i];
                j++;
            }
          
            i++;
            
        }
        res.cardinalidad=j;
        return res;
    }
    public String toString(){
        return toString(iterator(),new StringBuilder() );
    }
    public String toString(Iterator<T> it, StringBuilder bui){
        if(!it.hasNext())
            return bui.toString();
        else{
            bui.append(it.next()).append("\n");
            return toString(it, bui);
        }
           
    }
}
