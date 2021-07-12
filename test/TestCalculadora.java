import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.projetocalculadora.Calculadora;

public class TestCalculadora {
	
	double num1 = 25;
	double num2 = 5;
	
	private Calculadora calc;
	
	@BeforeEach
	void iniciarCalculadora() {
		calc = new Calculadora();
	}
	
	@Test
	void testeSomar() {
		double resultadoEsperado = num1 + num2;
		assertEquals(resultadoEsperado, calc.somar(num1, num2));
	}
	
	@Test
	void testeSubtrair() {
		double resultadoEsperado = num1 - num2;
		assertEquals(resultadoEsperado, calc.subtrair(num1, num2));
	}
	
	@Test
	void testeMultiplicar() {
		double resultadoEsperado = num1 * num2;
		assertEquals(resultadoEsperado, calc.multiplicar(num1, num2));
	}
	
	@Test
	void testeDividir() {
		double resultadoEsperado = num1 / num2;
		assertEquals(resultadoEsperado, calc.dividir(num1, num2));
	}
	
	@Test
	void testeRaizQuadrada() {
		double resultadoEsperado = Math.sqrt(num1);
		assertEquals(resultadoEsperado, calc.raizQuadrada(num1));
	}
	
	@Test
	void testePotencia() {
		double resultadoEsperado = Math.pow(num1, num2);
		assertEquals(resultadoEsperado, calc.potencia(num1, num2));
	}
}
