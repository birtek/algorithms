package sortAlgorithms;

import sortAlgorithms.AlgorithmUtils.SortUtils;

public class InsertionSort {

    public static void sort(int[] arrayToSort) {

        insertionSort(arrayToSort);
    }

    private static void insertionSort(int[] array) {
        int n = array.length - 1;
        int minValue;
        int otherIndex;

        for (int i = 1; i < n; i++) {
            minValue = array[i];
            otherIndex = i;
            while (otherIndex > 0 && minValue < array[otherIndex-1]){
                array[otherIndex] = array[otherIndex - 1];
                otherIndex--;
            }
            array[otherIndex] = minValue;
        }
    }
}
