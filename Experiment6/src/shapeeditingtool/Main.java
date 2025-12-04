package shapeeditingtool;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle("red", 5);
        Square square = new Square("blue", 4);

        // --- Circle Tests ---
        circle.draw();
        System.out.println("Circle area: " + circle.calculateArea());
        circle.resize(1.5);
        System.out.println("Circle area after resizing: " + circle.calculateArea());

        System.out.println();

        // --- Square Tests ---
        square.draw();
        System.out.println("Square area: " + square.calculateArea());
        square.resize(2);
        System.out.println("Square area after resizing: " + square.calculateArea());
        square.rotate(45);
    }
}
