package dataStructures.dataStructuresUtils;

public class ListUtils {
    public static void isRange(int index, int size){
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException();
        }
    }

}
