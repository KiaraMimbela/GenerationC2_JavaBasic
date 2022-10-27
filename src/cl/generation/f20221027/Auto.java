package cl.generation.f20221027;

public class Auto {
//Atributos  //es private porque es del objeto, no se puede acceder a ellos 
	private String marca;// "Nissan"
	private String color;// "negro"
	private String modelo;// "ñuñuqui"
	private Float cilindrada;// 1.6 o 2.4
	private Float rendimiento;// 10.5 km/l
	private Float velocidad;// km/h

//Constructor
	// Nos permite instanciar al objeto
	// Nos permite inicializar los atributos

	public Auto() {
		super();
	}

	// lo que se le va a mandar
	public Auto(String marca, String color, String modelo, Float cilindrada, Float rendimiento, Float velocidad) {
		super();
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
		this.rendimiento = rendimiento;
		this.velocidad = velocidad;
	}

	// getters y setters ( accesador y mutador/cambia )

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Float getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(Float cilindrada) {
		this.cilindrada = cilindrada;
	}

	public Float getRendimiento() {
		return rendimiento;
	}

	public void setRendimiento(Float rendimiento) {
		this.rendimiento = rendimiento;
	}

	public Float getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Float velocidad) {
		this.velocidad = velocidad;
	}
	// Metodos del objeto (acciones)

	public void avanzar() {
		System.out.println("Estoy en el método avanzar del objeto");
	}

	@Override // dice que se esta sobreescribiendo
	// metodo que se esta heredando,
	public String toString() {
		return "Auto [Marca=" + marca + ", Color=" + color + ", Modelo=" + modelo + ", Cilindrada=" + cilindrada
				+ ", Rendimiento=" + rendimiento + ", Velocidad=" + velocidad + "]";
	}

}
