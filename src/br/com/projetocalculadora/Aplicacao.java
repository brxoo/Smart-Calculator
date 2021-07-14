package br.com.projetocalculadora;

import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Menu.exibirMenu();
		
		System.out.print("Escolha a operação que deseja realizar: ");
		int operacaoEscolhida = input.nextInt();
		
		Operacao.resultado(operacaoEscolhida);
		
		input.close();
	}
}