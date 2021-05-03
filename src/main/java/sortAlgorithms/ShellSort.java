package sortAlgorithms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Function;

public class ShellSort {
    public static void sort(int[] arrayToSort, Function<Integer, Integer[]> distanceGenerator) {
        int n = arrayToSort.length - 1;
        int it = 1;
        Integer[] distances = distanceGenerator.apply(n);
        int distance = distances[distances.length - 1];
        int current, otherIndex;
        while (distance >= 1) {
            for (int i = distance; i < n; i++) {
                current = arrayToSort[i];
                otherIndex = i;
                while (otherIndex >= distance && current < arrayToSort[otherIndex - distance]) {
                    arrayToSort[otherIndex] = arrayToSort[otherIndex - distance];
                    otherIndex -= distance;
                }
                arrayToSort[otherIndex] = current;
            }
            distance = distances[distances.length - ++it];
        }
    }

    public static Integer[] shellDistance(int numberofElements) {
        ArrayList<Integer> distances = new ArrayList<>();
        int iteration = 1;
        int generated;
        do {
            generated = numberofElements / (int) Math.pow(2, iteration);
            distances.add(generated);
            iteration++;
        } while (generated > 0);
        Collections.reverse(distances);
        return distances.toArray(new Integer[distances.size()]);
    }

    //4^k+3*2^(k-1) + 1
    public static Integer[] sedgewickDistance(int numberOfElements) {
        int generated = 0;
        ArrayList<Integer> distances = new ArrayList<>();
        int k = 0;
        while (generated < numberOfElements) {
            if (distances.isEmpty()) {
                distances.add(0);
                distances.add(1);
            } else {
                generated = (int) (Math.pow(4, k) + 3 * Math.pow(2, k - 1) + 1);
                if (generated < numberOfElements) {
                    distances.add(generated);
                }
            }
            k++;
        }
        return distances.toArray(new Integer[distances.size()]);
    }
}
