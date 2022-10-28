package cl.generation.f20221028;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Instanciar despues a estudiante
		/*Estudiante estudiante = new Estudiante("Matthew", "Mimbela", "234567-2");
		System.out.println(estudiante.toString());
		estudiante.setEdad(3);
		estudiante.setCorreo("piatun_azul@gmail.com");
		estudiante.setCurso("5a");
		System.out.println(estudiante.toString());
		 */
		Scanner sc = new Scanner(System.in);
		//arreglo de estudiantes
		ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
		//en las arraylist se pueden poner los objetos como tipo de dato
		//cuando no se sepa que objeto se usa, puede poner object
		//en este caso se usa Estudiante
		
		//variable de opcion
		int continuar = 2;
		
		do {
			System.out.println("Ingrese el nombre del estudiante");
			String nombre = sc.nextLine();
			System.out.println("Ingrese el apellido del estudiante");
			String apellido = sc.nextLine();
			//instancia al objeto estudiante
			Estudiante estudiante = new Estudiante();
			//asignando valor al atributo
			estudiante.setNombre(nombre);
			estudiante.setApellido(apellido);
			//agregando un objeto al arreglo
			estudiantes.add(estudiante);
			//pregunta
			System.out.println("¿Quiere agregar otro estudiante");
			System.out.println("(1) SI  -  (2)NO");
			//capturando datos de la respuesta
			continuar = sc.nextInt();
			sc.nextLine();//corrige el error de capturar un numero y despues solicitar un nextline
			
		}while(continuar == 1);
		
		System.out.println("----------------------------");
		System.out.println("  DATOS DE LOS ESTUDIANTES");
		System.out.println("----------------------------");
		//imprimiendo el arreglo
		//Tipo de dato  variable (singular de la arraylist) : arraylist
		for (Estudiante estudiante : estudiantes) {
			System.out.println("Nombre : " + estudiante.getNombre());
			System.out.println("Apellido : " + estudiante.getApellido());
			System.out.println("----------------------------");
		}

		//Obtener un estudiante especifico por posicion
		System.out.println(estudiantes.get(1));
		
		//Accedemos a un atributo del objeto
		System.out.println(estudiantes.get(1).getNombre());
		
		
	}

}
