/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilas;

public interface PilaADT <T>{
    
    public T pop();
    public  T peek();
    public void push(T dato);
    public boolean isEmpty();
    
    
}
