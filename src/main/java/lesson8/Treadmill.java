package lesson8;

public class Treadmill implements Barrier{

    public int distance;

    public Treadmill(int distance){
        this.distance = distance;
    }

    public int getDistance(){
        return distance;
    }
}
