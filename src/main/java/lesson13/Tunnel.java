package lesson13;

import java.util.concurrent.Semaphore;

public class Tunnel extends Stage{
    public Tunnel(){
        this.lenght = 80;
        this.description = "Тоннель " + lenght + " метров";
    }
    final Semaphore smp = new Semaphore(1);

    @Override
    public void go(Car c) {
        try{
            try {
                System.out.println(c.getName() + " готовится к этапу(ждёт): " + description);
                smp.acquire();
                System.out.println(c.getName() + " начал этап: " + description);
                Thread.sleep(lenght / c.getSpeed() * 1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            } finally {
                System.out.println(c.getName() + " закончил этап: " + description);
                smp.release();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
