package view;

import br.com.serialexperimentscarina.quicksort.QuickSort;

public class Principal {

	public static void main(String[] args) {
		int[] vetor = {69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1};
		
		System.out.print("Vetor: ");
		for(int valor : vetor) {
			System.out.print(valor + " ");
		}
		
		QuickSort quickSort = new QuickSort();
		quickSort.ordenar(vetor, 0, (vetor.length - 1));
		
		System.out.print("\nVetor após ordenação: ");
		for(int valor : vetor) {
			System.out.print(valor + " ");
		}
	}

}
