package PrototypePattern.Interface;

public interface Animal extends Cloneable {
    void makeSound();
    String getType();
    Animal clone();
}
