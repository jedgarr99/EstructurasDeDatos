/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructurasE;


import Pilas.EmptyCollectionException;
import java.util.Iterator;


public class EstructuraEnlazada<T> { 
    private Nodo<T> primero;

    public EstructuraEnlazada() {
        primero = null;
    }

    public boolean isEmpty() {
        return primero == null;
    }

    public void agregaInicio(T dato) {
        Nodo<T> nuevo = new Nodo(dato);
        nuevo.setSig(primero);
        primero = nuevo;
    }

    public void agregaFinal(T dato) {
        Nodo<T> nuevo = new Nodo(dato);
        if (isEmpty()) {
            primero = nuevo;
        } else {
            Nodo<T> aux;
            aux = primero;
            while (aux.getSig() != null) {
                aux = aux.getSig();
            }
            aux.setSig(nuevo);
        }
    }

    public String toString() {
        StringBuilder res = new StringBuilder();
        return toString(res, primero);
    }

    private String toString(StringBuilder res, Nodo<T> ap) {
        if (ap == null) {
            return res.toString();
        } else {
            res.append(ap.getDato()).append("  ");
            return toString(res, ap.getSig());
        }
    }

    public boolean buscaDato(T dato) {
        boolean res;
        Nodo<T> aux = primero;
        
        while (aux != null && !aux.getDato().equals(dato)) 
            aux = aux.getSig();
        res = aux!=null;
        return res;
    }
    
    public T quitaPrimero(){
        if(isEmpty())
            throw new EmptyCollectionException();
        Nodo<T> aux=primero;
        
        primero=primero.getSig();
        aux.setSig(null);
        return aux.getDato();
    }
    
    public T quitaUltimo2(){
        if(isEmpty())
            throw new EmptyCollectionException();
        T res;
        Nodo<T> aux=primero;
        
        if(aux.getSig()==null)
            res=quitaPrimero();
        else{
            while(aux.getSig().getSig()!=null)
                aux=aux.getSig();
            res=aux.getSig().getDato();
            aux.setSig(null); 
        }
        return res; 
    }

 

    public T quitaUltimo() {
        if (isEmpty()) {
            throw new EmptyCollectionException();
        }
        Nodo<T> actual = primero;
        Nodo<T> ant = null;
        while (actual.getSig() != null) {
            ant = actual;
            actual = actual.getSig();
        }
        if (ant != null) {
            ant.setSig(null);
        } else {
            primero = null;
        }
        return actual.getDato();
    }

    public T quitaDato(T dato) {
        if (!isEmpty()) {
            if (primero.getDato().equals(dato)) {
                return quitaPrimero();
            } else {
                Nodo<T> act, ant;
                ant = primero;
                act = primero.getSig();
                while (act != null && !act.getDato().equals(dato)) {
                    ant = act;
                    act = act.getSig();
                }
                if (act == null) {
                    throw new EmptyCollectionException();
                } else {
                    T resul = act.getDato();
                    ant.setSig(act.getSig());
                    act.setSig(null);
                    return resul;
                }
            }
        } else {
            throw new EmptyCollectionException();
        }
    }
    
    public boolean eliminaAnterior(T info){
        boolean res=false;
        
        
       if(info!=null&&!isEmpty()&&!primero.getDato().equals(info)&&primero.getSig()!=null){
         if(primero.getSig().getDato().equals(info)){
             quitaPrimero();
             res=true;
         } 
         else{
             if(primero.getSig().getSig()!=null){
                 Nodo<T> act=primero.getSig().getSig();
                 Nodo<T> antant=primero;
                 while(act.getSig()!=null&&!act.getDato().equals(info)){
                     act=act.getSig();
                     antant=antant.getSig();
                 }
                 if(act.getDato().equals(info)){
                     antant.getSig().setSig(null);
                     antant.setSig(act);
                     res=true;
                 }  
             }      
         }  
       }
       
       return res;
    }
    
    public boolean eliminaSiguiente(T info){
        boolean res=false;
        if(info!=null&& !isEmpty()){
            Nodo<T> act=primero;
            while(act!=null && !act.getDato().equals(info))
                act=act.getSig();
            if(act!=null&&act.getSig()!=null){
                if(act.getSig().getSig()==null)
                    act.setSig(null);
                else{
                    Nodo<T> sig=act.getSig();
                    act.setSig(sig.getSig());
                }
                res=true; 
            }  
        }
        return res;
    }
    
    public boolean insertaAntes(T refer, T nuevo){
        if(isEmpty()|| refer==null|| nuevo== null)
            throw new EmptyCollectionException();
        
        boolean res=false;
        if(primero.getDato().equals(refer)){
            agregaInicio(nuevo);
            res=true;
        }      
        else{
            if(primero.getSig()!=null){
                Nodo<T> act=primero.getSig();
                Nodo<T> ant=primero;
                while(act!=null&&!act.getDato().equals(refer)){
                    ant=act;
                    act=act.getSig();
                }
                if(act!=null){
                    Nodo<T> aux= new Nodo(nuevo);
                    ant.setSig(aux);
                    aux.setSig(act);
                    res=true; 
                }
            }
        }
    return res;    
    }

    public int eliminaRepetidosOrdenado(){
        if(isEmpty())
            throw new EmptyCollectionException();
        
        int res=0;
        if(primero.getSig()!=null){
            Nodo<T> sig=primero.getSig();
            Nodo<T> aux=primero;
            
            while(sig!=null){
            if(aux.getDato().equals(sig.getDato())){
                aux.setSig(sig.getSig());
                sig.setSig(null);
                res++;
            }
            else
                aux=aux.getSig();
            sig=aux.getSig();     
            }
        }
      return res;  
    }
    
    public int eliminaRepetidosDesordenado(){
        if(isEmpty())
            throw new EmptyCollectionException();
        
        int res=0;
        Nodo<T> base, act, ant;
        base=primero;
        while(base!=null){
            ant=base;
            act=base.getSig();
            while(act!=null){
                if(act.getDato().equals(base.getDato())){
                    ant.setSig(act.getSig());
                    act.setSig(null);
                    res++;
                    act=ant.getSig();
                }
                else{
                    ant=act;
                    act=act.getSig();
                }
            }
            base=base.getSig();
        }
        return res;
    }
    
    public void mezcla(EstructuraEnlazada otra){
        
        if(isEmpty()||otra==null||otra.isEmpty())
            throw new NullPointerException();
        Nodo<T> a=primero;
        Nodo<T> aux;
        Nodo<T> b=otra.primero;
        
        while(a.getSig()!=null&& b.getSig()!=null){
            aux=a.getSig();
            a.setSig(b);
            a=aux;
            aux=b.getSig();
            b.setSig(a);   
            b=aux;
        }
        if(a.getSig()==null)
            a.setSig(b);    
    }


    public T verUltimo() {
        if (isEmpty()) 
            throw new EmptyCollectionException();

        Nodo<T> actual = primero;
        while (actual.getSig() != null) {
            actual = actual.getSig();
        }

        return actual.getDato();
    }
    
    public T verPrimero(){
        if (isEmpty()) {
            throw new EmptyCollectionException();
        }
        return primero.getDato();
    }
    
    public Iterator<T> iterator() {
        return new IteradorEE(primero);
    }
 
}