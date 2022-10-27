package cl.generation.f20221027;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		// Menu de opciones
		// Terminar la ejecución
		menu();

		// Ofrecer opciones de repeticion (bucles)

		// Calculadora con 4 operaciones basicas
		// Solicitar y capturar 2 numeros float
		// Imprimir los resultado y guardar en una variable

		// Definir los metodos
		// Validaciones

		// Limpiar las variables
	}

	public static void menu() {
		// es para mostrar, asi que no necesitamos retornar nada
		System.out.println("-------------------------");
		System.out.println("|         MENÚ           |");
		System.out.println("-------------------------");
		System.out.println("|       1.SUMAR          |");
		System.out.println("|       2.RESTAR         |");
		System.out.println("|       3.MULTIPLICAR    |");
		System.out.println("|       4.DIVIDIR        |");
		System.out.println("|       0.SALIR          |");
		System.out.println("-------------------------");

		Scanner sc = new Scanner(System.in);
		int opciones = 0; // buena practica tener las variables arriba
		int contadorErrores = 4; // para controlar cuantas veces se repite el do-while

		do {
			System.out.println("| Seleccione una opción  |");
			opciones = sc.nextInt();

			// si la opcion es cero, salir del do-while
			if (opciones == 0) {
				System.out.println("| Saliendo del programa  |");
				break;// para salir de una manera brusca
			}

			// intentos
			if (opciones < 0 || opciones > 4) {// condicion de error
				contadorErrores--;// se le va a descontar las veces que le quedan
				System.out.println("| Te quedan " + contadorErrores + " intentos   |");
			}
			if (contadorErrores == 0) {
				System.out.println("| Excedió la cantidad de intentos  |");
				break;
			}

		} while (opciones < 0 || opciones > 4);

		if (opciones == 0 || contadorErrores == 0) {
			System.out.println("|         ADIÓS          |");
		} else {// solo ingresara para opciones 1.2.3.4

			// solicitar numeros
			System.out.println("| Ingresa el primer número  |");
			float numero1 = sc.nextFloat();
			System.out.println("| Ingresa el segundo número |");
			float numero2 = sc.nextFloat();

			float resultado = 0;

			switch (opciones) {
			case 1:// SUMAR
				resultado = numero1 + numero2;
				System.out.println("| El resultado es " + resultado);
				break;
			case 2:// RESTAR
				resultado = numero1 - numero2;
				System.out.println("| El resultado es " + resultado);
				break;
			case 3:// MULTIPLICAR
				resultado = numero1 * numero2;
				System.out.println("| El resultado es " + resultado);
				break;
			case 4:// DIVIDIR
				if (numero2 == 0) {
					System.out.println("| NO SE PUEDE DIVIDIR POR 0 |");
				} else {
					resultado = numero1 / numero2;
					System.out.println("| El resultado es " + resultado);
				}
				break;

			default:
				System.out.println("| Opción no valida   |");
				break;
			}
		}

	}
}
