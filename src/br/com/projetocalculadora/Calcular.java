package br.com.projetocalculadora;

import java.util.Scanner;

public class Calcular {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("-------CALCULADORA-------");
		System.out.println("[1] Adição \n[2] Subtração "
				+ "\n[3] Multiplicação \n[4] Divisão"
				+ "\n[5] Raiz Quadrada \n[6] Potenciação");
		
		System.out.print("Escolha a operação que deseja realizar: ");
		int operacaoEscolhida = input.nextInt();
		
		calc.operacao(operacaoEscolhida);
		
		input.close();
	}
}