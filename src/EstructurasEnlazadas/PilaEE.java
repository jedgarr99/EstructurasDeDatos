/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructurasE;

import Pilas.PilaADT;


public class PilaEE<T> implements PilaADT<T>{
    private EstructuraEnlazada<T> pila; 
    
    public PilaEE(){
        pila=new EstructuraEnlazada();
    }
    
    public T pop(){
        return pila.quitaUltimo();
    }
     public  T peek(){
         return pila.verUltimo();
     }

    public void push(T dato) {
        pila.agregaFinal(dato);
    }

    public boolean isEmpty() {
       return pila.isEmpty();
    }
    
    
}
