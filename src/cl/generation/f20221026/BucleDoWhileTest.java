package cl.generation.f20221026;

import java.util.Scanner;

public class BucleDoWhileTest {

	public static void main(String[] args) {
		// doWhile
		// a lo menos se ejecuta una vez

		// contexto : para mayores de edad
		Scanner sc = new Scanner(System.in);// para recibir datos
		int edad = 0;
		Float kilos = 0f;
		Float estatura = 0F;
		
		// edad
		do {
			System.out.println("Ingrese su edad");
			edad = sc.nextInt();// se va a capturar el dato en int

		} while (edad < 18 || edad > 120);
		// si la condicion es verdadera, se vuelve a ejecutar
		// le pide su edad una y otra vez por ser menor de edad
		// termina el bucle cuando es mayor de edad
		System.out.println("La edad ingresada es " + edad);

		// kilos
		do {
			System.out.println("Ingrese su kilos");
			kilos = sc.nextFloat();

		} while (kilos < 40 || kilos > 150);

		System.out.println("El kilos ingresado es " + kilos);

		// estatura
		do {
			System.out.println("Ingrese su estatura");
			estatura = sc.nextFloat();

		} while (estatura < 1.00 || estatura > 2.70);

		System.out.println("La estatura ingresado es " + estatura);
		
		sc.close();
	}

}
