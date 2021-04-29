package sortAlgorithms;

//none recursive example https://javarevisited.blogspot.com/2016/09/iterative-quicksort-example-in-java-without-recursion.html
public class FirstImplementationQuickSort {

    private int array[];

    //private int length;

    public void sort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }

        this.array = array;
        int length = array.length - 1;
        quicksort(0, length);

    }

    private void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private void quicksort(int left, int right) {
        int i = left;
        int j = right;
        int pivot = array[(left + right) / 2]; // you can also use as a pivot first element of array(@parm left)
                                               // or last element of array(@prma right)
        while (i <=j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <=j) {
                swap(i, j);
                i++;
                j--;
            }
        }
        if (left < j) {
            quicksort(left, j);
        }
        if (i < right) {
            quicksort(i, right);
        }
    }
}
