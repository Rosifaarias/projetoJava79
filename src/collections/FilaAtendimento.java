package collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FilaAtendimento {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Queue<String> Atendimento = new LinkedList<String>();

		// adicionando 4 pessoas á fila usando add()
		Atendimento.add(" Rosi");
		Atendimento.add(" Camila");
		Atendimento.add(" Karina");
		Atendimento.add(" Bruna");

		// exibindo a fila antes do atendimento

		System.out.println(" Filda de atendimento inicial " + Atendimento);

		// Atendendo (removendo) as pessoas da fila
		while (!Atendimento.isEmpty()) {
			// Removendo a pessoa da frente da fila e exibindo quem está sendo atendido
			String atendido = Atendimento.poll();
			System.out.println(atendido + " está sendo atendido.");
			System.out.println("Fila após o atendimento: " + Atendimento);
		}

		// Caso a fila esteja vazia após os atendimentos
		if (Atendimento.isEmpty()) {
			System.out.println("Não há mais pessoas na fila de atendimento.");
		}
	}

}
