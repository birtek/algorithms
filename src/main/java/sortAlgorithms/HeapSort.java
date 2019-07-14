package sortAlgorithms;

import sortAlgorithms.AlgorithmUtils.SortUtils;

public class HeapSort {

    public static void sort(int[] arrayToSort) {
        int length = arrayToSort.length;

        for (int i = length / 2 - 1; i >= 0; i--) {
            HeapSort.validateMaxHeap(arrayToSort, length, i);
        }

        for (int i = length -1; i > 0; i--){
            SortUtils.swap(arrayToSort,0,i);
            length--;
            HeapSort.validateMaxHeap(arrayToSort,length,0);
        }
    }

    private static void validateMaxHeap(int[] array, int heapSize, int parentIndex) {
        int maxIndex = parentIndex;
        int leftChild = parentIndex * 2 + 1;
        int rightChild = parentIndex * 2 + 2;

        if(leftChild < heapSize && array[leftChild] > array[maxIndex]){
            maxIndex = leftChild;
        }
        if(rightChild < heapSize && array[rightChild] > array[maxIndex]){
            maxIndex = rightChild;
        }
        if(maxIndex != parentIndex){
            SortUtils.swap(array, maxIndex, parentIndex);
            validateMaxHeap(array,heapSize, maxIndex);
        }
    }
}
