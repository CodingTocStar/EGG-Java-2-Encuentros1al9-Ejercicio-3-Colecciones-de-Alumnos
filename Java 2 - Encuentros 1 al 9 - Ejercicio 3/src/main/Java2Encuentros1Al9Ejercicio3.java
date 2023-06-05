/*
Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. 

La clase Alumno tendrá como atributos, 
        su nombre y 
        una lista de tipo Integer con sus 3 notas.

En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. 
Se pide toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): 
    El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package main;

import Entidades.Alumno;
import Servicios.AlumnoService;
import java.util.ArrayList;

/**
 *
 * @author MiriamNahuel
 */
public class Java2Encuentros1Al9Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlumnoService alumnoServicio = new AlumnoService();     //creo el servicio del alumno

        ArrayList<Alumno> listaAlumnos = alumnoServicio.CrearAlumnos();     //creo la lista de alumnos con el objeto Alumno en un array list usando el metodo crear alumnos

        double notaFinal = alumnoServicio.notaFinal(listaAlumnos);      //guardo en la variable notaFinal el resultado del metodo
        if (notaFinal == -1) {
            System.out.println("No se encontró el alumno");
        } else {
            System.out.println("La nota final del alumno es: " + notaFinal);
        }
    }

}
