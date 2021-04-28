package sortAlgorithms;

import sortAlgorithms.AlgorithmUtils.SortUtils;

public class QuickSortWithBorder {

    public static void sort(int[] array) {
        if (array == null || array.length == 0)
            return;

        int firstIndex = 0;
        int lastIndex = array.length - 1;

        quickSort(array, firstIndex, lastIndex);
    }

    private static void quickSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }

        int border = partitionArray(array, left, right);
        if(border - left < right - border ){
        quickSort(array,left,border - 1);
        quickSort(array, border + 1, right);}
        else{
            quickSort(array,border + 1, right);
            quickSort(array,left,border - 1);
        }
    }

    private static int partitionArray(int[] array, int left, int right) {
        int pivot = getPivot(array, left, right);
        int border = left - 1;
        int i = left;
        while (i < right) {
            if (array[i] < pivot) {
                border++;
                if (border != i) {
                    SortUtils.swap(array, border, i);
                }
            }
            i++;
        }
        border++;
        if(border != right){
            SortUtils.swap(array,border, right);
        }
        return border;
    }

    private static int getPivot(int[] array, int left, int right) {
        int mid = left + (right - left)/2;
        int pivot = array[mid];
        SortUtils.swap(array,mid,right);
        return pivot;
    }
}
