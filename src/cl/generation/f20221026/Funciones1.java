package cl.generation.f20221026;

import java.util.Arrays;

public class Funciones1 {

	public static void main(String[] args) {
		// funciones o metodo

		// llamar al metodo, se debe pasar con los parametros solicitados
		nombreMetodo();
		metodo2("Piatun, piucho gusto");
		metodo2("Anything");
		metodo2("Azul");
		metodo3(4);
		metodo4(3, 3);
		metodo5(33, 8.9F);

		String[] vocales = { "a", "e", "i", "o", "u" };
		// se creo el arreglo afuera para ser reconocido por el metodo
		metodo6(vocales);

		// metodos con llamados
		// retorno1();//no hace nada con el valor retornado
		// System.out.println(retorno1());//se imprime lo retornado
		Integer valorRetornado = retorno1(); // se creo una var con lo retornado
		System.out.println(valorRetornado);// se imprime
		System.out.println(valorRetornado + 35);// 35 + 35 = 70
		System.out.println(valorRetornado / 7);// 35 / 7 = 5
		
		String nombreCompleto = obtenerNombreCompleto("Naomi", "Mimbela", "Vasquez");
		System.out.println("Mi nombre completo es: " + nombreCompleto);
	}

	// definicion o estructura de un metodo
	// void -> el metodo no retorna ningun valor
	// retornar = una variable con los valores

	public static void nombreMetodo() {
		System.out.println("Estoy aqui");
	}

	public static void metodo2(String nombre) {
		// el metodo dice que cada vez que lo llamen le deben pasar un string.
		System.out.println("Yo soy " + nombre);
	}

	public static void metodo3(Integer numero) {
		System.out.println("Soy el número " + numero);
	}

	public static void metodo4(Integer numero1, Integer numero2) {
		System.out.println("Soy el total " + (numero1 + numero2));
	}

	public static void metodo5(Integer num1, Float num2) {
		System.out.println("Soy el número " + num1);
		System.out.println("Soy el número " + num2);
	}

	public static void metodo6(String[] arreglito) {
		System.out.println("Soy el arreglo " + Arrays.toString(arreglito));

	}

	// funciones con retorno
	public static Integer retorno1() {
		// void se cambia al tipo de dato que se quiere retornar
		Integer totalAlumnos = 35;// se creo la variable
		return totalAlumnos;
	}
	
	/**
	 * Metodo que une los datos
	 * @param nombre
	 * @param apePaterno
	 * @param apeMaterno
	 * @return nombreCompleto
	 */
	public static String obtenerNombreCompleto(String nombre, String apePaterno, String apeMaterno) {
		String nombreCompleto = nombre + " " + apePaterno + " " + apeMaterno;
		return nombreCompleto;//retornamos el contenido de la varibale
	}

}
