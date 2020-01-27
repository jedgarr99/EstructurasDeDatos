/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conjuntos;

import Colas.ConjuntoADT;
import Colas.ConjuntoArreglo;
import java.util.Iterator;

/**
 *
 * @author edi
 */
public class PruebaConjunto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ConjuntoADT<String> con=new ConjuntoArreglo();
         ConjuntoADT<Double> con2=new ConjuntoArreglo();
         Iterator<Double> it;
         double suma=0;
         
         con.agrega("azul");
         con.agrega("rojo");
         con.agrega("amarillo");
         if(con.agrega("rojo"))
             System.out.println("Alta exitosa");
         else
             System.out.println("Alta fallida");
         
         con2.agrega(10.5);
         con2.agrega(20.3);
         con2.agrega(240.9);
         con2.agrega(86.47);
         
         if(con2.agrega(240.9))
             System.out.println("Alta exitosa");
         else
             System.out.println("Alta fallida");
         
         it=con2.iterator();
         while(it.hasNext())
             suma+=it.next();
         
         ConjuntoADT<Object> c= new ConjuntoArreglo();
         String a="aaaa",b= "bbbbb", d="ddddd";
         Integer e=2,f=8,g=9;
         c.agrega(a);
         c.agrega(e);
         c.agrega(b);
         c.agrega(f);
         c.agrega(g);
         c.agrega(d);
         System.out.println(Pruebas.analizaDeportivos(c, 3));
         
    }
    
}
