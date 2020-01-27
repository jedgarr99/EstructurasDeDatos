/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructurasE;
//Jorge

import Pilas.EmptyCollectionException;
import java.util.Iterator;


public class IteradorEE<T> implements Iterator<T> {

    private Nodo<T> actual;

    public IteradorEE(Nodo<T> apun) {
        actual = apun;
    }

    public boolean hasNext() {
        return actual != null;
    }

    @Override
    public T next() {
        if (hasNext()) {
            T resul;
            resul = actual.getDato();
            actual = actual.getSig();
            return resul;
        } else {
            throw new EmptyCollectionException();
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Método no implementado");
    }

}