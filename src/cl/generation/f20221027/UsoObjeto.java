package cl.generation.f20221027;

public class UsoObjeto {

	public static void main(String[] args) {
		// Instancia de clase //no se importa porque estan en la misma carpeta
		// Creacion o referencia del objeto
		// Creando una instancia de auto1 de tipo auto = inicializando (constructor);
		Auto auto1 = new Auto();
		// auto1.color = "azul";// no funciona porque el atributo es privado

		// la forma de acceder a ellos es por los setters
		// asignar valor a los atributos privados

		auto1.setColor("azul");
		auto1.setMarca("Nissan");

		// Consultar el contenido de los atributos, por get
		System.out.println(auto1.getColor());
		System.out.println(auto1.getModelo());

		// Para saber el contenido de los atributos, de todos
		System.out.println(auto1.toString());

		// Nueva instancia de Auto
		// Este se usa cuando sabes todos los atributos y se añanden en los parametros
		Auto carr = new Auto("Nissan", "Negro", "Qashqai", 1.6f, 10.0f, 240f);
		System.out.println(carr.getModelo());

		auto1.setModelo("Moccacin");// Se puede agregar, ya que la var auto1 vive dentro de todo el main
		System.out.println(auto1.toString());
	}

}
