// Parent Class
class Animal {
    public void eat() {
        System.out.println("This animal is eating");
    }
}

// Child Class (inherits Animal class)
class Dog extends Animal {
    public void bark() {
        System.out.println("The dog is barking");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Inherited method
        dog.bark(); // Dog class method
    }
}
