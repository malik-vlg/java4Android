package lesson7;

import java.util.Scanner;

public class MainClass {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Cat[] allCats = new Cat[5];
        allCats[0] = new Cat("Пушок", 5, false);
        allCats[1] = new Cat("Снежок", 10, false);
        allCats[2] = new Cat("Барсик", 8, false);
        allCats[3] = new Cat("Троглодит", 25, false);
        allCats[4] = new Cat("Черныш", 12, false);


        Plate plate = new Plate(40);
        plate.info();
        for (Cat allCat : allCats) {
            if (!allCat.fullness && allCat.appetite < plate.food) {
                allCat.eat(plate);
                allCat.fullness = true;
                System.out.println(allCat.name + " поел");
            } else {
                System.out.println(allCat.name + " остался голодный");
            }

        }
        plate.info();
        System.out.println("Сколько Вы бы хотели добавить еды?");
        int action = sc.nextInt();
        plate.increaseFood(action);
        plate.info();
    }
}
