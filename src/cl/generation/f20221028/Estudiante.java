package cl.generation.f20221028;

public class Estudiante {
	// Atributos
	private String nombre;
	private String apellido;
	private Integer edad;
	private String dni;
	private String curso;
	private String correo;

	// Constructores
	public Estudiante() {
		super();
	}

	public Estudiante(String nombre, String apellido, Integer edad, String dni, String curso, String correo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.dni = dni;
		this.curso = curso;
		this.correo = correo;
	}

	public Estudiante(String nombre, String apellido, String dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}

	public Estudiante(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;

	}

	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	// Metodos
	@Override
	public String toString() {
		return "Estudiante [Nombre = " + nombre + ", Apellido = " + apellido + ", Edad = " + edad + ", Dni = " + dni
				+ ", Curso = " + curso + ", Correo = " + correo + "]";
	}

}
