package sortAlgorithms;

import sortAlgorithms.AlgorithmUtils.SortUtils;

public class BubbleSort {

    public static void sort(int arrayToSort[]) {

        bubbleSort(arrayToSort);
    }

    private static void bubbleSort(int[] arrayToSort) {
        boolean isSwapped = true;
        int it = 0;

        int n = arrayToSort.length - 1;  //numbers of iteration
        while (it < n && isSwapped) {
            isSwapped = false;
            for (int j = 0; j < n - it; j++) {
                if (arrayToSort[j] > arrayToSort[j + 1]) {
                    SortUtils.swap(arrayToSort, j, j + 1);
                    isSwapped = true;
                }
            }
            it++;
        }
    }
}
