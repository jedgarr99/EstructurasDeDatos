/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema8y9;


public class Aplicacion {
    private FigGeometrica[] figuras;
    private int cant;
    
    public Aplicacion(){
        figuras= new FigGeometrica[10];
        cant=0;
    }
    public boolean altaTriangulo(double lado1,double lado2, double lado3,double altura){
        boolean res=false;
        Triangulo n;
        
        if(cant<figuras.length){
            res=true;
            n=new Triangulo(lado1,lado2, lado3,altura);
            figuras[cant]=n;
            cant++; 
        }
        return res;
    }
     public boolean altaCirculo(double radio){
        boolean res=false;
        Circulo n;
        
        if(cant<figuras.length){
            res=true;
            n=new Circulo(radio);
            figuras[cant]=n;
            cant++; 
        }
        return res;
    }
      public boolean altaCuadrado(double lado){
        boolean res=false;
        Cuadrado n;
        
        if(cant<figuras.length){
            res=true;
            n=new Cuadrado(lado);
            figuras[cant]=n;
            cant++; 
        }
        return res;
    }
       public boolean altaRectangulo(double base, double altura){
        boolean res=false;
        Rectangulo n;
        
        if(cant<figuras.length){
            res=true;
            n=new Rectangulo(base,altura);
            figuras[cant]=n;
            cant++; 
        }
        return res;
    }
       public double area(int pos){
          return  figuras[pos].calculaArea();
       }

    public int getCant() {
        return cant;
    }
    public String circuloMasGrande(){
        double max=0;
        int pos=-1;
        String res;
      
        for(int i=0;i<cant;i++){
           
            if(figuras[i].getClass().getSimpleName().equals("Circulo")){

                if(((Circulo)figuras[i]).getRadio()>max){
                    max=((Circulo)figuras[i]).getRadio();
                    pos=i;    
                }
            }
        }
            if(pos==-1)
                res="No hay circulos registrados";
            else
                res=((Circulo)figuras[pos]).toString();
            
               return res; 

    }
    public int totalCuadrados(){
        int res=0;
        
        for(int i=0;i<cant;i++){
           
            if(figuras[i].getClass().getSimpleName().equals("Cuadrado")){
                res++;
                
                
            }
            
        }
        
        return res;
    }

       
}
