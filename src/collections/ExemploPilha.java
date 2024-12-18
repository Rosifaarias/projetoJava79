package collections;

import java.util.Stack;

public class ExemploPilha {

	public static void main(String[] args) {

		Stack<String> pilha = new Stack<String>();

		pilha.push("Prato Verde");
		pilha.push("Prato Azul");
		pilha.push("Prato Branco");
		pilha.push("Prato Amarelo");
		pilha.push("Prato Vermelho");

		System.out.println("\nElementos da Pilha: " + pilha);

		System.out.println("\nRetirar elemento: " + pilha.pop());

		System.out.println("\nElementos da Pilha: " + pilha);

		System.out.println("\nRetirar elemento: " + pilha.pop());

		System.out.println("\nElementos da Pilha: " + pilha);

		System.out.println("\nElemento no topo da Pilha: " + pilha.peek());

		System.out.println("\nAdicionar Elemento Prato Roxo: " + pilha.push("Prato Roxo"));

		System.out.println("\nExibir a Pilha Atualizada: " + pilha);

		System.out.println("\nTamanho da Pilha: " + pilha.size());

	}

}
