package app;

import clases.Cilindro;
import clases.Cubo;

public class Principal {

	public static void main(String[] args) {
		
		Cubo cu1 = new Cubo(6);
		int superficieCubo1=cu1.superficie();
		int volumenCubo1=cu1.volumen();
		
		Cubo cu2 = new Cubo(2);
		int superficieCubo2=cu2.superficie();
		int volumenCubo2=cu2.volumen();
		
		Cilindro ci1 = new Cilindro(4,9);
		double superficieCilindro1=ci1.superficie();
		double volumenCilindro1=ci1.volumen();
		
		Cilindro ci2 = new Cilindro(7,8);
		double superficieCilindro2=ci2.superficie();
		double volumenCilindro2=ci2.volumen();

	}

}
