package Model.Waterfowl;

import Model.Interface.FloatInterface;
import Model.abstractClass.Predator;

public class Shark extends Predator implements FloatInterface {
    private int speed;
    private int timeUnderwater;

    public Shark(String name, int speed, int timeUnderwater) {
        super(name);
        this.speed = speed;
        this.timeUnderwater = timeUnderwater;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public int getTimeUnderwater() {
        return this.timeUnderwater;
    }

    @Override
    public String say() {
        return "No say";
    }
}
