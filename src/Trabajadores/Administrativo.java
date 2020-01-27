/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajadores;

public class Administrativo extends Empleado{
    private String departamento;
    private int tel;
    
    public Administrativo(){
        super();
    }
    public Administrativo(String nombre, double sueldoBase, String departamento, int tel){
        super(nombre, sueldoBase);
        this.departamento=departamento;
        this.tel=tel;
    }
    public String toString(){
        StringBuilder bui=new StringBuilder();
        
        bui.append(super.toString());
        bui.append("\n El departamento es: "+departamento);
         bui.append("\n El telefono es: "+tel);
         return bui.toString();
    }
}
