package lesson14;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int array[] = {1, 4, 1, 8, 7, 4, 3, 2, 5, 3, 7};
        Method method = new Method();
        System.out.println(Arrays.toString(method.myMethodOne(array)));
    }
}
