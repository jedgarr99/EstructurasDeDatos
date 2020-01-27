/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conjuntos;

import Colas.ConjuntoADT;
import java.util.Iterator;


public class Pruebas  {
    public static <T> boolean sonIguales(ConjuntoADT<T> c1,ConjuntoADT<T> c2){
        boolean res=false;
        if(c1!=null&&c2!=null)
            if(c2.getCardinalidad()==c1.getCardinalidad()&&c1.diferencia(c2).getCardinalidad()==0)
                res=true;
        return res;
    }
    public static boolean analizaDeportivos(ConjuntoADT<Object> cA, int n){
        boolean res=false;
        Iterator<Object> it = cA.iterator();
        int cont=0;
        
        if(cA!=null)
            res=analizaDeportivos(n, it,cont);
        
        return res;
    }
    private static boolean analizaDeportivos(int n, Iterator<Object> it, int cont){
        Object o;
        
        if(it.hasNext()){
            o=it.next();
                if(o instanceof String)
                    if(((String)o).length()>3)
                        cont++;
            if(cont<n){             
            return  analizaDeportivos(n, it,cont);   
            }
            else
                return true;  
        }
        else
            return false;
        
    }
    
}
