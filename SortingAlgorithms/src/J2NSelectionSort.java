// Based on http://www.java2novice.com/java-sorting-algorithms/selection-sort/

public class J2NSelectionSort {

    public static int[] doSelectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index])
                    index = j;
            }
            printArray(arr);
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        printArray(arr);
        return arr;
    }

    private static void printArray(int[] array) {
        for (int item : array) System.out.print(item + ", ");
        System.out.print("\n");
    }

//    public static void main(String a[]) {
//        int[] arr1 = {10, 34, 2, 56, 7, 67, 88, 42};
//        int[] arr2 = doSelectionSort(arr1);
//        for (int i : arr2) {
//            System.out.print(i);
//            System.out.print(", ");
//        }
//    }
}