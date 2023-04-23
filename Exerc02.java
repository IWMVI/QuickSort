package QuickSort;

import br.edu.fateczl.QuickSort.QuickSort;

/*	Considerando o vetor (12, 13, 14, 15, 51, 53, 57, 25, 26, 27, 90). Simule o comportamento da
	ordenação QuickSort. */

public class Exerc02 {
	public static void main(String[] args) {
		int[] vetor = { 12, 13, 14, 15, 51, 53, 57, 25, 26, 27, 90 };

		System.out.println("Vetor Desordenado");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}

		QuickSort.quicksort(vetor);

		System.out.println("\nVetor Ordenado");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
	}
}
