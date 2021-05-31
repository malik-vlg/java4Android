package lesson5;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String telephone;
    private int theSalary;
    private int age;

    public Employee(String fullName, String position, String email, String telephone, int theSalary, int age){
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.theSalary = theSalary;
        this.age = age;
    }

    public void writeInfo(){
        System.out.printf("ФИО:  %s \n" +
                "Должность: %s \n" +
                "Почта: %s \n" +
                "Телефон: %s \n" +
                "Зарплата: %d \n" +
                "Возраст: %d \n", fullName, position, email, telephone, theSalary, age);
    }


    public int getAge(){
        return age;

    }
}
