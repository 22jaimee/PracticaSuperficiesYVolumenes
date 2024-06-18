package clases;

public class Cilindro {
	private int radio;
	private int altura;
	
	/**
	 * Constructor crea cilindro dados radio y altura
	 * @param radio radio del cilindro
	 * @param altura altura del cilindro
	 */
	public Cilindro(int radio, int altura) {
		if(radio<=0 || altura<=0) {
			throw new IllegalArgumentException("El radio y la altura deben ser superiores a 0");
		}
		this.radio=radio;
		this.altura=altura;
	}
	
	/**
	 * Crea un cilindro de radio 1 y altura 1
	 */
	public Cilindro() {
		radio=1;
		altura=1;
	}
	
	/**
	 * Calcula la superficie del cilindro
	 * @return la superficie del cilindro
	 */
	public double superficie() {
		return (2*3.14*radio*radio) + (2*3.14*radio*altura);
	}
	
	/**
	 * Calcula el volumen del cilindro
	 * @return el volumen del cilindro
	 */
	public double volumen() {
		return (3.14*radio*radio)*altura;
	}
		
		
}
