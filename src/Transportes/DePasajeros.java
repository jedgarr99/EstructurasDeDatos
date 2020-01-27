/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema10;

/**
 *
 * @author edi
 */
public class DePasajeros extends Camion{
    private int totalPas;
    
    public DePasajeros(String placas){
        super(placas);
    }
    public DePasajeros(String marca, String numMotor,String placas, int totalPas){
        super(marca, numMotor,placas);
        this.totalPas=totalPas;
    }
    public String toString(){
        StringBuilder bui=new StringBuilder();
        
        bui.append(super.toString());
        bui.append("\nTotal de pasajeros "+totalPas);
        return bui.toString();
        
    }
    
}
