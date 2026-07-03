package Oops;

//public class polyMorphism {
    // Parent Class
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

// Child Class 1
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks: Woof Woof!");
    }
}
// Child Class 2
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows: Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Parent class references pointing to Child class objects (Upcasting)
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // The JVM resolves the method call at runtime based on the actual object type
        myDog.makeSound(); // Outputs: The dog barks: Woof Woof!
        myCat.makeSound(); // Outputs: The cat meows: Meow!
    }
}

