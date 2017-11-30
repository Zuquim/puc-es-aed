
public class Application {

	private static Sorting s = new Sorting();
	private static int[] array = {16, 5, 10, 2, 59, 23, 90, 4, 9, 82, 49, 24, 1, 42, 15, 91, 3};
	
	public static void main(String[] args) {
		
		for(int i = 0; i <= array.length; i++)
			System.out.print(array[i] + ", ");
		
		int[] sorted = s.bubbleSort(array);
		
		for(int i = 0; i <= array.length; i++)
			System.out.print(sorted[i] + ", ");

	}

}
