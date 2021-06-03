package lesson6;

public class List {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Котенок по имени Гав", 200, 2, 0);
        cat1.run(150);
        cat1.jump(1);
        cat1.swim(6);
        System.out.println();
        Dog dog = new Dog("Дружок", 500, 0.5f, 10);
        dog.run(500);
        dog.jump(0.2f);
        dog.swim(13);
        System.out.println();

    }
}
