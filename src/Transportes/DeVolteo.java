/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema10;


public class DeVolteo extends Camion {
    private double capacidadTon;
    
    public DeVolteo(String placa){
        
        super(placa);
        
    }
    public DeVolteo(String marca, String numMotor,String placas, double capacidadTon){
        super(marca, numMotor,placas);
        this.capacidadTon=capacidadTon;
    }
    public String toString(){
        StringBuilder bui=new StringBuilder();
        
        bui.append(super.toString());
        bui.append("\nCapacidad en Toneladas "+capacidadTon);
        return bui.toString();
        
    }

    public void setCapacidadTon(double capacidadTon) {
        this.capacidadTon = capacidadTon;
    }

    public double getCapacidadTon() {
        return capacidadTon;
    }
    
    
}
