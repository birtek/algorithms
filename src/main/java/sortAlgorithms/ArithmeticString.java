package sortAlgorithms;

public class ArithmeticString {

    public static int sum(int[] array) {

        int length = array.length;
        if (length == 0 || length == 1) {
            return 0;
        }

        return (array[0] + array[length - 1]) * length / 2;
    }
}
