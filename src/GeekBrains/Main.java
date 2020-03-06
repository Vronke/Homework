package GeekBrains;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Person[] personArr = new Person[5];

        personArr[0] = new Person("Человек1", "Должность1", "человек1@почта.ру", "+7 (911) 111-11-11", 100000, 45);
        personArr[1] = new Person("Человек2", "Должность2", "человек2@почта.ру", "+7 (922) 222-22-22", 30000, 24);
        personArr[2] = new Person("Человек3", "Должность3", "человек3@почта.ру", "+7 (933) 333-33-33", 35000, 32);
        personArr[3] = new Person("Человек4", "Должность4", "человек4@почта.ру", "+7 (944) 444-44-44", 45000, 27);
        personArr[4] = new Person("Человек5", "Должность5", "человек5@почта.ру", "+7 (955) 555-55-55", 200000, 50);

        for (Person p : personArr) {
            if (p.age > 40)
                p.showInfo();
        }
    }
}