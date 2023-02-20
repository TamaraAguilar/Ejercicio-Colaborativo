package com.generation.ejerciciocolaborativo;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

@SpringBootApplication
public class EjerciciocolaborativoApplication {

/* Vamos a pedir al usuario que ingrese la cantidad alumnos 
a los cuales les asignará una nota, luego de que ingrese la cantidad de notas de cada alumnos, se va a desplegar un menú.
las opciones del menú serán la siguientes:
1. Mostrar el promedio de notas
2. Mostrar si la nota es aprobatoria o reprobatoria
3. Mostrar si la nota está por sobre o por debajo del promedio del curso
*/

/*Paso a Paso:
 * 1) Solicitar al usuario la cantidad de alumnos
 * 2) Solicitar el nombre de cada alumno
 * 2) Solicitar la cantidad de notas por alumno
 * 3) Ingresar notas por alumno
 * 4) Definir la nota aprobatoria
 * 5) Sacar el promedio
 * 6) Verificar si está por sobre o por debajo del promedio general
 * 7) Verificar si la nota aprueba o reprueba
 * 8) Crear el menú
 * 9) Hacer validaciones sobre las notas y la cantidad de alumnos
 */

/*Code:
 * import java.util.Scanner
 * import java.util.ArrayList
 * import java.util.Hashmap
 * inicializar el scanner
 * definir variable para cantidad de alumnos
 * definir variable para nombre de alumnos
 * definir nota aprobatoria (4.0)
 * verificar que la cantidad de alumnos sea mayor a cero mediante un if
 * pedirle al usuario que ingrese la cantidad de alumnos
 * pedirle al usuario que ingrese la cantidad de notas por alumnos
 */

/* FUNCIONES DEL EJERCICIO */

	public static Double promedioNotas(ArrayList<Double> notas){
		Double suma = 0.0;
		for (int i = 0; i < notas.size(); i++);
		// suma = suma + notas.get(i) -> es lo mismo :D
		suma += notas.get(i);
		
		
	}
	
	public static void main(String[] args) {

 	Scanner teclado = new Scanner(System.in);
	String nomAlum = "";
	Double notaAprobatoria = 4.0;
	HashMap <String, ArrayList<Double>> libroClase = new HashMap<String, ArrayList<Double>>();
	
	//Se declara fuera del do... while ya que si la declaramos dentro
	//la variable pasa a ser local por ende no podríamos ocuparla fuera de este
	int cantAlum;
	int cantNotas;
	
	do {
		System.out.print("Indique la cantidad de alumnos que va a ingresar: ");
		cantAlum = teclado.nextInt();
		if(cantAlum <0) {
			System.out.print("La cantidad de alumnos debe ser mayor a cero, por favor intente de nuevo");
	}

	} while(cantAlum <= 0);

	do{
		System.out.print("Indique la cantidad de notas por alumnos: ");
		cantNotas = teclado.nextInt();
		if(cantNotas <= 0) {
			System.out.print("La cantidad de notas debe ser mayor a cero, por favor intente más tarde");

		}
	} while (cantNotas <= 0);

//Tenemos un for porque tenemos los datos exactos que se van a ingresar
	for(int i = 1; i <= cantAlum; i++){
		System.out.print("Ingrese nombre del alumno: ");
		teclado.nextLine();
		nomAlum = teclado.nextLine();
		ArrayList<Double> notasAlumnos = new ArrayList<Double>();
		for(int x = 1; x <= cantNotas; x++){
			System.out.println("Ingrese nota " + x + " del alumno " + nomAlum + ": ");
			//Pedirle al usuario que ingrese las notas
			Double nota = teclado.nextDouble();
			//Ingresar las notas al array
    		notasAlumnos.add(nota);
		}

		libroClase.put(nomAlum, notasAlumnos);
		//desafío: verificar dónde debería o cómo debería limpiar el arreglo para que
		//funciona con la declaración de manera global
		//mandar el link del git o un SS a Pame/ 0.5 décimas
		//notasAlumnos.clear();
	}
	for(String i : libroClase.keySet()){
		System.out.println("Key: "+ i + " Valor:" + libroClase.get(i));
	}

	}

}
