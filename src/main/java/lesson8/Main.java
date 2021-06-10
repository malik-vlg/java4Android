package lesson8;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Barrier[] barriers = new Barrier[2];

        Action[] subject = new Action[10];

        Random random = new Random();

        int distance;
        int height;

        for (int i = 0; i < barriers.length; i++) {

            distance = random.nextInt(100);
            height = random.nextInt(10);

            if (i < barriers.length / 2) {
                barriers[i] = new Treadmill(distance);
            } else {
                barriers[i] = new Wall(height);
            }
        }
        for (int i = 0; i < subject.length; i++) {
            distance = random.nextInt(150);
            height = random.nextInt(15);

            if (i < subject.length / 3) {
                subject[i] = new Human(distance, height);
            } else if (i > (subject.length / 3) && i <= subject.length - (subject.length / 3)) {
                subject[i] = new Robot(distance, height);
            } else {
                subject[i] = new Cat(distance, height);
            }

        }
        for (int i = 0; i < subject.length; i++) {

            System.out.println("Участник № " + i);

            Treadmill treadmill = (Treadmill) barriers[0];
            subject[i].run(treadmill);
            if (!subject[i].isResult()) {
                continue;
            }
            if (barriers[i] instanceof Wall) {
                Wall wall = (Wall) barriers[1];
                subject[i].jump(wall);
                subject[i].isResult();
            }

        }
    }
}
