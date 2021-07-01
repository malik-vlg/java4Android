package lesson14;

public class Process {
    public static void main(String[] args) {
        final boolean result = process(new int[]{1, 1, 1, 4, 4, 1, 4, 4});
        System.out.println(result);
    }

    public static boolean process(int[] arrIn) {
        boolean one = false;
        boolean four = false;
        for (int i : arrIn) {
            if(i != 1 && i != 4){
                break;
            }
            if (i == 1) {
                one = true;
            }
            if (i == 4) {
                four = true;
            }
        }
        return one && four;
    }
}
