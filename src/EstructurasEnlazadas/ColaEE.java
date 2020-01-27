/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructurasE;

import Colas.ColaADT;
import java.util.ArrayList;

/**
 *
 * @author Edgar
 */
public class ColaEE<T> implements ColaADT<T> {
    private EstructuraEnlazada<T> cola;
    
    public ColaEE(){
        cola= new EstructuraEnlazada();
    }

    public boolean estaVacia() {
        return cola.isEmpty();
    }
    public T consultaPrimero() {
        return cola.verPrimero();        
    }

    public T quita() {
        return cola.quitaPrimero();
    }

    @Override
    public void agrega(T dato) {
        cola.agregaFinal(dato);
    }

    @Override
    public int cuentaElementos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T consultaUltimo() {
        return cola.verUltimo();
    }

    @Override
    public ArrayList<T> multiQuita(int n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
