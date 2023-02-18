package Model.herbivores;

import Model.abstractClass.Herbivores;
import Model.Interface.Runable;

public class Goat extends Herbivores implements Runable {
    public Goat(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Мее- \uD83D\uDC10 - Мее";
    }

    @Override
    public int getSpeedRun() {
        return 4;
    }
}
