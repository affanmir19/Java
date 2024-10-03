// Base class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass Dog
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Subclass Cat
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class DynamicMethodDispatchExample {
    public static void main(String[] args) {
        // Creating objects of subclasses
        Animal myDog = new Dog(); // Upcasting
        Animal myCat = new Cat(); // Upcasting
        
        // Dynamic method dispatch
        myDog.sound(); // Calls Dog's sound() method
        myCat.sound(); // Calls Cat's sound() method
    }
}
