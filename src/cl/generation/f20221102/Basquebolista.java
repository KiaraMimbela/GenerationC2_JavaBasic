package cl.generation.f20221102;

public class Basquebolista extends EquipoBasquetball {
	private Float peso;
	private Float altura;

	public Basquebolista() {
		super();
	}

	public Basquebolista(Float peso, Float altura) {
		super();
		this.peso = peso;
		this.altura = altura;
	}

	public Float getPeso() {
		return peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}

	public Float getAltura() {
		return altura;
	}

	public void setAltura(Float altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Basquebolista [Peso = " + peso + ", Altura = " + altura + ", Nombre = " + getNombre() + ", Apellido = "
				+ getApellido() + ", Edad = " + getEdad() + "]";
	}

	// Sobreescribiendo el metodo
	@Override
	public void metodoImprimir() {
		System.out.println("Estoy en el metodo de la clase hija basquebolista");
	}
}
