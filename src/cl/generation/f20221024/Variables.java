package cl.generation.f20221024;
//aqui se importan las librerias, algunas se hacen solas



public class Variables {

	public static void main(String[] args) {
		//The variables
		
		//variables primitivas, caracter estatico, no ofrecen funciones
		
		//variables numericas
		
		
		byte num1 = 32;//variable entera(128 al 127)8 bits
		
		short num2 = 31000; //variable entera (-32,768 a 32,767)16 bits
		
		int numero1 = 2; // variable numerica (tamaño -2^31 y +2^31-1) 32 bits
		//(-2,147,483,648 y el máximo 2,147,483,647) (inclusive).
		
		long numero2 = 334972309342l; //variable entera(-9,223,372,036,854,775,808 a 9,223,372,036,854,775,807)
		//-2^63 y +2^63-1
		
		float decimal = 2.5f; //variable de decimales, 32 bits
		
		float decimal2 = (float) 2.5;//castear
		
		double decimal3 = 9.8d;//numeros decimales con más presicion, 64 bits
		
		
		//
		char caracter = 'a'; //siempre en comillas simples,solo un caracter
		boolean respuesta = true; //false 
		
		//imprimir variables
		System.out.println(numero1 + " " + numero2+ " " + decimal + " "+ decimal2 + " " + decimal3 + " " + caracter);
		System.out.println(respuesta);
		
		//variable objeto o no primitivo, nos ofrecen funciones
		//la primera letra con mayus
		
		String palabra = "holaaa"; //siempre en "", siempre mayus a S.
		//palabra.
		System.out.println(palabra);		
		
		Integer numero3 = 2;//variable numerica (tamaño -2^31 y +2^31-1)
		System.out.println(numero3);
		
		Long numero4 = 23832499999L;//se debe castear, poner la L
		Float numero5 = 327439F;
		Double numero6 = 201805112D; 
		
		//Conversion a otros tipos de datos numericos
		
		

	}

}
