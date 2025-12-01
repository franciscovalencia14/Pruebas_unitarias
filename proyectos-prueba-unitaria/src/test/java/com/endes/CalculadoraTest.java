package com.endes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("Prueba de suma")
	void testSuma() {
			int resultadoEsperado = 9;
			int resultado = Calculadora.sumar(6,3);
			
			assertEquals(resultadoEsperado, resultado);
	}
	@Test
	@DisplayName("Prueba unitaria de la resta")
	void testResta() {
			int resultadoEsperado = 3;
			int resultado = Calculadora.restar(6,3);

			assertEquals(resultadoEsperado, resultado);
	}
	@Test
	@DisplayName("Prueba unitaria de la multiplica")
	void testMultiplica() {
			int resultadoEsperado = 18;
			int resultado = Calculadora.multiplicar(6,3);

			assertEquals(resultadoEsperado, resultado);
	}
	@Test
	@DisplayName("Prueba unitaria de la divide")
	void testDivide() {
			int resultadoEsperado = 2;
			int resultado = Calculadora.dividir(6,3);

			assertEquals(resultadoEsperado, resultado);
	}

}
