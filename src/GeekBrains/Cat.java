package GeekBrains;

public class Cat {
    private String name;
    private int appetite;
    public boolean isSatiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isSatiety = false;
    }
    public void eat(Plate p) {
        isSatiety = p.decreaseFood(appetite);
    }
    public void info(){
        if (isSatiety)
            System.out.println("Кот по кличке " + name + " не голоден");
        else
            System.out.println("Кот по кличке " + name + " голоден");
    }
}
