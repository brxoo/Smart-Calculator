package br.com.projetocalculadora;

import java.util.Scanner;

public class Calculadora {

	private double num1;
	private double num2;
	
	Scanner input = new Scanner(System.in);
	
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
	
	public void operacao(int operacaoEscolhida) {
		switch (operacaoEscolhida) {
		case 1:
			System.out.println("\nVocê escolheu a operação adição.");
			System.out.print("Digite o primeiro número: ");
			num1 = input.nextDouble();
			System.out.print("Digite o segundo número: ");
			num2 = input.nextDouble();
			
			System.out.printf("\nResultado da operação: %.2f", somar(num1, num2));
			break;
		case 2:
			System.out.println("\nVocê escolheu a operação subtração.");
			System.out.print("Digite o primeiro número: ");
			num1 = input.nextDouble();
			System.out.print("Digite o segundo número: ");
			num2 = input.nextDouble();
			
			System.out.printf("\nResultado da operação: %.2f", subtrair(num1, num2));
			break;
		case 3:
			System.out.println("\nVocê escolheu a operação multiplicação.");
			System.out.print("Digite o primeiro número: ");
			num1 = input.nextDouble();
			System.out.print("Digite o segundo número: ");
			num2 = input.nextDouble();
			
			System.out.printf("\nResultado da operação: %.2f", multiplicar(num1, num2));
			break;
		case 4:
			System.out.println("\nVocê escolheu a operação divisão.");
			System.out.print("Digite o primeiro número: ");
			num1 = input.nextDouble();
			System.out.print("Digite o segundo número: ");
			num2 = input.nextDouble();
			
			System.out.printf("\nResultado da operação: %.2f", dividir(num1, num2));
			break;
		case 5:
			System.out.println("\nVocê escolheu a operação raiz quadrada.");
			System.out.print("Digite o número: ");
			num1 = input.nextDouble();
			
			System.out.printf("\nResultado da operação: %.2f", raizQuadrada(num1));
			break;
		case 6:
			System.out.println("\nVocê escolheu a operação potenciação.");
			System.out.print("Digite o primeiro número: ");
			num1 = input.nextDouble();
			System.out.print("Digite o segundo número: ");
			num2 = input.nextDouble();
			
			System.out.printf("\nResultado da operação: %.2f", potencia(num1, num2));
			break;
		default:
			System.err.println("Erro. Por favor escolha uma operação válida.");
			System.out.print("Escolha a operação que deseja realizar: ");
			int novaOperacaoEscolhida = input.nextInt();
			operacao(novaOperacaoEscolhida);
		}
	}
}
