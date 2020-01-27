/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema8y9;

/**
 *
 * @author Edgar
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aplicacion app=new Aplicacion();
        int num;
        app.altaCirculo(10);
        app.altaCirculo(20);
        app.altaCuadrado(10);
         app.altaCuadrado(10);
        app.altaRectangulo(10, 8);
        app.altaTriangulo(10, 8, 9, 6);
        
        num=app.getCant();
        for(int i=0;i<num;i++){
            System.out.println(app.area(i));
        }
        System.out.println(app.circuloMasGrande());
        System.out.println(app.totalCuadrados());
       
    }
    
}
