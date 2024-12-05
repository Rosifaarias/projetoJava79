package estrutura_repeticao;

import java.util.Scanner;

public class exemploDoWhile {

	public static void main(String[] args) {

		
		 int numero, resultado, contador = 3;
	        Scanner leia = new Scanner(System.in);

	        do { // BLOCO DE REPETIÇÃO
	            System.out.println("\nDigite um número inteiro: ");
	            numero = leia.nextInt();

	            resultado = numero * 5;

	            System.out.println("\nO resultado da multiplicação é: " + resultado);

	        } while (contador <= 5); // CONDICAO LIMITE PARA REPITIR
	    }
	}
	