import sortAlgorithms.*;
import sortAlgorithms.AlgorithmUtils.SortUtils;

import java.util.Arrays;


public class Run {
    public static void main(String[] args) {
        int[] array=new int[]{5,5,6,2,8,12,5,66,2,41,31,4677,0,33,55,667,876,-22};

        //MyQuickSort quicksort = new MyQuickSort();
        System.out.println("Quicksort:");
        //quicksort.sort(array);
        SortUtils.printTable(array);


        int[] array2 = new int[]{};
        int arithmeticStringSum= ArithmeticString.sum(array2);

        System.out.println("Sum of Arithmetic String: ");
        System.out.println(arithmeticStringSum);

        int[] array3 = new int[]{};
        int number =2;

     //   quicksort.sort(array3);
        System.out.println("Is number " + number + " is in table?");
        System.out.println(BinarySearch.binarySearch(array3,number));

        int[] array4=new int[]{5,5,6,2,8,12,5,66,2,41,31,4677,0,33,55,667,876,-22, -1000};
//        HeapSort.sort(array4);
//        System.out.println("Heap Sort");
//        SortUtils.printTable(array4);
        QuickSortWithBorder.sort(array4);
        System.out.println("Quick sort with Border");
        System.out.println(Arrays.toString(array4));
    }
    }

