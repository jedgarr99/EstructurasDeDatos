/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conjuntos;

import Colas.ConjuntoArreglo;
import java.util.Iterator;

/**
 *
 * @author edi
 */
public class Escuela {
    private String nombre;
    private String direccion;
    private ConjuntoArreglo<Alumno> ingenieria;
    private ConjuntoArreglo<Alumno> licenciatura;

    public Escuela(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        ingenieria= new ConjuntoArreglo();
        licenciatura= new ConjuntoArreglo();
    }
    public void altaAlumno(String nombre, boolean estI, boolean estL,double promedio, int edad){
        
        Alumno a=new Alumno( nombre, estI, estL,promedio,  edad);
        if(estI)
            ingenieria.agrega(a);
        if(estL)
            licenciatura.agrega(a);   
    }
    public boolean quitarAlumno(int cu, boolean quitarDeIngenieria, boolean quitarDeLicenciatura){
        Alumno a= new Alumno(cu);
        boolean res=true;
                
        
        if(quitarDeIngenieria)
            if(ingenieria.quita(a)==null)
                res=false;  
            
        if(quitarDeLicenciatura)
             if(licenciatura.quita(a)==null)
                res=false;
        
      return res;  
    } 
    
    public String todosAlumnos(){
       return ingenieria.union(licenciatura).toString();
    }
    public String alumnosPlanConjunto(){
        return ingenieria.interseccion(licenciatura).toString();  
    }
    public String soloUnaCarrera(){
        return ingenieria.diferencia(licenciatura).toString()+licenciatura.diferencia(ingenieria).toString();
    }
    
    public double promedioTodosAlumnos(){
        double total=0;
        int alumnos;
        Iterator<Alumno> itI=ingenieria.iterator();
        Iterator<Alumno> itL=licenciatura.iterator();
        
        
        alumnos=ingenieria.getCardinalidad()+licenciatura.getCardinalidad();
        if(alumnos!=0){
            while(itI.hasNext())
            total+=itI.next().getPromedio();
         while(itL.hasNext())
            total+=itL.next().getPromedio();
         
         total/=alumnos;
        }
     
         return total;
    }
    public int alumnosMayoresLicenciatura(int edad){
        int contador=0;
        Iterator<Alumno> itL=licenciatura.iterator();
        
         while(itL.hasNext())
             if(itL.next().getEdad()>=edad)
                 contador++;
         return contador;  
    }  
}
