public class MySelectionSort {

    private static int s;

    public static void sortIt(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            printArray(array);
            s = i;
            for(int j = i; j < array.length - 1; j++)
                if(array[s] > array[j + 1])
                    s = j + 1;
            swap(array, i, s);
        }
        printArray(array);
    }

    private static void printArray(int[] array) {
        for (int item : array) System.out.print(item + ", ");
        System.out.print("\n");
    }

    private static void swap(int[] a, int i, int j) {
        int aux = a[i];
        a[i] = a[j];
        a[j] = aux;
    }
}
