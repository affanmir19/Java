// Parent class
class Animal {
    // Method to be overridden
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {
    // Overriding the sound method of the Animal class
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Another Child class
class Cat extends Animal {
    // Overriding the sound method of the Animal class
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class OverridingExample {
    public static void main(String[] args) {
        // Creating instances of Dog and Cat classes
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Calling the overridden methods
        myDog.sound();  // Output: Dog barks
        myCat.sound();  // Output: Cat meows
    }
}
