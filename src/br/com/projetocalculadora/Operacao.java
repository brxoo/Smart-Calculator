package br.com.projetocalculadora;

import java.util.Scanner;

public class Operacao {

	static double num1;
	static double num2;
	
	static Scanner input = new Scanner(System.in);
	
	private Operacao() {}
	
	public static void resultado(int operacaoEscolhida) {

			Calculadora calc = new Calculadora();
			
			switch (operacaoEscolhida) {
			case 1:
				System.out.println("\nVocê escolheu a operação adição.");
				System.out.print("Digite o primeiro número: ");
				num1 = input.nextDouble();
				System.out.print("Digite o segundo número: ");
				num2 = input.nextDouble();
				
				System.out.printf("\nResultado da operação: %.2f", calc.somar(num1, num2));
				break;
			case 2:
				System.out.println("\nVocê escolheu a operação subtração.");
				System.out.print("Digite o primeiro número: ");
				num1 = input.nextDouble();
				System.out.print("Digite o segundo número: ");
				num2 = input.nextDouble();
				
				System.out.printf("\nResultado da operação: %.2f", calc.subtrair(num1, num2));
				break;
			case 3:
				System.out.println("\nVocê escolheu a operação multiplicação.");
				System.out.print("Digite o primeiro número: ");
				num1 = input.nextDouble();
				System.out.print("Digite o segundo número: ");
				num2 = input.nextDouble();
				
				System.out.printf("\nResultado da operação: %.2f", calc.multiplicar(num1, num2));
				break;
			case 4:
				System.out.println("\nVocê escolheu a operação divisão.");
				System.out.print("Digite o primeiro número: ");
				num1 = input.nextDouble();
				System.out.print("Digite o segundo número: ");
				num2 = input.nextDouble();
				
				System.out.printf("\nResultado da operação: %.2f", calc.dividir(num1, num2));
				break;
			case 5:
				System.out.println("\nVocê escolheu a operação raiz quadrada.");
				System.out.print("Digite o número: ");
				num1 = input.nextDouble();
				
				System.out.printf("\nResultado da operação: %.2f", calc.raizQuadrada(num1));
				break;
			case 6:
				System.out.println("\nVocê escolheu a operação potenciação.");
				System.out.print("Digite o primeiro número: ");
				num1 = input.nextDouble();
				System.out.print("Digite o segundo número: ");
				num2 = input.nextDouble();
				
				System.out.printf("\nResultado da operação: %.2f", calc.potencia(num1, num2));
				break;
			default:
				System.err.println("Erro. Por favor escolha uma operação válida.");
				System.out.print("Escolha a operação que deseja realizar: ");
				int novaOperacaoEscolhida = input.nextInt();
				resultado(novaOperacaoEscolhida);
			}
		}
}
