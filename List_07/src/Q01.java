public class Q01 {

	private static int[] array = {
			-9, -4, 0, 1, 2, 3, 4, -1, -6, 9, 0, 1, -1, 22
			}; 
	
	private static void replace(int[] array, int i, int j) {
		if(j < array.length ) {
			if(array[i] < -1) {
				array[i] = -1;
				replace(array, i - 1, j + 1);
			} else if(array[i] > 1) {
				array[i] = 1;
				replace(array, i - 1, j + 1);
			}
			else replace(array, i - 1, j + 1);
		} else return;
		System.out.print(array[i] + " ");
	}
	
	private static void original(int[] array) {
		for(int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
	}
	
	public static void main(String[] args) {
		System.out.print("\nOriginal array: ");
		original(array);
		System.out.print("\nModified array: ");
		replace(array, array.length - 1, 0);
	}

}
