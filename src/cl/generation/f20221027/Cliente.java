package cl.generation.f20221027;

public class Cliente {
	// Atributos

	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private Integer edad;
	private Integer cedula;
	private String correo;

	// Constructores

	public Cliente() {
		super();
	}

	public Cliente(String nombre, String apellidoPaterno, String apellidoMaterno, Integer edad, Integer cedula,
			String correo) {
		super();
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.edad = edad;
		this.cedula = cedula;
		this.correo = correo;
	}

	// get y set

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Integer getCedula() {
		return cedula;
	}

	public void setCedula(Integer cedula) {
		this.cedula = cedula;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "Cliente [Nombre = " + nombre + ", Apellido Paterno =" + apellidoPaterno + ", Apellido Materno ="
				+ apellidoMaterno + ", Edad = " + edad + ", Cédula =" + cedula + ", Correo =" + correo + "]";
	}

}
