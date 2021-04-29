package sortAlgorithms;

import sortAlgorithms.AlgorithmUtils.SortUtils;

public class BubbleSort {

    public static void sort(int arrayToSort[]) {

        bubbleSort(arrayToSort);
    }

    private static void bubbleSort(int[] arrayToSort) {
        boolean isSwapDoes;

        int n = arrayToSort.length - 1;  //numbers of iteration
        for (int i = 0; i < n; i++) {
            isSwapDoes = false;
            for (int j = 0; j < n; j++) {
                if (arrayToSort[j] > arrayToSort[j + 1]) {
                    SortUtils.swap(arrayToSort, j, j + 1);
                    isSwapDoes = true;
                }
            }
            n--;
            if (!isSwapDoes){
                return;
            }
        }
    }
}
