/*
En el servicio de Alumno deberemos tener 
    1) un bucle que crea un objeto Alumno. 
        Se pide toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
        pregunta al usuario si quiere crear otro Alumno o no.
    
    2)Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
    Método notaFinal(): 
    El usuario ingresa el nombre del alumno que quiere calcular su nota final y 
    se lo busca en la lista de Alumnos. 
        Si está en la lista, se llama al método. Dentro del método se usará la lista notas para 
        calcular el promedio final de alumno. 
        Siendo este promedio final, devuelto por el método y mostrado en el main.
 */
package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author MiriamNahuel
 */
public class AlumnoService {

    Scanner lector = new Scanner(System.in).useDelimiter("\n");

    //metodos
                //es una lista del objeto alumno
    public ArrayList<Alumno> CrearAlumnos() {               //metodo crear que es un arraylist
        ArrayList<Alumno> alumnos = new ArrayList();      //haciendo el array list de alumnos  y es lo que quiero retornar
        String respuesta;

        do {
            Alumno alumno = new Alumno();//creo el objeto alumno y lo guardo en una variable

            
            //nombre del alumno
            System.out.println("Ingrese el nombre del alumno");
            String nombre = lector.next();
            alumno.setNombre(nombre);

            //notas
            ArrayList<Integer> notasAlumno = new ArrayList();
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la nota " + (i + 1));
                notasAlumno.add(lector.nextInt());
            }

            alumno.setNotas(notasAlumno); //seteo todas las notas

            alumnos.add(alumno); //al arraylist alumnos agrego el objeto alumno que cree
            System.out.println("Quiere agregar otro alumno? S/N");
            respuesta = lector.next();

        } while (!respuesta.equalsIgnoreCase("n"));

        return alumnos; //devuelvo el arrayList de objetos creado
    }

//    Método notaFinal(): 
//    El usuario ingresa el nombre del alumno que quiere calcular su nota
//final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
//del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
//promedio final, devuelto por el método y mostrado en el main.
    public double notaFinal(ArrayList<Alumno> alumnos) {

        //variables
        int notaFinal;
        //logica
        System.out.println("Ingrese el nombre del alumno que quiere sacar la nota final");
        String nombre = lector.next();
        
        // Recorrer la lista de alumnos
        for (Alumno alumno : alumnos) {     //del objeto Alumno creo una variable vacia llamada alumno que va a recorrer la lista de objetos de alumnos
            // Si el nombre del alumno coincide con el ingresado
            if (alumno.getNombre().equalsIgnoreCase(nombre)) {      //del objeto alumno, llamo al metodo getNombre y uso el metodo de si es igual a un parametro que le voy a pasar
                // Obtener las notas del alumno
                ArrayList<Integer> notasAlumno = alumno.getNotas();     //del array list de enteros con ese nombre traemos las notas del objeto alumno
                int sumaNotas = 0;

                // Sumar todas las notas
                for (int nota : notasAlumno) {      //recorro la lista de notasAlumno usando la variable vacia nota
                    sumaNotas += nota;
                }

                // Calcular y retornar el promedio
                return (double) sumaNotas / notasAlumno.size();     //el metodo size me tira la cantidad de elementos que tiene, o sea el tamaño 
            }
        }

        // Si no se encontró al alumno, retornar -1 (o cualquier otro valor que indique que no se encontró al alumno)
        return -1;
    }

//--------------------------------------------------------    
}
