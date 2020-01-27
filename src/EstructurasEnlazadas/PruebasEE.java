/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructurasE;

/**
 *
 * @author Edgar
 */
public class PruebasEE {
    public static void main(String[] args) {
        
        EstructuraEnlazada<String> a= new EstructuraEnlazada<String>();
        EstructuraEnlazada<String> b= new EstructuraEnlazada<String>();
        

        a.agregaInicio("2");
        a.agregaInicio("1");

        System.out.println(a.toString());
        b.agregaFinal("a");
        b.agregaFinal("b");
        b.agregaFinal("c");
        b.agregaFinal("d");
        System.out.println(b.toString());
        a.mezcla(b);
        System.out.println(a.toString());

        
        
    }
    
}
