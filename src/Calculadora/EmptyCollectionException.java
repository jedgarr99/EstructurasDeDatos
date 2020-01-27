/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;


public class EmptyCollectionException extends RuntimeException {
    
    public EmptyCollectionException(){
        super("La pila esta vacia");
        
        
    }
     public EmptyCollectionException(String nota){
         super(nota);
        
    }
    
}