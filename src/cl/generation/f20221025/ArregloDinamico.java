package cl.generation.f20221025;

import java.util.ArrayList;

public class ArregloDinamico {

	public static void main(String[] args) {
		// ArrayList,tambien llamado
		// Definicion
		/*
		 * permite almacenar datos en memoria de forma similar a los Arrays, con la
		 * ventaja de que el numero de elementos que almacena, lo hace de forma
		 * dinámica, es decir, que no es necesario declarar su tamaño
		 */

		// ArrayList<TIPO DE DATO> nombre_array = new ArrayList<TIPO DE DATO>();
		ArrayList<String> takeFive = new ArrayList<String>();

		// Agregar valores
		takeFive.add("Cynthia");
		takeFive.add("Luis");
		takeFive.add("Daniel");
		takeFive.add("Pablo");
		takeFive.add("Kiara");
		System.out.println(takeFive);// ya lo convierte a string

		// tamaño del arraylist
		System.out.println(takeFive.size());// ver tamaño del arraylist
		// length -> array estaticos; size -> arrayList

		// Obtener un elemento dentro del array
		System.out.println(takeFive.get(2));
		// System.out.println(takeFive.get(5));//fuera del indice

		// Eliminar un elemento dentro del array
		takeFive.remove(1);
		takeFive.remove(0);
		System.out.println(takeFive);

		takeFive.add("Cynthia");// cuando se agrega va al final del arreglo

		// Recorrer el ArrayList
		for (int i = 0; i < takeFive.size(); i++) {
			// inicia en posicion 0, i es menor que el largo del Al,aumenta de posicion
			System.out.println("Integrante: " + takeFive.get(i));
		}

		System.out.println("----------");

		// for iterador o for de objeto
		// recorrio el arraylist

		for (String integrante : takeFive) {
			// for(tipo de dato- nombre de la nueva var : nombre de la AL de donde se sacan
			// los datos
			System.out.println(integrante);
			// imprimir la nueva var para saber los elementos
		}
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		
		for(Integer numero :numeros) {
			System.out.println(numero);
		}


	}

}
