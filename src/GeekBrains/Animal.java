package GeekBrains;

import java.util.Random;

public class Animal {
    Random random = new Random();
    Animal(double maxRun, double maxSwim, double maxJump){
        this.maxRun = maxRun + random.nextInt(200) - 100;
        if (maxSwim != 0)
            this.maxSwim = maxSwim + random.nextInt(2) - 1;
        else
            this.maxSwim = maxSwim;
        this.maxJump = maxJump + (random.nextInt(10) % 10);
    }
    private double maxRun = 0;
    private double maxSwim = 0;
    private double maxJump = 0;

    public boolean run(double distance){
        if (distance > 0 && distance <= maxRun)
            return true;
        return false;
    }
    public boolean swim(double distance){
        if (distance > 0 && distance <= maxSwim)
            return true;
        return false;
    }
    public boolean jump(double height){
        if (height > 0 && height <= maxJump)
            return true;
        return false;
    }
}