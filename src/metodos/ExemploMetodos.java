package metodos;

public class ExemploMetodos {

	public static void main(String[] args) {

		int resultado = somar(2, 5);

		System.out.println(" O primeiro resultado é " + resultado);
		System.out.println(" O primeiro resultado é " + somar(8, 3));
		
		falar(" Oi, bom dia ");
		falar(" O gato Amarelo");
	
		
			ExemploMetodoExterno.mensagem();
		
		
		

	}

	// MEOTODo COM RETORNO E COM PARAMETRO
	public static int somar(int x, int y) {
		return x + y; // 2 + 5

	}
	// METODO SEM RETORNO MAS TEM PARAMETRO
	public static void falar(String mensagem) {
		System.out.println(mensagem);

	}

}
