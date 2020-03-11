package GeekBrains;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.swim(0);
        System.out.println(cat.swim(0));
        Dog dog = new Dog();
        System.out.println(dog.run(100));
    }
}