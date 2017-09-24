
public class Q04 {
	
	private static int[] array = {
			-9, -4, 0, 1, 2, 3, 4, -1, -6, 9, 0, 1, -1, 22
			};
	
	private static void findZeros(int[] list, int i) {
		if(i < list.length) {
			if(list[i] == 0)
				System.out.print("\nZero (0) identified at position #" + i);
			findZeros(list, i + 1);
		} else return;
	}
	
	public static void main(String[] args) {
		System.out.println("Looking for zeros in array:");
		findZeros(array, 0);
	}
}
