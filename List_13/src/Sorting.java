
public class Sorting {
	
	private static int[] sorted;
	private static int aux;
	
	public int[] bubbleSort(int[] array) {
		for(int i = 0; i <= array.length; i++) {
			if(array[i+1] < array[i]) {
				bubbleRecursion(array, i);
			}
		}
		return sorted;
	}
	
	private int[] bubbleRecursion(int[] array, int j) {
		if((array[j] < array[j-1]) & (j-1 >= 0))
			bubbleRecursion(array, j-1);
		else if(j-1 >= 0) {
			aux = array[j+1];
			array[j+1] = array[j];
			array[j] = aux;
		} else
			return array;
		return array;
	}
}
