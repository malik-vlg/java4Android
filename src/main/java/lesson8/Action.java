package lesson8;

public interface Action {
    void run(Treadmill treadmill);
    void jump(Wall wall);
    boolean isResult();
}

interface Barrier{

}
// Не совсем корректно работает, не понимаю почему((
// нужна помощь