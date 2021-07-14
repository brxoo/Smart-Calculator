import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.projetocalculadora.Calculadora;

public class TesteCalculadora {
	
	double num1 = 25;
	double num2 = 5;
	double resultadoEsperado;
	
	private Calculadora calc;
	
	@BeforeEach
	void iniciarCalculadora() {
		calc = new Calculadora();
	}
	
	@Test
	void testeSomar() {
		resultadoEsperado = num1 + num2;
		assertEquals(resultadoEsperado, calc.somar(num1, num2));
	}
	
	@Test
	void testeSubtrair() {
		resultadoEsperado = num1 - num2;
		assertEquals(resultadoEsperado, calc.subtrair(num1, num2));
	}
	
	@Test
	void testeMultiplicar() {
		resultadoEsperado = num1 * num2;
		assertEquals(resultadoEsperado, calc.multiplicar(num1, num2));
	}
	
	@Test
	void testeDividir() {
		resultadoEsperado = num1 / num2;
		assertEquals(resultadoEsperado, calc.dividir(num1, num2));
	}
	
	@Test
	void testeDividirPorZero1() {
		assertThrows(ArithmeticException.class, () -> calc.dividir(0, num2));
	}
	
	@Test
	void testeDividirPorZero2() {
		assertThrows(ArithmeticException.class, () -> calc.dividir(num1, 0));
	}
	
	@Test
	void testeRaizQuadrada() {
		resultadoEsperado = Math.sqrt(num1);
		assertEquals(resultadoEsperado, calc.raizQuadrada(num1));
	}
	
	@Test
	void testePotencia() {
		resultadoEsperado = Math.pow(num1, num2);
		assertEquals(resultadoEsperado, calc.potencia(num1, num2));
	}
}
