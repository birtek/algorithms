package sortAlgorithms;

import sortAlgorithms.AlgorithmUtils.SortUtils;

public class SelectSort {

    public static void sort(int[] arrayToSort) {
        selectSort2(arrayToSort);
    }

    private static void selectSort(int[] arrayToSort) {
        int n = arrayToSort.length - 1;
        int it = 0;
        int minValueIndex = 0;

        while (it <n) {
            int minValueStart = arrayToSort[it];
            for (int i = it + 1; i <= n; i++) {
                if (minValueStart > arrayToSort[i]) {
                    minValueStart = arrayToSort[i];
                    minValueIndex = i;
                }
            }
            if(minValueIndex != it){
                SortUtils.swap(arrayToSort, it, minValueIndex);
            }
            it++;
        }
    }

    private static void selectSort2(int[] arrayToSort){
        int n = arrayToSort.length - 1;
        int minIndex;

        for (int i = 0;i < n; i++){
            minIndex = i;
            for (int j = i + 1;j <= n;j++){
                if(arrayToSort[j]<arrayToSort[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                SortUtils.swap(arrayToSort,i,minIndex);
            }
        }
    }
}
