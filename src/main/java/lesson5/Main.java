package lesson5;

public class Main {
    public static void main(String[] args) {
        Employee[] employeeArr = new Employee[6];
        employeeArr[0] = new Employee("Иванов Иван Иванович", "официант", "Ivanov92@mail.ru", "+79876543210", 35000,28);
        employeeArr[1] = new Employee("Петров Петр Петрович", "бармен", "petrovpetya@mail.ru", "+79876543210", 40000,29);
        employeeArr[2] = new Employee("Кузнецов Вадим Иванович", "повар", "kuznec666@mail.ru", "+79876543210", 50000,49);
        employeeArr[3] = new Employee("Сидоренко Дмитрий Анатольевич", "су-шеф", "dimasik@mail.ru", "+79876543210", 80000,42);
        employeeArr[4] = new Employee("Дронов Андрей Андреевич", "шеф повар", "dronovdron@mail.ru", "+79876543210", 100000,38);
        employeeArr[5] = new Employee("Пукин Владимир Владимирович", "директор", "volodyarulit@mail.ru", "+79999988998", 300000,56);
        System.out.println("Информация о сотрудниках старше 40 лет: \n");

        for (int i = 0; i < employeeArr.length; i++){
            if(employeeArr[i].getAge() >= 40){
                employeeArr[i].writeInfo();
                System.out.println();
            }
        }
    }
}
