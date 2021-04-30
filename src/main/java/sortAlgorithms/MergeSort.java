package sortAlgorithms;

import java.sql.Array;
import java.util.Arrays;

public class MergeSort {

    private static int[] tempArray;

    public static void sort(int[] arrayToSort) {
        int n = arrayToSort.length - 1;
        tempArray = new int[arrayToSort.length];
        mergeSort(arrayToSort, 0, n);
    }

    private static void mergeSort(int[] array, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            int middleIndex = (leftIndex + rightIndex) / 2;
            mergeSort(array, leftIndex, middleIndex);
            mergeSort(array, middleIndex + 1, rightIndex);
            merge(array, leftIndex, middleIndex, rightIndex);
        }
    }

    private static void merge(int[] array, int leftIndex, int middleIndex, int rightIndex) {
        tempArray = Arrays.copyOf(array, array.length);

        int pointer1 = leftIndex;
        int pointer2 = middleIndex + 1;
        int current = leftIndex;

        while (pointer1 <= middleIndex && pointer2 <= rightIndex) {
            if (tempArray[pointer1] < tempArray[pointer2]) {
                array[current] = tempArray[pointer1];
                pointer1++;
            }
            else{
                array[current] = tempArray[pointer2];
                pointer2++;
            }
            current++;
        }
        while (pointer1 <= middleIndex){
            array[current] = tempArray[pointer1];
            pointer1++;
        }
    }
}
