package Model;

import Model.Interface.FloatInterface;
import Model.Interface.Flyable;
import Model.Interface.Runable;
import Model.Interface.Sayable;
import Model.abstractClass.Animal;

import java.util.ArrayList;
import java.util.List;


public class Zoo {
    List<Animal> animalList = new ArrayList<>();
    Sayable radio;

    public Zoo(List<Object> animals, Sayable talkingObj) {
        List<Animal> animalList = new ArrayList<Animal>();
        this.radio = talkingObj;
        for (Object item: animals) {
            animalList.add((Animal) item);
        }
        this.animalList.addAll(animalList);

    }

    public List<Runable> getRunableList() {
        List<Runable> runableList = new ArrayList<>();
        for (Animal animal : this.animalList) {
            if (animal instanceof Runable) {
                runableList.add((Runable) animal);
            }
        }
        return runableList;
    }

    public List<Flyable> getFlyableList() {
        List<Flyable> flyableList = new ArrayList<>();
        for (Animal animal : this.animalList) {
            if (animal instanceof Flyable) {
                flyableList.add((Flyable) animal);
            }
        }
        return flyableList;
    }

    public List<FloatInterface> getSwimableList() {
        List<FloatInterface> swimableList = new ArrayList<>();
        for (Animal animal : this.animalList) {
            if (animal instanceof FloatInterface) {
                swimableList.add((FloatInterface) animal);
            }
        }
        return swimableList;
    }

    public Animal getRunChampion(){
        List<Runable> runners = getRunableList();
        Runable champion = runners.get(0);
        for (Runable r : runners){
            if(champion.getSpeedRun() < r.getSpeedRun()){
                champion = r;
            }
        }
        return (Animal) champion;
    }

    public Animal getFlightChampion(){
        List<Flyable> flyers = getFlyableList();
        Flyable champion = flyers.get(0);
        for (Flyable r : flyers){
            if(champion.getSpeedFlyable() < r.getSpeedFlyable()){
                champion = r;
            }
        }
        return (Animal) champion;
    }
    public Animal getSwimChampion(){
        List<FloatInterface> swims = getSwimableList();
        FloatInterface champion = swims.get(0);
        for (FloatInterface r : swims){
            if(champion.getSpeed() < r.getSpeed()){
                champion = r;
            }
        }
        return (Animal) champion;
    }
}
