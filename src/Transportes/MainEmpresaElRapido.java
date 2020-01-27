/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema10;

import Problema8y9.FigGeometrica;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author edi
 */
public class MainEmpresaElRapido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EmpresaTransporte r=new EmpresaTransporte("El RApido");
      
         try{
            FileInputStream file=new FileInputStream("camiones");
            ObjectInputStream lee =new ObjectInputStream(file);
            Object o;
            int i=0;
            o=lee.readObject();
            
            while(o!=null ){
                if(o instanceof CamionEscolar)
                   r.altaCamionEscolar((CamionEscolar)o);
                
                else
                    if(o instanceof CamionTurismo)
                        r.altaCamionTurismo((CamionTurismo)o);
 
                o=lee.readObject();
            }
            lee.close();
            
            
        }catch(Exception e){
            System.out.println("\nError"+e.getMessage());
        }
         
        System.out.println(r.infoCamiones());
        
        
    }
    
}
