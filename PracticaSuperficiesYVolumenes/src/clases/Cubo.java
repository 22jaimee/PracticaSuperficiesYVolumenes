package clases;

public class Cubo {
		private int lado;
		
		/**
		 * Constructor crea un cubo dados los lados
		 * @param lado lado del cubo
		 */
		public Cubo(int lado) {
			if(lado<=0) {
				throw new IllegalArgumentException("El lado debe ser superior a 0");
			}
			this.lado=lado;
		}
		
		/**
		 * Crea un cubo de lado 1
		 */
		Cubo cubo1 = new Cubo(1);
		
		/**
		 * Calcula la superficie del cubo
		 * @return la superficie del cubo
		 */
		public int superficie() {
			return (lado*lado)*6;
		}
		
		/**
		 * Calcula el volumen del cubo
		 * @return el volumen del cubo
		 */
		public int volumen() {
			return lado*lado*lado;
		}
}
