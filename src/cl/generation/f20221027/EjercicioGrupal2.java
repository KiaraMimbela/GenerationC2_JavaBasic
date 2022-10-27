package cl.generation.f20221027;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EjercicioGrupal2 {

	public static void main(String[] args) {
		// crear el menu de opciones(1.Area de triangulo, 2.Area de circulo, 3.Perimetro
		// de ...)
		// solicitar y capturar los datos
		// sacar perimetro, area de triangulo
		// sacar perimetro, area de rectangulo
		// sacar perimetro, area de circulo
		// imprimir el resultado
		// definir variables y metodos
		// terminar la ejecucion
		menu();

	}

	public static void menu() {
		System.out.println("----------------------------------");
		System.out.println("|         MENÚ                    |");
		System.out.println("----------------------------------");
		System.out.println("|    1.PERÍMETRO DEL TRIÁNGULO    |");
		System.out.println("|    2.ÁREA DEL TRIÁNGULO         |");
		System.out.println("|    3.PERÍMETRO DEL RECTÁNGULO   |");
		System.out.println("|    4.ÁREA DEL RECTÁNGULO        |");
		System.out.println("|    5.PERÍMETRO DEL CÍRCULO      |");
		System.out.println("|    6.ÁREA DEL CÍRCULO           |");
		System.out.println("|    0.SALIR                      |");
		System.out.println("----------------------------------");

		Scanner sc = new Scanner(System.in);
		int opciones = 0;
		int contadorErrores = 4;

		do {
			System.out.println("| Seleccione una opción  |");
			opciones = sc.nextInt();

			if (opciones == 0) {
				System.out.println("| Saliendo del programa  |");
				break;
			}

			if (opciones < 0 || opciones > 6) {
				contadorErrores--;
				System.out.println("| Te quedan " + contadorErrores + " intentos   |");
			}
			if (contadorErrores == 0) {
				System.out.println("| Excedió la cantidad de intentos  |");
				break;
			}

		} while (opciones < 0 || opciones > 6);

		if (opciones == 0 || contadorErrores == 0) {
			System.out.println("|         ADIÓS          |");
		} else {

			float resultado = 0;
			float radio = 0;
			float lado1 = 0;
			float lado2 = 0;
			float lado3 = 0;
			float base = 0;// largo
			float altura = 0;// ancho
			float diametro = 0;

			DecimalFormat formato1 = new DecimalFormat("#.##");
			switch (opciones) {
			case 1:// PERÍMETRO DEL TRIÁNGULO
				System.out.println("| Ingrese lado 1         |");
				lado1 = sc.nextFloat();
				System.out.println("| Ingrese lado 2         |");
				lado2 = sc.nextFloat();
				System.out.println("| Ingrese lado 3         |");
				lado3 = sc.nextFloat();
				resultado = lado1 + lado2 + lado3;
				System.out.println("El perímetro del triángulo es " + (formato1.format(resultado) + " |"));
				break;
			case 2:// ÁREA DEL TRIÁNGULO
				System.out.println("| Ingrese la base del triángulo   |");
				base = sc.nextFloat();
				System.out.println("| Ingrese la altura del triángulo |");
				altura = sc.nextFloat();
				resultado = base * altura / 2;
				System.out.println("| El área del triángulo es " + (formato1.format(resultado) + " |"));
				break;
			case 3:// PERÍMETRO DEL RECTÁNGULO
				System.out.println("| Ingrese la altura del rectángulo |");
				altura = sc.nextFloat();
				System.out.println("| Ingrese la base del rectángulo   |");
				base = sc.nextFloat();
				resultado = 2 * (base + altura);
				System.out.println("| El perímetro del rectángulo es " + (formato1.format(resultado) + " |"));
				break;
			case 4:// ÁREA DEL RECTÁNGULO
				System.out.println("| Ingrese el largo del rectángulo  |");
				base = sc.nextFloat();
				System.out.println("| Ingrese el ancho del rectángulo  |");
				altura = sc.nextFloat();
				resultado = base * altura;
				System.out.println("| El área del rectángulo es " + (formato1.format(resultado) + " |"));
				break;
			case 5:// PERÍMETRO DEL CÍRCULO
				System.out.println("| Ingrese el diámetro del círculo  |");
				diametro = sc.nextFloat();
				resultado = (float) (Math.PI * diametro);
				System.out.println("| El perímetro del círculo es " + (formato1.format(resultado) + " |"));
				break;
			case 6:// ÁREA DEL CÍRCULO
				System.out.println("| Ingrese el radio del círculo     |");
				radio = sc.nextFloat();
				resultado = (float) (Math.PI * Math.pow(radio, 2));
				System.out.println("| El área del círculo es " + (formato1.format(resultado) + " |"));
				break;
			default:
				System.out.println("| Opción no valida   |");
				break;
			}
		}
		sc.close();

	}

}
