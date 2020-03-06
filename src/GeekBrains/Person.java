package GeekBrains;

public class Person {
    public String fullName;
    public String post;
    public String email;
    public String phoneNumber;
    public int salary;
    public int age;

    public Person(String fullName, String post, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void showInfo() {
        System.out.println("ФИО: " + fullName + " - Должность: " + post + " - email: " + email
                + " - Телефон: " + phoneNumber + " - Зарплата: " + salary + " - Возраст: " + age);
    }
}
