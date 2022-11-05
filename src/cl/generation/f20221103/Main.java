package cl.generation.f20221103;


public class Main {

	public static void main(String[] args) {
		// Objetos de colaboracion, es para compartir pero no hereda

		Usuario usuario = new Usuario();
		/*
		 * ArrayList<String> telefono = new ArrayList<String>(); telefono.add("567890");
		 * telefono.add("234234"); usuario.setTelefono(telefono);
		 * System.out.println(usuario.getTelefono());
		 * System.out.println(usuario.toString());
		 */

		// Forma de hacerlo de una manera más facil, se incializo en el constructor
		// vacio
		// Usuario.get porque trae el formato del arreglo y .add para agregarlo
		usuario.getTelefono().add("233");
		usuario.getTelefono().add("324");
		usuario.getTelefono().add("789");
		System.out.println(usuario.getTelefono());
		// Instanciando el objeto direccion
		Direccion direccion = new Direccion();
		// Agregando los datos por seccion
		direccion.setCalle("Santa Elena");
		direccion.setNumero("1723");
		direccion.setSector("A");
		direccion.setCiudad("Santiago");
		direccion.setRegion("Santiago");
		// Agregando el objeto al atributo
		usuario.setDireccion(direccion);
		// Imprimiendo
		System.out.println(usuario.getDireccion().toString());

		// Si se inicializa en el constructor vacio 
		usuario.getDireccion().setCalle("Santa Elena");

	}

}
