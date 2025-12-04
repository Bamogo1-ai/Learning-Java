package shapeeditingtool;

abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract void draw();
    public abstract double calculateArea();
}
