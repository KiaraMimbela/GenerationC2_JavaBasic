package cl.generation.f20221025;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EjercicioHashTf {

	public static void main(String[] args) {

		HashMap<String, Integer> takefive = new HashMap<String, Integer>();
		// añadiendo elementos
		takefive.put("Kiara", 12);
		takefive.put("Cynthia", 16);
		takefive.put("Luis", 18);
		takefive.put("Pablo", 11);
		takefive.put("Daniel", 19);
		System.out.println(takefive);

		// Bucle = keySet()método si solo quiere las claves, y use el values()método si
		// solo quiere los valores

		System.out.println(" ");// solo es para visualizar en consola

		for (String i : takefive.keySet()) {
			System.out.println(i);
		}
		System.out.println(" ");// solo es para visualizar en consola

		for (Integer i : takefive.values()) {
			System.out.println(i);
		}
		System.out.println(" ");// solo es para visualizar en consola

		for (String i : takefive.keySet()) {
			System.out.println("key: " + i + " value: " + takefive.get(i));
		}
		System.out.println(" ");// solo es para visualizar en consola
		System.out.println("*********************");

		// Iterador en un HashMap

		for (Map.Entry<String, Integer> set : takefive.entrySet()) {

			System.out.println("Iterador");//solo es para visualizar en consola
			// Imprimimos elemento y valor
			System.out.println(set.getKey() + " = " + set.getValue());
			
		}

		// eliminar un elemento
		System.out.println(" ");//solo es para visualizar en consola

		takefive.remove("Luis");
		System.out.println(takefive);
		System.out.println(" ");//solo es para visualizar en consola
		
		//saber el tamaño
		System.out.println("Los takers: " + takefive.size());

		/*HashMap<Integer, String> TakeFive = new HashMap<Integer, String>();
		int i = 0;
		while (i < 5) {
			TakeFive.put(i + 1, "Integrante ");
			i += 1;
		}
		System.out.println(TakeFive);
		System.out.println(TakeFive.entrySet());

		// While con itinerator

		// Devuelve el siguiente elemento en una iteracción.itinerator.next();
		// objeto que permite al programador recorrer un arreglo
		/*
		 * Iterator iterator = hashmap.entrySet().iterator(); while (iterator.hasNext())
		 * { Map.Entry me2 = (Map.Entry) iterator.next(); System.out.println("Nombre: "
		 * + me2.getKey() + " & Edad: " + me2.getValue()); }
		 */
	}

}
