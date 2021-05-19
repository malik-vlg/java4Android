package lesson2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        diagonalArray(5);
        minAndMaxArray();

    }

    public static void invertArray(){
        int[] mass = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for (int i = 0; i < mass.length; i++){
            if (mass[i] == 1){
                mass[i] = 0;
            } else {
                mass[i] = 1;
            }
        System.out.println(Arrays.toString(mass));
        }
    }


    public static void fillArray(){
        int[] mass = new int[8];
        for (int i = 0; i < mass.length; i++){
            mass[i] = i * 3;
        }
        System.out.println(Arrays.toString(mass));
    }

    public static void changeArray(){
        int[] mass = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < mass.length; i++){
            if(mass[i] < 6){
                mass[i] = mass[i] * 2;
            }
        }
    }

    public static void diagonalArray(int size){
        int[][] mass = new int[size][size];
        for (int i = 0; i < mass.length; i++){
            for (int j = 0; j < mass.length; j++){
                if (i == j){
                    mass[i][j] = 1;
                } else if (mass.length-1-i == j){
                    mass[i][j] =1;
                }

            }
             System.out.println(Arrays.toString(mass[i]));
        }

    }

    public static void minAndMaxArray(){
        int[] mass = new int[10];
        for (int i = 0; i < mass.length; i++){
            mass[i] = (int)(Math.random() * 100);
        }

        int min = mass[0];
        int max = mass[0];
        for (int i = 0; i < mass.length; i++){
            if (mass[i] > max){
                max = mass[i];
            }
            if (mass[i] < min){
                min = mass[i];
            }
        }
    }
}
