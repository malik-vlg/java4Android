package lesson13;

import java.util.concurrent.Phaser;

public class Main {
    public static final int CARS_COUNT = 4;

    public static void main(String[] args) {
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ!!! Идет подготовка!");
        Race race = new Race(new Road(60), new Tunnel(), new Road(40));
        Car[] cars = new Car[CARS_COUNT];
        Phaser phaser = new Phaser();
        phaser.register();
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10), phaser);
        }
        for (int i = 0; i < cars.length; i++) {
            new Thread(cars[i]).start();
        }

        phaser.arriveAndAwaitAdvance();
        phaser.arriveAndDeregister();
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ!!! ГОНКА НАЧАЛАСЬ!");

        phaser.awaitAdvance(1);

        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ!!! ГОНКА ЗАКОНЧИЛАСЬ!");
    }
}
