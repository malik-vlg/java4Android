package lesson8;

public class Wall implements Barrier {
    public int height;

    public Wall(int height){
        this.height = height;
    }

    public int getHeight(){
        return height;
    }
}
