package cl.generation.f20221025;

import java.util.HashMap;

public class ArregloHashMapTest {

	public static void main(String[] args) {
		// HashMap
		//llave,valor (key,value)
		
		HashMap<Integer,String> relatores = new HashMap<Integer,String>();
		
		//Agregar valores
		relatores.put(1, "Alejandro");
		relatores.put(12, "Andre");
		relatores.put(13, "Laura");
		relatores.put(14, "Pame");
		relatores.put(14, "Pame");//lo sobreescribe, porque tiene la misma clave
		relatores.put(1, "Isra");//si existe esa clave, sobreescribe el valor
		System.out.println("map " + relatores);
		
		//tamaño
		System.out.println(relatores.size());
		
		//acceder a un dato
		System.out.println(relatores.get(12));//en () se pone la clave
		
		//Eliminar un par de elementos
		relatores.remove(13);
		System.out.println("map "+ relatores);
		
		//Recorriendo el map
		/*for (Map.Entry<keyType, valType> entry : map.entrySet()) {
			keyType key = entry.getKey();
			valType val = entry.getValue();
		}*/
		
		for(Integer clave : relatores.keySet()) {
			System.out.println("clave " + clave);
		}
		
		System.out.println(relatores.get(12));
		
		
	}

}
