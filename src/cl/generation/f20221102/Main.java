package cl.generation.f20221102;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// Herencia en Java

		// Instaciando objetos
		Entrenador entrenador = new Entrenador();
		// atributos heredados
		entrenador.setNombre("Jhon");
		entrenador.setApellido("Doe");
		entrenador.setEdad(55);
		// atributos propios
		entrenador.setAniosExperiencia(10);
		entrenador.setEquipo("Valdivia");

		System.out.println(entrenador.toString());

		// Instanciando otro objeto con los atributos heredados y propios
		Entrenador entrenadorAyudante = new Entrenador("Isra", "Palma", 42, 17, "Cohorte2");
		System.out.println(entrenadorAyudante.toString());

		// Instanciando
		Kinesiologo kine = new Kinesiologo();
		kine.setNombre("Jane");
		kine.setApellido("Doe");
		kine.setEdad(52);
		kine.setTitulo("Kinesiologia");
		kine.setEspecialidad("En músculos");
		System.out.println(kine.toString());

		ArrayList<Basquebolista> listaJugadores = new ArrayList<Basquebolista>();
		// Creando otra instancia
		Basquebolista basque = new Basquebolista();
		basque.setNombre("Michel");
		basque.setApellido("Pipen");
		basque.setAltura(2.15f);
		// Agregando un objeto a la lista
		listaJugadores.add(basque);
		// Creando otra instancia
		Basquebolista basque1 = new Basquebolista();
		basque1.setNombre("Pepe");
		basque1.setApellido("Pipen");
		basque1.setAltura(2.25f);
		// Agregando un objeto a la lista
		listaJugadores.add(basque1);
		// Recorrer lista
		for (Basquebolista basquebolista : listaJugadores) {
			System.out.println(basquebolista.toString());
		}

		// Usando metodos
		entrenador.metodoImprimir();// Imprime el metodo de su padre aunque el no lo tenga
		kine.metodoImprimir();
		basque1.metodoImprimir();

		// Instancia de clase nieta
		Ayudante ayudante = new Ayudante();
		ayudante.metodoImprimir();
		// Aunque el padre no tenga el metodo, usa el metodo por herencia del abuelo
		// Como herencia, el nieto hereda lo del abuelo y lo del padre
		// Si el nieto no tiene el metodo, por herencia imprime lo del abuelo
	}

}
