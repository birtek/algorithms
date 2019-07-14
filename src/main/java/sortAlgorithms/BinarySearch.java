package sortAlgorithms;

import java.util.Arrays;

public class BinarySearch{
    public static boolean binarySearch(int[] array, int number){

        int indexLow=0;
        int indexHight = array.length-1;

        while (indexLow <= indexHight){
            int indexMiddle = indexLow + (indexHight - indexLow) / 2;

            if(number < array[indexMiddle]){
                indexHight = indexMiddle -1;
            }
            else if(number > array[indexMiddle]){
                indexLow = indexMiddle + 1;
            }
            else {
                return true;
            }
        }

        return false;

    }
}
