package br.com.projetocalculadora;

public class Menu {
	
	private Menu() {}
	
	public static void exibirMenu() {
		System.out.println("-------CALCULADORA-------");
		System.out.println("[1] Adição \n[2] Subtração "
				+ "\n[3] Multiplicação \n[4] Divisão"
				+ "\n[5] Raiz Quadrada \n[6] Potenciação");
	}
}
