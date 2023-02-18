package View;

import Model.abstractClass.Animal;
import Model.Interface.FloatInterface;
import Model.Interface.Flyable;
import Model.Interface.Runable;

import java.util.List;

public class View {
    public static void printChampion(Animal animal) {
        if (animal instanceof Runnable) {
            System.out.println("_\uD83E\uDD47_Чемпион по бегу_\uD83C\uDFC3_");
            printZoo(List.of(animal));
        }
        if (animal instanceof Flyable) {
            System.out.println("_\uD83E\uDD47_Чемпион по полётам_✈️_");
            printZoo(List.of(animal));
        }
        if (animal instanceof FloatInterface) {
            System.out.println("_\uD83E\uDD47_Чемпион по плаванию_\uD83C\uDFCA️_");
            printZoo(List.of(animal));
        }
    }

    public static void printZoo(List<Object> listAnimals) {
        for (Object animal : listAnimals) {
            System.out.println("______________________");
            System.out.println(((Animal) animal).getName());
            System.out.println("Говорит: " + ((Animal) animal).say());
            if (animal instanceof Runable) {
                System.out.println("Скорость бега:" + ((Runable) animal).getSpeedRun());
            }
            if (animal instanceof Flyable) {
                System.out.println("Скорость полёта:" + ((Flyable) animal).getSpeedFlyable());
                System.out.println("Высота полёта:" + ((Flyable) animal).getHigh());
            }
            if (animal instanceof FloatInterface) {
                System.out.println("Скорость плавания:" + ((FloatInterface) animal).getSpeed());
                System.out.println("Время под водой:" + ((FloatInterface) animal).getTimeUnderwater());
            }
        }
        System.out.println("\n");
    }
}
