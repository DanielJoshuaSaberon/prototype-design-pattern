package PrototypePattern.ConcreteClasses;

import PrototypePattern.Interface.Animal;

public class Horse implements Animal {
    private int legs;
    private String sound;
    private String food;
    private String color;

    public Horse(int legs, String sound, String food, String color) {
        this.legs = legs;
        this.sound = sound;
        this.food = food;
        this.color = color;
    }

    @Override
    public void makeSound() {
        System.out.println("Horse makes the sound, " + sound);
    }

    @Override
    public String getType() {
        return "Horse";
    }

    @Override
    public Animal clone() {
        return new Horse(legs, sound, food, color);
    }
}
