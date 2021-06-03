package lesson6;

abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void run(int leight);
    abstract void jump(double leight);
    abstract void swim(int leight);

}

