package PrototypePattern.Context;

import PrototypePattern.ConcreteClasses.*;
import PrototypePattern.Interface.Animal;

public class AnimalRegistry {
    private Sheep sheepPrototype;
    private Cow cowPrototype;
    private Horse horsePrototype;

    public AnimalRegistry() {
        this.sheepPrototype = new Sheep(4,"BAAAAAAAAA","Green Grass", "Sheepy");
        this.cowPrototype = new Cow(4,"MOOOOOO", "Hay");
        this.horsePrototype = new Horse(4,"NEIGGHHHH", "Grass or Hay", "Brown");
    }

    public Animal createSheep(String name){
        Sheep clonedSheep = (Sheep) sheepPrototype.clone();
        return clonedSheep;
    }

    public Animal createCow(){
        Cow clonedCow = (Cow) cowPrototype.clone();
        return clonedCow;
    }

    public Animal createHorse(){
        Horse clonedHorse = (Horse) horsePrototype.clone();
        return clonedHorse;
    }

}
