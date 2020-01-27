/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema10;

import java.util.Objects;


public abstract class Camion implements java.io.Serializable{
    private String marca;
    private String numMotor;
    private String placas;
    
    public Camion(String marca, String numMotor,String placas){
        this.marca=marca;
        this.numMotor=numMotor;
        this.placas=placas;
    }
    public Camion(String placa){
        this.placas=placa;
        
    }
    
    public String toString(){
        StringBuilder bui=new StringBuilder();
        
        bui.append("\nNumero de Motor "+numMotor);
        bui.append("\nNumero de placas"+placas);
        bui.append("\nMarca "+marca);
        return bui.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.placas);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Camion other = (Camion) obj;
        if (!Objects.equals(this.placas, other.placas)) {
            return false;
        }
        return true;
    }

    public String getMarca() {
        return marca;
    }

    public String getNumMotor() {
        return numMotor;
    }

    public String getPlacas() {
        return placas;
    }
    
    
}
