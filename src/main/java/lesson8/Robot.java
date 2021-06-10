package lesson8;

public class Robot implements Action{
    public int maxDistance;
    public int maxHeight;
    public boolean result;

    public Robot(int maxDistance, int maxHeight){
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
    }

    @Override
    public void run(Treadmill treadmill) {
        if(treadmill.getDistance() <= maxDistance){
            result = true;
            System.out.println("Преодолел дистанцию");
        } else {
            result = false;
            System.out.println("Дистанцию не осилел");
        }
    }

    @Override
    public void jump(Wall wall) {
        if(wall.getHeight() <= maxHeight){
            result = true;
            System.out.println("Перепрыгнул");
        }else {
            result = false;
            System.out.println("Упал");
        }
    }

    @Override
    public boolean isResult() {
        return result;
    }
}
