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


        System.out.println("Original Sheep: " + sheep.getType());
        sheep.makeSound();
        System.out.println("Cloned Sheep: " + secondSheep.getType());
        sheep.makeSound();

        System.out.println("\nOriginal Cow: " + cow.getType());
        cow.makeSound();
        System.out.println("Cloned Cow: " + secondCow.getType());
        secondCow.makeSound();

        System.out.println("\nOriginal Horse: " + horse.getType());
        horse.makeSound();
        System.out.println("Cloned Horse: " + secondHorse.getType());
        secondHorse.makeSound();

    }
}
