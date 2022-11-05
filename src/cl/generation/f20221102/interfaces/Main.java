package cl.generation.f20221102.interfaces;

public class Main {

	public static void main(String[] args) {
		// Interfaces y clases abstractas

		// No se pueden instanciar clases abstractas
		// Animal animal = new Animal();

		Caballo cabalo = new Caballo();
		cabalo.setAltura(2.5f);

		Humano humano = new Humano();
		humano.setRazonamiento(true);
		humano.metodoEnAnimal();

		Leon leon = new Leon();
		leon.setAltura(0.80f);
		leon.setPeso(200f);
		// Imprimir que come carne
		leon.comer();
		leon.metodoEnAnimal();
		// Imprimir los valores seteados
		// No imprime a menos que la class leon tenga el to string
		System.out.println(leon.toString());
		System.out.println("Altura: " + leon.getAltura() + " " + "Peso: " + leon.getPeso());

		Persona person = new Persona();
		person.comer();

	}

}
