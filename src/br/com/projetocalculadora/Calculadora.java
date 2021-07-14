package br.com.projetocalculadora;

public class Calculadora {
	
	public Calculadora() {}
	
	public double somar(double a, double b) {
		return a + b;
	}
	
	public double subtrair(double a, double b) {
		return a - b;
	}
	
	public double multiplicar(double a, double b) {
		return a * b;
	}
	
	public double dividir(double a, double b) {
		double resultado;
		if (a == 0 || b == 0) {
			throw new ArithmeticException("Não é possível dividir por zero");
		} else {
			resultado = a / b;
		}
		return resultado;
	}
	
	public double raizQuadrada(double a) {
		double resultado = Math.sqrt(a);
		return resultado;
	}
	
	public double potencia(double a, double b) {
		double resultado = Math.pow(a, b);
		return resultado;
	}
	
}
