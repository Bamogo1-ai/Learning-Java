package shapeeditingtool;

class Circle extends Shape implements Resizable {

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " circle");
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void resize(double factor) {
        radius *= factor;
    }
}
