/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colas;

import java.util.Iterator;

/**
 *
 * @author edi
 */
public class Ejercicios {
   public static <T> void  invierte(ColaA<T> cola){
       PilaA<T> a = new PilaA();
       
       if(cola!=null){
           while(!cola.estaVacia())
           a.push(cola.quita());
           while(!a.isEmpty())
           cola.agrega(a.pop()); 
           
       }                 
   }

   public static <T> void  invierteR(ColaA<T> cola){
       if(!cola.estaVacia()){
           T aux= cola.quita();
           invierteR(cola);
           cola.agrega(aux); 
       }
   }
   
   public static<T> void quitaRepetidos(ColaA<T> cola){
       ConjuntoArreglo<T> aux = new ConjuntoArreglo();
       
       while(!cola.estaVacia())
           aux.agrega(cola.quita());
       Iterator<T> it= aux.iterator();
       while(it.hasNext())
           cola.agrega(it.next());  
   }
   public static <T> void quitaElemento(T elem, ColaA<T> cola){
       ColaA<T> aux = new ColaA();
       
       if(cola!=null){
           while(!cola.estaVacia())
           if(!cola.consultaPrimero().equals(elem))
               aux.agrega(cola.quita());
           while(!aux.estaVacia())
               cola.agrega(aux.quita());
       
       }
   }
   

}
