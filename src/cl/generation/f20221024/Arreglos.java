package cl.generation.f20221024;

import java.util.Arrays;//trae las propiedades que utilizan los arrays

public class Arreglos {

	public static void main(String[] args) {
		// Arreglos/Array en Java 
		//se especifica que tipos de datos estan en el array. exam:int=numerica
		int[] arreglo = new int [3];//(estaticos, no cambia de tamaño[3])
		//arreglo.length;tamaño del arreglo
		
		//agregar datos
		arreglo[0] = 4;
		arreglo[1] = 3;
		arreglo[2] = 7;
		//arreglo[3] =  34;//error afuera de indice [3]
		
		System.out.println(arreglo.toString());//convirtiendo un espacio de memoria([I@27f674d) en string
		System.out.println(Arrays.toString(arreglo));//imprime los elementos del arreglo
		System.out.println(arreglo[0]+"");//convirtiendo el dato en la posicion 0 en string
		System.out.println(arreglo[0]);//imprime el dato en la posicion 0
		System.out.println(arreglo.length);//imprime la cantidad de datos en el arreglo
	    
		//{}
		int[] sinNumeros = {};//cero
		System.out.println(sinNumeros.length);
		//sinNumeros [0] = 78;//para un arreglo vacio NO SE PUEDE
		
		//para asignar valores se usan las llaves
		
		String[] vocales = {"a","e","i","o","u"}; //arreglo de string
		System.out.println("La cantidad de elementos "+ vocales.length);
		vocales [0] = "e";
		vocales [3] = "i";
		vocales [2] = "y";
		//vocales [2] = 1+""; convierte el numero en string
		vocales [4] = "hola";//se puede colocar cualquier string, pq el arreglo es de string
		System.out.println(Arrays.toString(vocales));
		
		//ejercicio, crear un array de numeros flotantes de tamaño 6
		float[] numeros = new float [6];
		//agregar 6 elementos
		numeros [0] = 1.33f;
		numeros [1] = 2.3f;
		numeros [2] = 33; //si se puede porque esta dentro del rango de float
		numeros [3] = -2;
		numeros [4] = 78.f;
		numeros [5] = -78.2f;//aunque es negativo sigue siendo flotante
		System.out.println(Arrays.toString(numeros));
		
		int[] numeroInt = new int[2];
		numeroInt [0] = (int) 0.3;//se puede agregar si se castea y solo agrega la parte entera
		numeroInt [1] = 3;
		System.out.println(Arrays.toString(numeroInt));
		
		//crear un arreglo de enteros tamaño 100 y agregar valores dinamicamente
	    //desde el 1 al 100
		
		int[] numeros1 = new int[100];
		
		/*for (int i = 0; i < numeros1.length; i++) {
			numeros1[i] = i + 1;
		}*/
		/*for(int i = 1; i<= 100; i++) {
			numeros1[i - 1] = i;//[i - 1] pq i la posicion, 100-1=99 posicion 99
		}*/
		
		//del 100 al 1
		/*for (int i = 0; i < numeros1.length; i++) {
			numeros1[i] = 100 - i;
		}*/
		for (int i = numeros1.length; i > 0 ; i--) {
			//i = 100
			numeros1[numeros1.length - i] =i;
			//[100 - 100] =  100                
			//posicion 0 = 100
		}
		
		System.out.println(Arrays.toString(numeros1));
		
		
		
		
		
		
		
	}
}	
		