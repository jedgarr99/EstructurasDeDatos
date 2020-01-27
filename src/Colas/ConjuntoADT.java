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
public interface ConjuntoADT <T> extends Iterable<T> {
    public Iterator<T> iterator();
    public boolean agrega(T elem);
    public T quita(T elem);
    public boolean contiene(T elem);
    public int getCardinalidad();
    public boolean estaVacia();
    
    public ConjuntoADT union(ConjuntoADT<T> otro);
    public ConjuntoADT interseccion(ConjuntoADT<T> otro);
    public ConjuntoADT diferencia(ConjuntoADT<T> otro);
    public String toString();
     
    
    
}
