package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class praticaFila {

	public static void main(String[] args) {

		// Scanner para ler o nome
		Scanner leia = new Scanner(System.in);

		// funcao fila
		Queue<String> fila = new LinkedList<String>();

		// variaveis

		int opcao = -1;
		String nome;

		do {
			System.out.println("\n||||||||Menu de opções||||||||||||||||||");
			System.out.println("1 - Adicionar Cliente na Fila");
			System.out.println("2 - Listar todos os Clientes");
			System.out.println("3 - Retirar Cliente da Fila ");
			System.out.println("0 - Sair ");
			
			
			opcao = leia.nextInt();

			// Estrutura switch-case para tratar as opções

			switch (opcao) {

			case 1:
				System.out.println("\n Digite o nome: ");
				nome = leia.next();
				fila.add(nome);
				
				  for (String Cliente : fila) {
                      System.out.println(nome);  // Exibe a fila atual
                  }
				
				System.out.println("\n Cliente Adicionado!");

				break;

			case 2:

				  System.out.println("\nTotal de clientes na fila: " + fila.size());
				  Iterator<String> iterator = fila.iterator();
					
					while(iterator.hasNext()){
					   System.out.println(iterator.next());
					}

				break;

			case 3:

				System.out.println("\n  Retira o cliente da Fila  " + fila.poll());

				break;

			default:
				System.out.println("Opção inválida. Tente novamente.");

			}

		} while (opcao != 0);
	}

}
