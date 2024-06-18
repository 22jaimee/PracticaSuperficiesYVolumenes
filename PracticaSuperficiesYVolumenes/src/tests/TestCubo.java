package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import clases.Cubo;

class TestCubo {
	
	static private Cubo c1;
	static private Cubo c2;
	
	@BeforeAll
	static void init () {
		c1 = new Cubo(6);
		c2 = new Cubo(2);
	}
	
	@Test
	void testSuperficie1() {
		int superficieEsperada = 216;
		int superficieObtenida = c1.superficie();
		assertEquals(superficieEsperada,superficieObtenida);
	}
	
	@Test
	void testSuperficie2() {
		int superficieEsperada = 24;
		int superficieObtenida = c2.superficie();
		assertEquals(superficieEsperada,superficieObtenida);
	}
	
	@Test
	void testVolumen1() {
		int volumenEsperado = 216;
		int volumenObtenida = c1.superficie();
		assertEquals(volumenEsperado,volumenObtenida);
	}
	
	@Test
	void testVolumen2() {
		int volumenEsperado = 24;
		int volumenObtenida = c2.superficie();
		assertEquals(volumenEsperado,volumenObtenida);
	}
	
	@Test
	void testCuboExcepcion() {
		Exception excepcion = assertThrows(IllegalArgumentException.class, () -> new Cubo(0));
		//Exception excepcion2 = assertThrows(IllegalArgumentException.class, () -> r1.area());
		String mensajeEsperado = "El lado debe ser superior a 0";
		String mensajeObtenido = excepcion.getMessage();
		assertEquals(mensajeEsperado, mensajeObtenido);
	}

}
