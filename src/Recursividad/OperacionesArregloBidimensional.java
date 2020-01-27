/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividad;

public class OperacionesArregloBidimensional  {
    
    public static double sumaRenglon(double[][] matriz, int n, int m){
        if(m==-1)
            return 0;
        else
            return matriz[n][m]+sumaRenglon(matriz, n, m-1);     
    }
    public static double sumaColumna(double[][] matriz, int n, int m){
        if(n==-1)
            return 0;
        else
            return matriz[n][m]+sumaColumna(matriz, n-1, m);     
    }
    public static <T> String toString(T[][] mat){
        StringBuilder b=new StringBuilder();
        int m=0, n=0;
        return toStringAux(mat,n,m, b);
    }
    private static <T> String toStringAux(T[][] mat,int n, int m,StringBuilder b){
        if(m==mat[0].length-1&&n==mat.length-1)
            return b.toString();
        else{
            b.append(mat[n][m]);
            if(m==mat[0].length-1){
                b.append("\n");
                 return toStringAux(mat, n+1,0,b);
            }  
            else
                return  toStringAux(mat, n,m+1,b);
            
        }
           
            
    }
    

    
}
