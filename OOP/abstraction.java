abstract class Shape {
    // Abstract method (no implementation)
    abstract void draw();

    // Regular method
    public void display() {
        System.out.println("Displaying shape");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
        shape.display();
    }
}
