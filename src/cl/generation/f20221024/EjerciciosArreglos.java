package cl.generation.f20221024;

import java.util.Arrays;

public class EjerciciosArreglos {

	public static void main(String[] args) {
		//Escribir un arreglo de tamaño de 10, con números positivos y  negativos, capturar el maximo y minimo
		
		int[] arreglo = {-3,-5, 4, 12, 3, 35, -35, 7, -1, 0};
		
		int maxNum = arreglo[0];
		int minNum = arreglo[0];
		
		for (int i = 0; i < arreglo.length; i++) {
			if(arreglo[i] > maxNum) //hace la comparacion 
				maxNum = arreglo[i];//sobreescribe según el resultado de la comparacion
			if(arreglo[i] < minNum) 
				minNum = arreglo[i];
		}
		System.out.println("El número mayor es " + maxNum);
		System.out.println("El número menor es " + minNum);
		
		
		//El mismo arreglo crear otros 2 arreglos, uno con solo los pares y otro arreglo solo con los impares.
		
		int[] pares = new int [arreglo.length];//se crea un array con la misma cantidad del otro array 
		int[] impares = new int [arreglo.length];
		
		for(int i = 0; i < arreglo.length; i++) {
			if(arreglo[i] % 2 == 0) {//obtener par
				pares[i] = arreglo[i];//se coloca en la array pares en la misma posicion que tenia en el otro arreglo
			}else {//si no cumple la condicion
				impares[i] = arreglo[i];//se coloca en el array impares ...
			}
		}
		System.out.println(Arrays.toString(pares));
		System.out.println(Arrays.toString(impares));
		
		//Para el mismo arreglo, sacar el promedio de los números.
		
		float suma = 0;
		for(int i = 0; i < arreglo.length; i++) {
			suma = suma + arreglo[i];
		}
		//System.out.print(suma);
		//System.out.print(" ");
		float prom = 0;
		prom = suma / arreglo.length;
		System.out.println(prom);
	
	}

}

