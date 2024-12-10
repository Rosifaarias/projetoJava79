package collections;

import java.util.Scanner;

public class Teste30 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in); // Cria um objeto Scanner

		// Exibe o menu para o usuário
		System.out.println("Menu de opções:");
		System.out.println("1 - Opção 1");
		System.out.println("2 - Opção 2");
		System.out.println("3 - Opção 3");
		System.out.print("Escolha uma opção: ");

		int opcao = leia.nextInt(); // Lê a opção escolhida pelo usuário

		// Estrutura switch-case para tratar as opções
		switch (opcao) {
		case 1:
			System.out.println("Opção 1 selecionada: Você escolheu a primeira opção!");
			break; // Encerra o caso e impede que continue para o próximo
		case 2:
			System.out.println("Opção 2 selecionada: Você escolheu a segunda opção!");
			break;
		case 3:
			System.out.println("Opção 3 selecionada: Você escolheu a terceira opção!");
			break;
		default:
			System.out.println("Opção inválida: Por favor, escolha um número entre 1 e 3.");
		}

		// Mensagem final
		System.out.println("Programa finalizado. Obrigado por participar!");
	

	}
}
