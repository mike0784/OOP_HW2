package Model.herbivores;

import Model.abstractClass.Herbivores;
import Model.Interface.FloatInterface;
import Model.Interface.Flyable;
import Model.Interface.Runable;

public class Duck extends Herbivores implements Flyable, Runable, FloatInterface {
    private int speed;
    private int timeUnderwater;

    public Duck(String name, int speed, int timeUnderwater) {
        super(name);
        this.speed = speed;
        this.timeUnderwater = timeUnderwater;
    }

    @Override
    public String say() {
        return "Кря- \uD83E\uDD86 -Кря";
    }

    @Override
    public int getSpeedFlyable() {
        return 15;
    }

    @Override
    public int getHigh() {
        return 5;
    }

    @Override
    public int getSpeedRun() {
        return 10;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public int getTimeUnderwater() {
        return this.timeUnderwater;
    }
}
