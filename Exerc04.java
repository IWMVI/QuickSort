package QuickSort;

/*	Utilizando o algoritmo QuickSort, transforme-o em projeto Java e faça um teste com a
	ordenação do vetor (69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1). */

public class Exerc04 {
	public static void main(String[] args) {
		int[] vet = { 69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1 };

		System.out.println("Vetor Desordenado");
		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet[i] + " ");
		}

		quicksort (vet, 0, vet.length -1);
		
		System.out.println("\nVetor Ordenado");
		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet[i] + " ");
		}
	}

	static void quicksort(int[] vetor, int esquerda, int direita) {
		if (esquerda < direita) {
			int posicaoPivo = particao(vetor, esquerda, direita);
			quicksort(vetor, esquerda, posicaoPivo - 1);
			quicksort(vetor, posicaoPivo + 1, direita);
		}
	}

	static int particao(int[] vetor, int esquerda, int direita) {
		int meio = (int) (esquerda + direita) / 2;
		int pivo = vetor[meio];
		int i = esquerda;
		int j = direita;
		while (i < j) {
			while (vetor[i] < pivo) {
				i++;
			}
			while (vetor[j] > pivo) {
				j--;
			}
			if (i < j) {
				int aux = vetor[i];
				vetor[i] = vetor[j];
				vetor[j] = aux;
			}
		}
		return j;
	}
}
