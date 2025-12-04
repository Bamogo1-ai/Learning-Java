package shapeeditingtool;

class Square extends Shape implements Resizable, Rotatable {

    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " square");
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void resize(double factor) {
        side *= factor;
    }

    @Override
    public void rotate(int degrees) {
        System.out.println("Rotating square by " + degrees + " degrees");
    }
}
