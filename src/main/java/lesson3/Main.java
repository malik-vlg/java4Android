package lesson3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Random rand = new Random();
        while (true) {
            int attempt = 3;
            int answer = rand.nextInt(10);
            while (true) {
                int riddleNumber = getNumberFromScanner("Угадайте число от 0 до 9", 0, 9);
                if (answer == riddleNumber) {
                    System.out.println("Вы выйграли");
                    break;
                }
                if (answer < riddleNumber) {
                    System.out.println("Загаданное число меньше");
                } else {
                    System.out.println("Загаданное число больше");
                }
                attempt--;
                System.out.println("У вас осталось " + attempt + " из 3 попыток");
                if (attempt == 0) {
                    System.out.println("Вы проиграли");
                    break;
                }
            }

            int repeat = getNumberFromScanner("Повторить игру еще раз? 1 - Да / 0 - Нет", 0, 1);
            if (repeat == 0) {
                break;
            }
        }
        sc.close();
    }


    public static int getNumberFromScanner(String message, int min, int max) {
        int number;
        do {
            System.out.println(message);
            number = sc.nextInt();

        } while (number < min || number > max);
        return number;
    }

}