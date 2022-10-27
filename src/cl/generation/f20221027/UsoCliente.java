package cl.generation.f20221027;

import java.util.Scanner;

public class UsoCliente {

	public static void main(String[] args) {
		// Instanciar

		Cliente cliente1 = new Cliente();

		// Agregando

		cliente1.setNombre("Luis");
		cliente1.setApellidoPaterno("Pino");
		cliente1.setApellidoMaterno("Hormazabal");
		cliente1.setEdad(20);
		cliente1.setCedula(1233445545);
		cliente1.setCorreo("luis@gmail.com");

		// Viendo los atributos

		System.out.println(cliente1.toString());

		// Salto de pagina

		System.out.println("\n");

		// Cliente 2 con ingreso de datos por el usuario

		Cliente cliente2 = new Cliente();
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese su nombre");
		String nombre = sc.next();
		cliente2.setNombre(nombre);

		System.out.println("Ingrese su apellido paterno");
		String apePaterno = sc.next();
		cliente2.setApellidoPaterno(apePaterno);

		System.out.println("Ingrese su apellido materno");
		String apeMaterno = sc.next();
		cliente2.setApellidoMaterno(apeMaterno);

		System.out.println("Ingrese su edad");
		Integer edad = sc.nextInt();
		cliente2.setEdad(edad);

		System.out.println("Ingrese su cédula");
		Integer cedula = sc.nextInt();
		cliente2.setCedula(cedula);

		System.out.println("Ingrese su correo");
		String correo = sc.next();
		cliente2.setCorreo(correo);

		sc.close();

		// Salto de pagina

		System.out.println("\n");

		// Imprimiendo los datos del cliente 2

		System.out.println(cliente2.toString());

	}

}
