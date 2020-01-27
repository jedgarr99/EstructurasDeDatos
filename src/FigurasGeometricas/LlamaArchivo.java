/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema8y9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class LlamaArchivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo r=new Rectangulo(10,4);
        Circulo c=new Circulo(5);
        Double arre[]={2.5,6.0,9.3,1.7};
        
        try(FileOutputStream file=new FileOutputStream("ejemplo");
                ObjectOutputStream salida=new ObjectOutputStream(file);){
            salida.writeObject(r);
            salida.writeObject(c);
            salida.writeObject(arre);
        }catch(Exception e){
            System.out.println("\nError"+e.getMessage());
        }
        
        try{
            FileInputStream file=new FileInputStream("ejemplo");
            ObjectInputStream lee =new ObjectInputStream(file);
            FigGeometrica[] figs=new FigGeometrica[10];
            Object o;
            int i=0;
            o=lee.readObject();
            while(o!=null && i<figs.length){
                if(o instanceof FigGeometrica){
                    figs[i]=(FigGeometrica)o;
                    i++;
                }
                o=lee.readObject();
                
            }
            lee.close();
            
            
        }catch(Exception e){
            System.out.println("\nError"+e.getMessage());
        }
        
                
       

        
    }
    
    
}
