package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import clases.Cilindro;
import clases.Cubo;

class TestCilindro {

	static private Cilindro c1;
	static private Cilindro c2;
	
	@BeforeAll
	static void init () {
		c1 = new Cilindro(9,4);
		c2 = new Cilindro(8,7);
	}
	
	@Test
	void testSuperficie1() {
		double superficieEsperada = 326.56;
		double superficieObtenida = c1.superficie();
		assertEquals(superficieEsperada,superficieObtenida);
	}
	
	@Test
	void testSuperficie2() {
		double superficieEsperada = 659.4000000000001;
		double superficieObtenida = c2.superficie();
		assertEquals(superficieEsperada,superficieObtenida);
	}
	
	@Test
	void testVolumen1() {
		double volumenEsperado = 452.16;
		double volumenObtenida = c1.superficie();
		assertEquals(volumenEsperado,volumenObtenida);
	}
	
	@Test
	void testVolumen2() {
		double volumenEsperado = 1230.88;
		double volumenObtenida = c2.superficie();
		assertEquals(volumenEsperado,volumenObtenida);
	

}
}
