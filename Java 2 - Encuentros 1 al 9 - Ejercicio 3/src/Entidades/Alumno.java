/*
La clase Alumno tendrá como atributos, 
        su nombre y 
        una lista de tipo Integer con sus 3 notas.

 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author MiriamNahuel
 */
public class Alumno {
    //atributos
    private String nombre;
    private ArrayList<Integer> notas;       //el dato es un arraylist de tipo integer
   
    //constructores
    public Alumno(){}       //muy importante para poder instanciar el objeto sin darle parametros.
    
    public Alumno(String nombre, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }
    
    //GETTER & SETTER

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }
    
}
