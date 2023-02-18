import Model.Zoo;
import Model.radio.Radio;
import View.View;

import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Object> animalsList = List.of(
                new Model.herbivores.Cow("Мурка"),
                new Model.predators.Crocodile("Гена"),
                new Model.predators.Leo("Симба - Леопольд"),
                new Model.herbivores.Goat("Маруська"),
                new Model.herbivores.Duck("Дональд Дак", 5, 5),
                new Model.Waterfowl.Shark("Глат", 30, 0),
                new Model.herbivores.Turtle("Тартила")
        );

        Zoo zoo = new Zoo(animalsList, new Radio());

        View.printZoo(animalsList);
        View.printChampion(zoo.getRunChampion());
        View.printChampion(zoo.getFlightChampion());
        View.printChampion(zoo.getSwimChampion());
    }
}
