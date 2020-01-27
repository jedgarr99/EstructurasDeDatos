/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilas;

public class PilasPrueba {

    public static void main(String[] args) {
      ManejadorPilas p=new ManejadorPilas("()(][]{}");
      
        System.out.println( p.invierte("jorge"));
        
        PilaA<Character> a,b;
        
        a=new PilaA();
        b=new PilaA();
        a.push('1');
        a.push('2');
        a.push('3');
        a.push('4');
        a.push('5');
        a.push('6');
        a.push('7');
        a.push('8');
        a.push('9');
        
        b.push('1');
        b.push('2');
        b.push('a');
        b.push('b');
        
        System.out.println( ManejadorPilas.sonCasiIguales(a, b, 2));
        
        /*System.out.println(ManejadorPilas.contiene(a, b));
        System.out.println(ManejadorPilas.cuantosElementos(a));
        ManejadorPilas.invierte(a);
        System.out.println(a.peek());
        ManejadorPilas.quitaRepetidos(a);
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.pop());
         System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.pop());
       
        System.out.println(p.parentesisYmas());
        System.out.println(4%2);
        System.out.println(4/2);
        System.out.println(2/2);
        System.out.println(1/2);
        System.out.println(ManejadorPilas.binario(10));*/

      
    }
    
}
