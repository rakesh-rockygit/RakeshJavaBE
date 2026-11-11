package Oops;

import Oops.polyMorphism.Animal;
import Oops.polyMorphism.Cat;
import Oops.polyMorphism.Dog;

public class polyMorphism {
    // Parent Class
    static class Animal {
        public void makeSound() {
            System.out.println("The animal makes a sound");
        }
    }

    // Child Class 1
    static class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("The dog barks: Woof Woof!");
        }
    }

    // Child Class 2
    static class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("The cat meows: Meow!");
        }
    }
      // Child Class 3
    static class Tiger extends Animal {
        @Override
        public void makeSound() {
            System.out.println("The tiger growls: Grrr!");
        }
    }

    public static void main(String[] args) {
        // Parent class references pointing to Child class objects (Upcasting)
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        Animal myTiger = new Tiger();

        // The JVM resolves the method call at runtime based on the actual object type
        myDog.makeSound(); // Outputs: The dog barks: Woof Woof!
        myCat.makeSound(); // Outputs: The cat meows: Meow!
        myTiger.makeSound(); // Outputs: The tiger growls: Grrr!
    }

}
