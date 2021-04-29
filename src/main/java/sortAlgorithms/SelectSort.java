package sortAlgorithms;

import sortAlgorithms.AlgorithmUtils.SortUtils;

public class SelectSort {

    public static void sort(int[] arrayToSort) {
        selectSort(arrayToSort);
    }

    private static void selectSort(int[] arrayToSort) {
        int n = arrayToSort.length - 1;
        int it = 0;
        int minValueIndex = 0;

        while (it <=n) {
            int min = arrayToSort[it];
            for (int i = it + 1; i < n; i++) {
                if (min > arrayToSort[i]) {
                    min = arrayToSort[i];
                    minValueIndex = i;
                }
            }
            if(minValueIndex != it){
                SortUtils.swap(arrayToSort, it, minValueIndex);
            }
            it++;
        }
    }
}
