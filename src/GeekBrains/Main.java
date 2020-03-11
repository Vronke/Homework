package GeekBrains;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", 5);
        Cat cat2 = new Cat("Talka", 7);
        Cat cat3 = new Cat("Sega", 9);
        Cat cat4 = new Cat("Pin", 12);
        Cat cat5 = new Cat("Leva", 8);
        Cat[] cats = {cat1, cat2, cat3, cat4, cat5};

        Plate plate = new Plate(30);
        plate.info();

        for (Cat cat : cats) {
            if (!cat.isSatiety)
                cat.eat(plate);
            cat.info();
        }
        plate.info();

        plate.increaseFood(15);

        for (Cat cat : cats) {
            if (!cat.isSatiety)
                cat.eat(plate);
            cat.info();
        }
        plate.info();
    }
}

