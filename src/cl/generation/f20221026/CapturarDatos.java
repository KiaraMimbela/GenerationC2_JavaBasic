package cl.generation.f20221026;

import java.util.Scanner;

public class CapturarDatos {

	public static void main(String[] args) {
		Float IMC = calculoIMC();

	}

	public static Float calculoIMC() {
		// Capturar datos ingresados por el usuario
		// Scanner sc = new Scanner(System.in);
		// System.in, es de ingreso, de capturar

		Scanner scanner = new Scanner(System.in);// declaración de la var
		// abriendo scanner para que extraiga datos

		// ejemplo
		// calculo del IMC; indice de masa muscular
		// imc = kilos/(estatura*estatura);

		System.out.println("Ingrese su peso en kilogramos");
		Float peso = scanner.nextFloat();
		System.out.println("El peso del paciente es: " + peso);

		System.out.println("Ingrese su estatura en metros");
		Float estatura = scanner.nextFloat();
		System.out.println("La estatura del paciente es: " + estatura);

		Float IMC = peso / (estatura * estatura);

		System.out.println("Este es su índice de masa moscular " + IMC);
		// puede imprimirse en main o en la funcion, depende de donde lo necesites

		nivelIMC(IMC);// tambien se puede llamar un metodo dentro de otro metodo
		scanner.close();// se le dice que termine, se debe cerrar
		return IMC;
	}

	// es void porque no se necesita retornar nada
	public static void nivelIMC(Float IMC) {

		// Por debajo de 18.5 Bajo peso
		// 18.5 - 24.9 Normal
		// 25.0 - 29.9 Sobrepeso
		// 30.0 o más Obeso

		// no era necesario, buena practica especificar la f
		if (IMC < 18.5F) {
			System.out.println("El paciente está en el rango bajo de peso");
		} else if (IMC >= 18.5F && IMC < 25) {
			// se coloca 25 para que cuente todos los decimales del 24.99999
			System.out.println("El paciente está en el rango normal");
		} else if (IMC >= 25F && IMC < 30) {
			System.out.println("El paciente está en el rango sobrepeso");
		} else {
			System.out.println("El paciente está en el rango obeso");
		}

	}

}
