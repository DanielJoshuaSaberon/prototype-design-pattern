package PrototypePattern;

import PrototypePattern.Context.AnimalRegistry;
import PrototypePattern.Interface.Animal;

public class TestAnimal {
    public static void main(String[]args){
        AnimalRegistry reg = new AnimalRegistry();

        Animal sheep = reg.createSheep("Bulatao");
        Animal cow = reg.createCow();
        Animal horse = reg.createHorse();

        Animal secondSheep = sheep.clone();
        Animal secondCow = cow.clone();
        Animal secondHorse = horse.clone();


        System.out.println("----------------------");
        System.out.println("Original Sheep: " + sheep.getType());
        sheep.makeSound();

        System.out.println("\nCloned Sheep: " + secondSheep.getType());
        sheep.makeSound();
    }
}
