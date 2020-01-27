/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colas;

/**
 *
 * @author edi
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ColaA<String> a= new ColaA(6);


 
       
        System.out.println(a.toString());
        //System.out.println(a.cuentaElementos());
        //Ejercicios.quitaRepetidos(a);
        //Ejercicios.invierteR(a);
        //System.out.println(a.toString());
        System.out.println(a.noHayVecinosIguales());
      

        
        
    }
    
}
