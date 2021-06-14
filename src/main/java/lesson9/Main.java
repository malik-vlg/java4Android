package lesson9;

public class Main {

    public static void main(String[] args) {
        String[][] arrOne = new String[][]{
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        String[][] arrTwo = new String[][]{
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}

        };

        try{
            transformAndSumArr(arrTwo);
        } catch (MyArraySizeException e){
            System.out.println("Массив выведен не верно!");
        } catch (MyArrayDataException e){
            System.out.println("Ошибка " + e.i + " - " + e.j);
        }
    }

    public static void transformAndSumArr(String[][] arrOne) throws MyArrayDataException, MyArraySizeException{
        int transform;
        int sum = 0;
        int maxLine = arrOne.length;
        int maxColumn = arrOne[0].length;

        if(maxLine != 4 || maxColumn != 4){
            throw new MyArraySizeException("Размер");
        }
        for (int i = 0; i < arrOne.length; i++) {
            for (int j = 0; j < arrOne[0].length; j++) {
                try{
                    transform = Integer.parseInt(arrOne[i][j]);
                    sum += transform;
                } catch (NumberFormatException e){
                    throw new MyArrayDataException(i, j);
                }

            }

        }
        System.out.println("Сумма элементов в массиве равна " + sum);
    }
}
