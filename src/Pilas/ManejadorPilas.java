/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilas;

import java.util.ArrayList;

public class ManejadorPilas {
    private String exp;
    
    public ManejadorPilas(String cadena){  
        exp=cadena;
    }
    public boolean revisarParentesis(){
        PilaA<Character> pila=new PilaA();
        int i=0;
        boolean check=true;
        
        while(i<exp.length()&&check){
            if(exp.charAt(i)=='(')
                  pila.push('(');
            else{
               if(exp.charAt(i)==')'){
                  if(pila.isEmpty())
                      check=false;
                  else
                      pila.pop();
               } 
            }
      
          
            i++;
        }
        return check;
        
    }
    public  String invierte(String in){
        PilaA<Character> pila=new PilaA();
        StringBuilder bui=new StringBuilder(); 
        
        for(int i=0;i<in.length();i++){
            pila.push(in.charAt(i));
        }
        for(int i=0;i<in.length();i++){
            bui.append(pila.pop());
        }
            return bui.toString();
    }
   
   
    public static boolean contiene(PilaA a, PilaA b){
        boolean res=false;
        PilaA aa,bb;
        aa=new PilaA();
        bb= new PilaA();
        
        while(!a.isEmpty()&&!res){
            if(a.peek()==b.peek()){
                res=true;
                bb.push(b.pop());
            }
            aa.push(a.pop()); 
        }
        
        while(!b.isEmpty()&&!a.isEmpty()&&res){
            if(a.peek()==b.peek()){
                 bb.push(b.pop());
                 aa.push(a.pop());
            }
            else
                res=false;
        }
        
        while(!aa.isEmpty())
            a.push(aa.pop());
        
        while(!bb.isEmpty())
           b.push(bb.pop());  
        
        return res;
    }
    
    public static int cuantosElementos(PilaA a){
        int res=0;
        PilaA aa=new PilaA();
        
        while(!a.isEmpty()){
            aa.push(a.pop());
            res++;
        }
        for(int i=0;i<res;i++){
            a.push(aa.pop());
        }
        return res;
    }
    
    public static<T> void invierte(PilaA<T> a){
        ArrayList<T> aa = new ArrayList<>();
        int i=0;
        
        while(!a.isEmpty()){
            aa.add(a.pop());
            i++;
        }
        for(int j=0; j<i;j++)//aa.size en lugar de i
            a.push(aa.get(j));
    }
    public static <T> void quitaRepetidos(PilaA<T> a){
        PilaA<T> aa=new PilaA<>();
        
        aa.push(a.pop());//validar
        while(!a.isEmpty())
            if(a.peek()==aa.peek())
              a.pop(); 
            else
                aa.push(a.pop());
        
        while(!aa.isEmpty())
            a.push(aa.pop());      
    }
    public boolean parentesisYmas(){
        boolean res=true;
        int i=0;
        PilaA<Character> a=new PilaA<>();
        
        while(i<exp.length()&&res){
            System.out.println(i);
            if(exp.charAt(i)=='('||exp.charAt(i)=='['||exp.charAt(i)=='{'){
                a.push(exp.charAt(i));
            }
            else
                if(exp.charAt(i)==')'||exp.charAt(i)==']'||exp.charAt(i)=='}'){
                    if(!a.isEmpty())
                        if((exp.charAt(i)==')'&& a.peek()=='(')||(exp.charAt(i)==']'&& a.peek()=='[')||(exp.charAt(i)=='}'&& a.peek()=='{'))
                            a.pop();
                        else
                            res=false;
                    else
                        res=false;
                }
            i++;   
        }
        if(!a.isEmpty())
            res=false;
        
        return res;
    }
    public static int binario(int num){
        PilaA<Integer> a=new PilaA<>();
        StringBuilder bui=new StringBuilder();
        
        while(num!=0){
            a.push(num%2);
            num/=2;  
        }
        while(!a.isEmpty()){
            bui.append(a.pop());
        }
        return Integer.parseInt(bui.toString());
    }
    
    public static <T> void voltea(PilaA<T> a){
        PilaA <T> b=new PilaA();
        Object o;
        
        while(!a.isEmpty())
            b.push(a.pop());
         
        
        while(!b.isEmpty()){
            o=b.pop();
            if(!b.isEmpty())
                a.push(b.pop());
            a.push((T)o);  
        }
    }
    public static <T> boolean sonCasiIguales(PilaA<T> a, PilaA<T> b, int n){
        PilaA<T> auxA =new PilaA();
        PilaA<T> auxB =new PilaA();
        boolean res=true;
        int i=0;
        
        while(!a.isEmpty())
            auxA.push(a.pop());
         while(!b.isEmpty())
            auxB.push(b.pop());
         
         while(i<n&&true){
             if(auxA.peek()!=auxB.peek())
                 res=false;
             i++;
             a.push(auxA.pop());
             b.push(auxB.pop());
         }
         while(!auxA.isEmpty())
            a.push(auxA.pop());
         while(!auxB.isEmpty())
            b.push(auxB.pop());
         return res;
         
         
        
    }
}