package sortAlgorithms.AlgorithmUtils;

public class SortUtils {

    public static void swap(int[] array, int index1, int index2){
        int temp = array[index2];
        array[index2] = array[index1];
        array[index1] = temp;
    }

    public static void printTable(int[] array){
        for (int i : array) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
    }
}
