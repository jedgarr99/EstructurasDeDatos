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
public class CamionEscolar extends DePasajeros implements java.io.Serializable {
     private double costo;
    
    public CamionEscolar(String placa){
        super(placa);
    }
    public CamionEscolar(String marca, String numMotor,String placas, int totalPas,double costo){
        super(marca, numMotor,placas,totalPas);
        this.costo=costo;
    }
    
    
    
}
