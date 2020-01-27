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
public class EmpresaMinera {
    private String nombre;
    private Camion[] camiones;
    private int total;
    private final int MAX=20;
    
    public EmpresaMinera(String nombre){
        this.nombre=nombre;
        total=0;
        camiones=new Camion[MAX];
    }
    public boolean altaCamion(String marca, String numMotor,String placas, double capacidadTon){
        boolean res=false;
        DeVolteo v;
        if(total<MAX){
            res=true;
            v=new DeVolteo(marca,numMotor,placas, capacidadTon);
            camiones[total]=v;
            total++;   
        }
        return res;
    }
    public boolean altaCamion(String marca, String numMotor,String placas, int totalPasajeros){
        boolean res=false;
        DePasajeros v;
        if(total<MAX){
            res=true;
            v=new DePasajeros(marca,numMotor,placas, totalPasajeros);
            camiones[total]=v;
            total++;   
        }
        return res;
    }
    public String infoCamiones(){
        StringBuilder bui=new StringBuilder();
        
        for(int i=0;i<total;i++){
            bui.append(camiones[i].toString());
            bui.append("\n");
        }
        return bui.toString();
               
    }
    public boolean actualizarInfo(String placa,double capacidad){
        DeVolteo n=new DeVolteo(placa);
        boolean res=false;
        int pos;
        
        pos=MAG.busqueda(camiones, n, total);
        
        if(pos!=-1){
            if(camiones[pos] instanceof DeVolteo){
                ((DeVolteo)camiones[pos]).setCapacidadTon(capacidad);
                res=true;
            }
        }
        return res;
    }
    public int totalCamionesPasajeros(String marca){
        int res=0;
        
        for(int i=0; i<total;i++){
            if(camiones[i] instanceof DePasajeros &&camiones[i].getMarca().equals(marca)){
                res++;
            }
        }
        return res;
    }
     public double totalToneladas(){
        double res=0;
        
        for(int i=0; i<total;i++){
            if(camiones[i] instanceof DeVolteo ){
                res+=((DeVolteo)camiones[i]).getCapacidadTon();
                       
            }
        }
        return res;
    }
    
}
