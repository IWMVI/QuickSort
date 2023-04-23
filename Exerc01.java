package QuickSort;

import br.edu.fateczl.QuickSort.QuickSort;

/*	Considerando o vetor (89, 54, 18, 71, 93, 45, 19, 14, 99, 2, 27, 3, 58, 91, 75). Simule o
	comportamento da ordenação QuickSort. */

public class Exerc01 {
	public static void main(String[] args) {

		int[] vetor = { 89, 54, 18, 71, 93, 45, 19, 14, 99, 2, 27, 3, 58, 91, 75 };

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