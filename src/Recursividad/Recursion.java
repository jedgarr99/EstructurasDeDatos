
package Recursividad;

public class Recursion {
    
    public static int calcFactorial(int n){
        if(n==0||n==1)
            return 1; //Estado base
        else
            return n*calcFactorial(n-1);//Estado recursivo.Instruccion que garantize llegar al estado base
    }
    
    public static int fibonacci(int n){
        if(n==1||n==0)
            return n;
        else
            return fibonacci(n-2)+fibonacci(n-1);            
    }
    public static int sumaArre(int[] arre, int tot){
        if(tot==0)
            return 0;
        else
            return arre[tot-1]+sumaArre(arre,tot-1);
    }
    public static void impArre(int[] arre, int tot){
        if(tot>0){
            System.out.print(arre[tot-1]+" ");
            impArre(arre,tot-1);
        }
    }
    public static void impArreID(int[] arre, int tot){
        if(tot>0){
              impArre(arre,tot-1);
              System.out.print(arre[tot-1]+" ");    
        }   
    }
    
    public static void impMovTorreHanoi(int n){
        impMovTorreHanoi(n,"Torre 1","Torre 2","Torre 3");
    }
    private static void impMovTorreHanoi(int n, String o, String aux, String des){
        if(n==1)
            System.out.println("Mover 1 disco de "+o+"a "+des);
        else{
            impMovTorreHanoi(n-1, o,des,aux);
            System.out.println("Mover 1 disco de "+o+"a "+des);
            impMovTorreHanoi(n-1, aux,o,des);
        }     
    }
    public static boolean sonIguales (int[][] arre1,int ren1, int col1, int[][] arre2, int ren2, int col2){
        int i=0, j=0;
        
        if(arre1!= null && arre2 !=null && col1==col2 && ren1==ren2){
            return sonIguales(arre1,arre2, ren1, col1, i, j);
        }
        else
            return false;
    }
    private static boolean sonIguales(int[][] arre1,int[][] arre2, int ren, int col, int i, int j){

        if(i<ren){
            if(j<col)
                if( arre1[i][j]==arre2[i][j])
                    return sonIguales(arre1, arre2, ren,col, i, j+1);  
                else
                    return false;     
            else
                return sonIguales(arre1, arre2, ren,col, i+1, 0);    
        }    
        return true;
    }
    
}
