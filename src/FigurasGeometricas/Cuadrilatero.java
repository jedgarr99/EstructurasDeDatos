/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema8y9;


public abstract class Cuadrilatero implements FigGeometrica {
    protected double base;
    protected double altura;
    
   public Cuadrilatero(double base, double altura){
       this.base=base;
       this.altura=altura;
   }
    
    public  double calculaArea(){
        return base*altura;
    }
    public  double calculaPeri(){
        return base*2+altura*2;
    }
    
}
