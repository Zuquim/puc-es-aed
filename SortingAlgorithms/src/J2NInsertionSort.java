// Based on http://www.java2novice.com/java-sorting-algorithms/insertion-sort/

public class J2NInsertionSort {

//    public static void main(String a[]){
//        int[] arr1 = {10,34,2,56,7,67,88,42};
//        int[] arr2 = doInsertionSort(arr1);
//        for(int i:arr2){
//            System.out.print(i);
//            System.out.print(", ");
//        }
//    }

    private static void printArray(int[] array) {
        for (int item : array) System.out.print(item + ", ");
        System.out.print("\n");
    }

    public static int[] doInsertionSort(int[] input){
        int temp;
        for (int i = 1; i < input.length; i++) {
            printArray(input);
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        printArray(input);
        return input;
    }
}
