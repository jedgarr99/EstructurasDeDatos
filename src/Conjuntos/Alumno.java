/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conjuntos;

/**
 *
 * @author edi
 */
public class Alumno  {
    private String nombre;
    private boolean estI;
    private boolean estL;
    private double promedio;
    private int edad;
    private  int cu;
    private static int generador=1800;
    
    
    public Alumno(String nombre, boolean estI, boolean estL,double promedio, int edad){
        this.nombre=nombre;
        this.estL=estL;
        this.estI=estI; 
        this. promedio=promedio;
        this.edad=edad;
        this.cu= generador;
        generador++;
    }
    public Alumno (int cu){
        this.cu=cu;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isEstI() {
        return estI;
    }

    public boolean isEstL() {
        return estL;
    }

    public double getPromedio() {
        return promedio;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstI(boolean estI) {
        this.estI = estI;
    }

    public void setEstL(boolean estL) {
        this.estL = estL;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String toString(){
        StringBuilder bui=new StringBuilder();
        bui.append("\nClave Unica : "+cu);
        bui.append("\nNombre: "+nombre);
        bui.append("\nPromedio: "+promedio);
        bui.append("\nEdad: "+edad);
        bui.append("\nEstudiante de Ingenieria: "+estI);
        bui.append("\nEstudiante de Licenciatura: "+estL);
        
        return bui.toString(); 
    }

    public int getCu() {
        return cu;
    }
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.cu;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (this.cu != other.cu) {
            return false;
        }
        return true;
    }


    public int compareTo(Alumno o) {
         return cu-o.getCu();
    }
    
   
    
}
