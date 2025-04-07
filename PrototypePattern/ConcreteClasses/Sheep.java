package PrototypePattern.ConcreteClasses;

import PrototypePattern.Interface.Animal;

public class Sheep implements Animal {
    private int legs;
    private String sound;
    private String food;
    private String name;

    public Sheep(int legs, String sound, String food, String name) {
        this.legs = legs;
        this.sound = sound;
        this.food = food;
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("Sheep makes the sound, " + sound);
    }

    @Override
    public String getType() {
        return "Sheep";
    }

    @Override
    public Animal clone() {
        return new Sheep(legs, food, name, sound);
    }
}
