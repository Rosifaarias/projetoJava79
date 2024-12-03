package introducao;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
	
		// Variaveis
		String nome;
		float temperatura;
		float fahrenheit;
		
		
		
		// construindi o leia
		
		Scanner leia = new Scanner(System.in);
		
		// Entrada de Dados perdir/Inserir o nome, temperatura
		
			System.out.println(" Insira o seu nome:  ");
			nome = leia.next();
			
			System.out.println(" Insira a temperatua em Celsius: ");
			temperatura = leia.nextFloat();
		
		
		
		// Processamento
			fahrenheit = temperatura * 1.8f + 32;
			
		
		
		
		
		// Saída dos Dados
			
			System.out.println(" Bom dia," + nome);
			System.out.println(" A TEMPERATURA EM FAHRENHIET É : " + fahrenheit);

	}

}
