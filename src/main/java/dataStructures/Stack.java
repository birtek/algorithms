package dataStructures;

public class Stack {
    int[] array;
    int peak;

    public Stack(int maxSize){
        array = new int[maxSize];
        peak = 0;
    }

   public boolean isEmpty(){
        if(peak == 0){
            return true;
        }else {
            return false;
        }
    }

   public int size(){
        return peak;
    }

    public void push(int newElement){
        if(peak < array.length){
            array[peak] = newElement;
            peak++;
        }else {
            throw new ArrayIndexOutOfBoundsException("Stack over flos :)");
        }
    }

    public int pop(){
        if(peak <= 0){
            throw new IndexOutOfBoundsException("Empty stack");
        }
        int temp = array[peak -1];
        peak--;
        return temp;
    }

    public void display(){
        if(peak == 0 ){
            throw new IndexOutOfBoundsException("Empty stack");
        }

        int temp = peak - 1;
        while (temp >= -1){
            System.out.println(array[temp]);
            temp--;
        }
    }

    public void multiPop(int elements){
        if(elements < peak){
            for (int i = 0; i < elements ; i++) {
                System.out.println(pop());
            }
        }
    }

    public void clear(){
        for (int i = 0; i < peak ; i++) {
            array[i] = 0;
        }

        peak = 0;
    }

    public void reverse(){
        for (int i = 0; i < peak; i++) {
            int temp = array[i];
            array[i] = array[peak - 1 - i];
            array[peak - 1 - i] = temp;
        }
    }
}
