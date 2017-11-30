// I got it from http://www.java2novice.com/java-sorting-algorithms/bubble-sort/

public class J2NBubbleSort {

    // logic to sort the elements
    public static void doBubbleSort(int array[]) {
        int n = array.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                    swapNumbers(i, k, array);
                }
            }
            printNumbers(array);
        }
    }

    private static void swapNumbers(int i, int j, int[] array) {
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void printNumbers(int[] input) {
        for (int item : input) System.out.print(item + ", ");
        System.out.println("\n");
    }

//    public static void main(String[] args) {
//        int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
//        doBubbleSort(input);
//    }
}
