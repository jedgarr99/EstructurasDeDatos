/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructurasE;

public class Nodo<T> {

    private T dato;
    private Nodo<T> sig;

    public Nodo() {
        sig = null;
    }

    public Nodo(T dato) {
        this.dato = dato;
        this.sig = null;
    }

    public T getDato() {
        return dato;
    }

    public Nodo<T> getSig() {
        return sig;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public void setSig(Nodo<T> sig) {
        this.sig = sig;
    }

    public String toString() {
        return dato.toString();
    }
}

