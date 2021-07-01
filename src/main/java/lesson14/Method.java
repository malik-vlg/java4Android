package lesson14;

import org.apache.commons.lang3.ArrayUtils;


public class Method {


    public int[] myMethodOne(int array[]){
        int newArray[] = ArrayUtils.subarray(array,
                ArrayUtils.lastIndexOf(array, 4) + 1,
                ArrayUtils.getLength(array) + 1);
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 4){
                counter += 1;
            }
        }
        if (counter == 0) throw new RuntimeException();
        return newArray;
    }
}
