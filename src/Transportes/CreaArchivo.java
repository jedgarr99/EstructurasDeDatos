/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema10;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class CreaArchivo {

 
    public static void main(String[] args) {
        CamionEscolar e1,e2,e3;
        CamionTurismo t1,t2,t3;
        
        e1= new CamionEscolar("BMW","864","aaa001",50,200.60);
         e2= new CamionEscolar("BMW","864","aaa002",50,200.60);
          e3= new CamionEscolar("BMW","864","aaa003",50,200.60);
          
         t1=new CamionTurismo("BMW","864","bbb001",50,200.60);
         t2=new CamionTurismo("BMW","864","bbb002",50,200.60);
         t3=new CamionTurismo("BMW","864","bbb003",50,200.60);
        
        
        
  
        
        try(FileOutputStream file=new FileOutputStream("camiones");
                ObjectOutputStream salida=new ObjectOutputStream(file);){
            salida.writeObject(e1);
            salida.writeObject(e2);
            salida.writeObject(e3);
            salida.writeObject(t1);
            salida.writeObject(t2);
            salida.writeObject(t3);
            
        }catch(Exception e){
            System.out.println("\nError"+e.getMessage());
        }
        
    }
    
}
