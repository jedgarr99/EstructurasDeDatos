/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividad;

/**
 *
 * @author edi
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*int[] a={2,9,8,6};
        ArregloGenerico b=new ArregloGenerico();
        double[][] c={{6,9,8},{7,4,6},{5,4,3}};
        String[][] d={{"6","9","8"},{"7","4","6"}};
        b.alta("2");
        b.alta("3");
        b.alta("4");
        b.alta("4");
        b.alta("4");
        b.alta("4");
        b.alta("8");
        System.out.println(d[0].length);
        System.out.println(d.length);
        System.out.println(OperacionesArregloBidimensional.sumaRenglon(c, 1, 2));
        System.out.println(OperacionesArregloBidimensional.sumaColumna(c,2, 0));
        System.out.println(OperacionesArregloBidimensional.toString(d));
        System.out.println(b.busquedaSecuencial("4"));   
        System.out.println(b.toString());        
        System.out.println(b.posMayor());
        b.eliminaOcurrencias("4");
        System.out.println(" ");
      // b.ordSeleccionDirecta();
        System.out.println(b.toString()); */
        
        int [][] sudoku1 = {{1, 0, 6, 0, 0, 0, 0, 0, 0},
                           {0, 0, 0, 0, 0, 0, 0, 0, 5},
                           {0, 0, 5, 0, 6, 2, 0, 4, 0},
                           {0, 9, 3, 4, 5, 0, 6, 0, 0},
                           {7, 0, 0, 0, 0, 0, 0, 0, 2},
                           {0, 0, 0, 0, 0, 0, 0, 8, 9},
                           {8, 0, 2, 0, 0, 0, 0, 0, 7},
                           {0, 0, 0, 0, 1, 0, 0, 0, 0},
                           {0, 0, 4, 5, 0, 0, 2, 0, 0}};
        
        int [][] sudoku2 = {{1, 0, 6, 0, 0, 0, 0, 0, 0},
                           {0, 0, 0, 0, 0, 0, 0, 0, 5},
                           {0, 0, 5, 0, 6, 2, 0, 4, 0},
                           {0, 9, 3, 4, 5, 0, 6, 0, 0},
                           {7, 0, 0, 0, 0, 0, 0, 0, 2},
                           {0, 0, 0, 0, 0, 0, 0, 8, 9},
                           {8, 0, 2, 0, 0, 0, 0, 0, 7},
                           {0, 0, 0, 0, 1, 0, 0, 0, 0},
                           {0, 0, 4, 5, 0, 0, 2, 0, 0}};
        System.out.println(Recursion.sonIguales(sudoku1, 9, 9, sudoku2, 9, 9));
        
        
       /* System.out.println(Recursion.calcFactorial(4));
        System.out.println(Recursion.fibonacci(4));
        Recursion.impArreID(a, 4);
        System.out.println("    ");
        Recursion.impArre(a, 4);*/
    }
    
}
