package sortAlgorithms;

import sortAlgorithms.AlgorithmUtils.SortUtils;

public class SelectSort {

    public static void sort(int[] arrayToSort) {
        selectSort(arrayToSort);
    }

    private static void selectSort(int[] arrayToSort) {
        int n = arrayToSort.length - 1;
        int it = 0;
        int minIndex = 0;

        while (it < n) {
            int min = arrayToSort[it];
            for (int i = it; i <= n; i++) {
                if (min > arrayToSort[i]) {
                    min = arrayToSort[i];
                    minIndex = i;
                }
            }
            if(minIndex != it){
                SortUtils.swap(arrayToSort, it, minIndex);
            }
            it++;
        }
    }
}
