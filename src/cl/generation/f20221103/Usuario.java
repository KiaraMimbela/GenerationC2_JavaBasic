package cl.generation.f20221103;

import java.util.ArrayList;

public class Usuario {
	private String nombre;
	private String apellido;
	private String nick;
	private String password;
	private String correo;
	private ArrayList<String> telefono;
	// Atributo de colaboracion
	private Direccion direccion;

	public Usuario() {
		super();
		// Inicializando un arreglo
		this.telefono = new ArrayList<String>();
		this.direccion = new Direccion();
	}

	public Usuario(String nombre, String apellido, String nick, String password, String correo,
			ArrayList<String> telefono, Direccion direccion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.nick = nick;
		this.password = password;
		this.correo = correo;
		this.telefono = new ArrayList<String>();
		this.direccion = direccion;
	}

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

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public ArrayList<String> getTelefono() {
		return telefono;
	}

	public void setTelefono(ArrayList<String> telefono) {
		this.telefono = telefono;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellido=" + apellido + ", nick=" + nick + ", password=" + password
				+ ", correo=" + correo + ", telefono=" + telefono + ", direccion=" + direccion + "]";
	}

}
