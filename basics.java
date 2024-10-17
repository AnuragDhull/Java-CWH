package oops.inheritence;

// Superclass: Animal
class Animal {
    // Method in the Animal class
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Subclass: Dog inherits from Animal
class Dog extends Animal {
    // Method specific to the Dog class
    public void bark() {
        System.out.println("The dog barks.");
    }
}

public class basics {
    public static void main(String[] args) {
        // Create an instance of Dog
        Dog dog = new Dog();

        // Call the inherited method from the Animal class
        dog.makeSound();

        // Call the method from the Dog class
        dog.bark();
    }
}
