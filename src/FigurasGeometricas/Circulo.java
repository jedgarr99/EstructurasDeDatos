
package Problema8y9;

public class Circulo implements FigGeometrica {
    private double radio;
    
    public Circulo(double radio){
        this.radio=radio;
    }
     public double calculaArea(){
        return 3.14159265358979323846264338327950288419716939937510*radio*radio;
    }
    public double calculaPeri(){
        return radio*2*3.151592;
    }

    public double getRadio() {
        return radio;
    }
    

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }
    
}
