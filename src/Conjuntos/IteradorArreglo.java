/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conjuntos;
//for(String nom:ingles)
//sout nom;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteradorArreglo<T> implements Iterator <T> {
    private T[] coleccion;
    private int total;
    private int actual;
    
    public IteradorArreglo(T[]arre, int tot ){
        coleccion=arre;
        total=tot;
        actual=0;
    }
    public boolean hasNext(){
        return actual<total;
    }
    public T next(){
        if(hasNext()){
            T res;
            res=coleccion[actual];
            actual++;
            return res;
        }
        else
            throw new NoSuchElementException();
    }
    public void remove(){
        throw new UnsupportedOperationException(" metodo no implementado");
    }
    
}
