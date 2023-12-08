
abstract class Animal {
    String animalType;

    Animal(String animalType) {
        this.animalType = animalType;
        System.out.println("Constructor of " + animalType + " Animal");
    }

    abstract void animalSound();
}

class Mammal extends Animal {
    Mammal() {
        super("Mammal");
        System.out.println("Constructor of Mammal");
    }

    @Override
    void animalSound() {
        System.out.println("Mammals make different sounds");
    }
}

class Dog extends Mammal {
    Dog() {
        super();
        System.out.println("Constructor of Dog");
    }

    @Override
    void animalSound() {
        System.out.println("Dogs bark");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.animalSound();
    }
}