package sortAlgorithms.AlgorithmUtils;

import java.util.Random;

public class ArrayGenerator {
    public int[] arrayGenerator(int x) {
        int array[] = new int[x];
        Random random = new Random(7);
        for (int i = 0; i < x; i++) {
            array[i] = random.nextInt(400)-200;
        }
        return array;
    }

    private int getAnInt(int min, int max) {
        return (int)(Math.random() * ((max - min) + 1)) + min;
    }
}
