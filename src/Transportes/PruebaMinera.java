/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema10;


public class PruebaMinera {

    public static void main(String[] args) {
        EmpresaMinera e=new EmpresaMinera("Jorge");
        
        e.altaCamion("BMW", "cas", "721VPK", 10);
        e.altaCamion("BMW", "cas", "722VPK", 20);
        e.altaCamion("BMW", "cas", "723VPK", 15151.445);
        e.altaCamion("BMW", "cas", "724VPK", 2586.356);
        
        System.out.println(e.infoCamiones());
        System.out.println(e.totalCamionesPasajeros("BMW"));
        System.out.println(e.totalToneladas());
   
    }
    
}
