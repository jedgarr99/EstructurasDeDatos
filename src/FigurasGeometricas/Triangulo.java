
package Problema8y9;

public class Triangulo implements FigGeometrica{
    private double lado1;
    private double lado2;
    private double lado3;
    private double altura;
    
    public Triangulo(double lado1,double lado2, double lado3,double altura){
        this.altura=altura;
        this.lado1=lado1;
        this.lado2=lado2;
        this.lado3=lado3;          
    }
    
    public double calculaArea(){
        return lado1*altura/2;
    }
    public double calculaPeri(){
        return lado1+lado2+lado3;
    }
}
