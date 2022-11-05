package cl.generation.f20221102.poli;

public class Perro extends Mascota {
	private String sonido;

	// Constructor vacio
	public Perro() {
		super();
	}

	// Constructores con los atributos de padre (mascota)
	public Perro(String raza, String nombre, String sexo) {
		super(raza, nombre, sexo);
	}

	// Constructor con stributo propio
	public Perro(String sonido) {
		super();
		this.sonido = sonido;
	}

	// Constructor con todo
	public Perro(String raza, String nombre, String sexo, String sonido) {
		super(raza, nombre, sexo);
		this.sonido = sonido;
	}

	public String getSonido() {
		return sonido;
	}

	public void setSonido(String sonido) {
		this.sonido = sonido;
	}

	@Override
	public void emitirSonido() {
		System.out.println("El sonido (ladrido) es guaff .");
	}
}
