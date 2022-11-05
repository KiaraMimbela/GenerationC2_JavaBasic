package cl.generation.f20221102;

public class Administrativo extends Persona {

	private String titulo;
	private String cargo;

	public Administrativo() {
		super();
	}

	public Administrativo(String titulo, String cargo) {
		super();
		this.titulo = titulo;
		this.cargo = cargo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "Administrativo [ Titulo = " + titulo + ", Cargo = " + cargo + ", Nombre = " + getNombre()
				+ ", Apellido = " + getApellido() + ", Edad = " + getEdad() + "]";
	}

}