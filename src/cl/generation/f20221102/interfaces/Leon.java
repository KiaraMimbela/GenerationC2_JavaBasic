package cl.generation.f20221102.interfaces;

public class Leon extends Carnivoros implements Generico {

	@Override
	public void respirar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void comer() {
		System.out.println("Come carne.");
	}

	@Override
	public String toString() {
		return "Leon [ Peso = " + getPeso() + ", Altura = " + getAltura() + "]";
	}

}
