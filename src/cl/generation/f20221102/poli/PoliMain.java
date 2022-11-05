package cl.generation.f20221102.poli;

public class PoliMain {

	public static void main(String[] args) {
		// Polimorfismo

		// Instancia
		Mascota mascota = new Mascota();
		mascota.emitirSonido();

		Perro ayun = new Perro();
		ayun.emitirSonido();

		Gato tom = new Gato();
		tom.emitirSonido();

		/**** POLIMORFISMO ***/
		// una clase se comporta como una pero no lo es

		/**
		 * Una super clase se comporta como hija pero no lo es Para que existir necesita
		 * la herencia, jerarquia de clase
		 **/
		System.out.println(" ");
		Mascota regalon = new Perro();
		regalon.emitirSonido();
		regalon.setNombre("Pegro");
		// Puede ir al metodo pero no puede acceder a los atributos
		System.out.println(regalon.toString());
		
		/**
		 * Polimorfismo parametrico
		 * El metodo se escribe igual pero recibe distintos parametros
		 * **/

		Mascota mishi = new Gato();
		mishi.emitirSonido();
		mishi.horaSiesta(16.5f);
		
		//Perro gua = new Macota();
		Perro dog = (Perro) regalon;//castears
		
	}

}
