public class SortingApplication {

    private static final int[] simpleArray = {5, 6, 4, 7, 3, 2, 8, 1, 9, 0};
    private static int[] array;

    public static void main(String[] args) {
//        array = simpleArray;
//        MySelectionSort.sortIt(array);
        array = simpleArray;
//        J2NJ2NSelectionSort.doSelectionSort(array);
//        aSort(array);
        J2NInsertionSort.doInsertionSort(array);
    }

    private static void printArray(int[] array) {
        for (int item : array) System.out.print(item + ", ");
        System.out.print("\n");
    }

//    private static void aSort(int[] a) {
//        int in, out;
//        for(out = a.length - 1; out > 1; out--) {
//            printArray(a);
//            for (in = 0; in < out; in++)
//                if (a[in] > a[in + 1])
//                    swap(a, in, in + 1);
//        }
//        printArray(a);
//    }
//    private static void swap(int[] a, int x, int y) {
//        int temp = a[x];
//        a[x] = a[y];
//        a[y] = temp;
//    }
}
