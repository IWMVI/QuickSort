package QuickSort;

import br.edu.fateczl.QuickSort.QuickSort;

/*	Utilizando as bibliotecas geradas, faça um projeto Java que apresente a ordenação do vetor
	(69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1). */

public class Exerc05 {
	public static void main(String[] args) {
		int[] vet = { 69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1 };

		System.out.println("Vetor Desordenado");
		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet[i] + " ");
		}

		QuickSort.quicksort(vet);

		System.out.println("\nVetor Ordenado");
		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet[i] + " ");
		}
	}
}
