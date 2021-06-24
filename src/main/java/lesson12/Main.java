package lesson12;

import java.util.HashSet;

public class Main {
    private static final int SIZE = 10_000_000;
    private static final int HALF_SIZE = SIZE / 2;

    public float[] calculate(float[] arr) {
        for (int i = 0; i < arr.length; i++)
            arr[i] = (float) (arr[i] * Math.sin(0.2f + arr[i] / 5) * Math.cos(0.2f + arr[i] / 5) * Math.cos(0.4f + arr[i] / 2));
        return arr;
    }

    public void runOneThread(){
        float[] arr = new float[SIZE];
        for (int i = 0; i < arr.length; i++){
            arr[i]=1.0f;
        }
        long a = System.currentTimeMillis();
        calculate(arr);
            System.out.println("Однопоточный метод заканчивается: "+(System.currentTimeMillis()-a));
    }

    public void runTwoTheread(){
        float[] arr = new float[SIZE];
        float[] arr1 = new float[HALF_SIZE];
        float[] arr2 = new float[HALF_SIZE];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        long a = System.currentTimeMillis();
        System.arraycopy(arr, 0, arr1, 0, HALF_SIZE);
        System.arraycopy(arr, HALF_SIZE, arr2, 0, HALF_SIZE);

        new Thread(){
            public void run(){
                float[] a1 = calculate(arr1);
                System.arraycopy(a1, 0, arr1, 0, a1.length);
            }
        }.start();

        System.arraycopy(arr1, 0, arr, 0, HALF_SIZE);
        System.arraycopy(arr2, 0, arr, HALF_SIZE, HALF_SIZE);
        System.out.println("Двухпоточный метод заканчивается: " + (System.currentTimeMillis() - a));
    }

    public static void main(String s[]){
        Main o = new Main();
        o.runOneThread();
        o.runTwoTheread();
    }





}
