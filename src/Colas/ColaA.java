/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colas;

import Pilas.EmptyCollectionException;
import java.util.ArrayList;

/**
 *
 * @author edi
 */
public class ColaA <T> implements ColaADT<T>{
    
    private T[] cola;
    private int frente;
    private int fin;
    private final int MAX=20;
    
    public ColaA(){
        cola=(T[]) new Object[MAX];
        fin=-1;
        frente=-1;
    }
    public ColaA(int maximo){
        cola=(T[]) new Object[maximo];
        fin=-1;
        frente=-1;
    }
    public boolean estaVacia(){
        return frente==-1;
    }
    public T consultaPrimero(){
        if(estaVacia())
            throw new EmptyCollectionException();
        return cola[frente];    
    }
    public void agrega(T dato){
        if(frente==-1)
            frente=0;
        else
            if((fin+1)%cola.length==frente)
            expande();  
        fin=(fin+1)%cola.length;
        cola[fin]=dato;
        
    }
    private void expande(){
        T[] nuevo=(T[]) new Object[cola.length*2];
        
        for(int i=0;i<cola.length;i++)
            nuevo[i]=cola[(frente+i)%cola.length];
        cola=nuevo;
        frente=0;
        fin=cola.length-1;
    }
    public T quita(){
        if(estaVacia())
            throw new EmptyCollectionException();
        
        T  res= cola[frente];
        
        if(frente==fin){
            frente=-1;
            fin=-1;
        }
        else
            frente=(frente+1)%cola.length;
        return res;
    }
    public String toString(){
        StringBuilder bui=new StringBuilder();
        int i,n,j;
        
        n=cuentaElementos();
        for(i=0;i<n;i++){
            j=(frente+i)%cola.length;
            bui.append(cola[j]+" ");
        }
        return bui.toString();
    }
    public int cuentaElementos(){
        int res=0;
        if(fin!=-1){
            if(frente<fin)
            res=fin-frente+1;
        else
            res=fin+1+cola.length-frente; 
        }
        return res;          
    }
     public T consultaUltimo(){
        if(estaVacia())
            throw new EmptyCollectionException();
        return cola[fin];    
    }
    
     public ArrayList<T> multiQuita(int n){
         if(estaVacia())
             throw new EmptyCollectionException();
         ArrayList<T> res=new ArrayList();
         
         if(n<=cuentaElementos())
             for(int i=0; i<n;i++)
                 res.add(quita());
         return res; 
     }
     public boolean noHayVecinosIguales(){
         int i=0;
         if(frente==fin)
             return true; 
         else
             return noHayVecinosIguales(i);      
     }
     private boolean noHayVecinosIgualesJ( int i) {
         if(i<cuentaElementos())
             if(cola[(frente+i)%cola.length].equals(cola[(frente+i+1)%cola.length]))
                 return false;
             else
                 return noHayVecinosIguales(i+1);
         else
             return true;    
     }
     private boolean noHayVecinosIguales( int i) { 
         if((frente+i)%cola.length!=fin){
             if(cola[(frente+i)%cola.length]==cola[(frente+i+1)%cola.length])
                 return false;
             else
                 return noHayVecinosIguales(i+1);  
         }
         else
             return true;
            
     }
}
