package lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        Scanner sc = new Scanner(System.in);

        int arrItem = new Random().nextInt(words.length - 1);
        String wordToGuess = words[arrItem];

        System.out.println("Привет! Я загадал слово из списка " + Arrays.toString(words) +
                " Твоя задача, удадать данное слово");

    }
}
