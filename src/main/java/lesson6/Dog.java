package lesson6;

public class Dog extends Animal{
    int maxRun;
    double maxJump;
    int maxSwim;

    public Dog(String name, int maxRun, double maxJump, int maxSwim){
        super(name);
        this.maxRun = maxRun;
        this.maxJump = maxJump;
        this.maxSwim = maxSwim;
    }

    public void run(int leight){
        if((leight >= 0) && (leight <= maxRun)){
            System.out.println(this.name + " бежит: " + maxRun);
        } else System.out.println("Больше пробежать не может");
    }


    public void jump(double leight){
        if ((leight >= 0) && (leight <= maxJump)){
            System.out.println(this.name + " прыгает: " + maxJump);
        } else System.out.println("Выше не прыгнет");
    }
    public void swim(int leight){
        if ((leight >= 0) && (leight <= maxSwim)){
            System.out.println(this.name + " плывёт: " + maxSwim);
        } else System.out.println("Больше проплыть не может");

    }
}
