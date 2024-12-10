package collections;

import java.util.HashSet;
import java.util.Set;

public class ExercicioSet {

	public static void main(String[] args) {
	
		
		Set<String> setFrutas = new HashSet<String>();

		// Adiciona algumas frutas na Colection Set
		setFrutas.add("Abacate");
		setFrutas.add("Banana");
		setFrutas.add("Jaboticaba");
		setFrutas.add("Kiwi");
		setFrutas.add("Maçã");
		setFrutas.add("Morango");
		setFrutas.add("Pêra");
		setFrutas.add("Jaboticaba");
		setFrutas.add("Kiwi");

		/**
		 * Mostra os dados armazenados na Collection Set Observe que as frutas repetidas
		 * foram inseridos apenas uma vez
		 */
		System.out.println("\nDados da Collection: " + setFrutas);
		

	}

}
