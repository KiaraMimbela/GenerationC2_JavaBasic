package cl.generation.f20221028;

import java.util.ArrayList;
import java.util.Scanner;

public class ActividadTKEstudiante {

	public static void main(String[] args) {
		// Ejercicio Take Five
		menu();

	}

	public static void menu() {
		System.out.println("---------------------------------");
		System.out.println("|             MENÚ              |");
		System.out.println("---------------------------------");
		System.out.println("|  1.INGRESAR DATOS ESTUDIANTE  |");
		System.out.println("|           0.SALIR             |");
		System.out.println("---------------------------------");

		Scanner sc = new Scanner(System.in);

		Integer opciones = 0;
		System.out.println("| Seleccione una opción         |");
		opciones = sc.nextInt();

		ArrayList<String> cohorte = new ArrayList<String>();

		Estudiante estudiante = new Estudiante();
		String nombre = " ";
		String apellido = " ";
		String correo = " ";
		
		if (opciones == 0) {
			System.out.println("| Saliendo del programa        |");
		} else if (opciones == 1) {
			do {
				System.out.println("| Ingrese el nombre del estudiante      |");
				nombre = sc.next();
				cohorte.add(nombre);
				System.out.println("| Ingrese el apellido del estudiante      |");
				apellido = sc.next();
				cohorte.add(apellido);
				System.out.println("| Ingrese el correo del estudiante      |");
				correo = sc.next();
				cohorte.add(correo);
				break;
			} while (opciones == 1);

		}
		
		System.out.println(cohorte);
	}

}
