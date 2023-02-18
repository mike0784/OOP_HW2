package Model.herbivores;

import Model.abstractClass.Herbivores;
import Model.Interface.FloatInterface;
import Model.Interface.Runable;

public class Turtle extends Herbivores implements Runable, FloatInterface {
    private int speed;
    private int timeUnderwater;
    public Turtle(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Ква- \uD83D\uDC22 -Ква";
    }

    @Override
    public int getSpeedRun() {
        return 6;
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
