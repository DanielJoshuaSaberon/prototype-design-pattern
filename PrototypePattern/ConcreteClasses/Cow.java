package PrototypePattern.ConcreteClasses;

import PrototypePattern.Interface.Animal;

public class Cow implements Animal {
    private int legs;
    private String sound;
    private String food;

    public Cow(int legs, String sound, String food) {
        this.legs = legs;
        this.sound = sound;
        this.food = food;
    }


    @Override
    public void makeSound() {
        System.out.println("Cow makes the sound, " + sound);
    }

    @Override
    public String getType() {
        return "Cow";
    }

    @Override
    public Animal clone() {
        return new Cow(legs, sound, food);
    }
}
