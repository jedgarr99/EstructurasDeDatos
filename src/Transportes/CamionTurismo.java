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
public class CamionTurismo extends DePasajeros{
    private double costo;
    
    public CamionTurismo(String placa){
        super(placa);
    }
    public CamionTurismo(String marca, String numMotor,String placas, int totalPas,double costo){
        super(marca, numMotor,placas,totalPas);
        this.costo=costo;
    }
    
    
}
