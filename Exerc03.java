package QuickSort;

import br.edu.fateczl.QuickSort.QuickSort;

/*	Considerando o vetor (99, 98, 97, 96, 95, 94, 93, 92, 91). Simule o comportamento da
	ordenação QuickSort. */

public class Exerc03 {
	
	public static void main(String[] args) {

		int[] vet = { 99, 98, 97, 96, 95, 94, 93, 92, 91 };

		System.out.println("Vetor Desordenado");
		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet [i]  + " ");
		}
		
		QuickSort.quicksort(vet);
		
		System.out.println("\nVetor Ordenado");
		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet [i]  + " ");
		}
	}
}
