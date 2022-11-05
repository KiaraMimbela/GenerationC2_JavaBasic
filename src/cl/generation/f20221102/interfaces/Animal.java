package cl.generation.f20221102.interfaces;

public abstract class Animal {
	private Float peso;
	private Float altura;

	public Animal() {
		super();
	}

	public Animal(Float peso, Float altura) {
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

	/*
	 * public void metodoEnAnimal() {
	 * System.out.println("Estoy en el metodo de animal"); }
	 */

	public abstract void metodoEnAnimal();
	// Difinicion del metodo
	// Los metodos abstract no pueden tener de especificaciones en el cuerpo
}
