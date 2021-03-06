import sortAlgorithms.*;
import sortAlgorithms.AlgorithmUtils.ArrayGenerator;


import java.util.Arrays;


public class Run {
    public static void main(String[] args) {
        long start;
        long end;

        ArrayGenerator arrayGenerator = new ArrayGenerator();
        int[] primeArray = arrayGenerator.arrayGenerator(100000);
        System.out.println("Unsorted array");
        System.out.println(Arrays.toString(primeArray));


        int[] array = Arrays.copyOf(primeArray, primeArray.length);
        FirstImplementationQuickSort quicksort = new FirstImplementationQuickSort();
        System.out.println("Quicksort:");
        start = System.currentTimeMillis();
        quicksort.sort(array);
        end = System.currentTimeMillis() - start;

        // System.out.println(Arrays.toString(array));
        System.out.println("Time required to sort array by QuickSort with pivot in middle: " + end + "ms");


        int[] array2 = Arrays.copyOf(primeArray, primeArray.length);
        System.out.println("Quicksort:");
        start = System.currentTimeMillis();
      //  QuickSortWithBorder.sort(array);
        end = System.currentTimeMillis() - start;

        //  System.out.println(Arrays.toString(array2));
        System.out.println("Time required to sort array by QuickSort with pivot at the end: " + end + "ms");

        int[] array3 = Arrays.copyOf(primeArray, primeArray.length);
        System.out.println("Heap Sort");
        start = System.currentTimeMillis();
        HeapSort.sort(array3);
        end = System.currentTimeMillis() - start;

        //  System.out.println(Arrays.toString(array3));
        System.out.println("Time required to sort array by HeapSort : " + end + "ms");

        int[] array4 = Arrays.copyOf(primeArray, primeArray.length);
        System.out.println("BubbleSort");
        start = System.currentTimeMillis();
        BubbleSort.sort(array4);
        end = System.currentTimeMillis() - start;
        System.out.println(Arrays.toString(array4));
        System.out.println("Time required to sort array by BubbleSort: " + end + "ms");

        int[] array5 = Arrays.copyOf(primeArray, primeArray.length);
        System.out.println("SelectSort");
        start = System.currentTimeMillis();
        SelectSort.sort(array5);
        end = System.currentTimeMillis() - start;
        System.out.println(Arrays.toString(array5));
        System.out.println("Time required to sort array by SelectSort: " + end + "ms");

        int[] array6 = Arrays.copyOf(primeArray, primeArray.length);
        System.out.println("InsertSort");
        start = System.currentTimeMillis();
        InsertionSort.sort(array6);
        end = System.currentTimeMillis() - start;
        System.out.println(Arrays.toString(array6));
        System.out.println("Time required to sort array by InsertionSort: " + end + "ms");

        int[] array7 = Arrays.copyOf(primeArray, primeArray.length);
        System.out.println("MergeSort");
        start = System.currentTimeMillis();
        MergeSort.sort(array7);
        end = System.currentTimeMillis() - start;
        System.out.println(Arrays.toString(array7));
        System.out.println("Time required to sort array by MergeSort: " + end + "ms");
    }
}

