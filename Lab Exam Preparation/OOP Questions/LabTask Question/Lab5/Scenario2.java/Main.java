// You have to model various shapes for drawing purposes. Each shape has common properties
// such as name and, color along with some methods of area and perimeter. Shapes include
// circles and rectangles, each with specific properties such as radius for circles and length and
// width for rectangles.

interface Drawable {
    void draw();
}
abstract class Shape implements Drawable {
    protected String name;
    protected String color;

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public abstract double area();

    public abstract double perimeter();

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " " + name);
    }
}
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String name, String color, double length, double width) {
        super(name, color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}
class Circle extends Shape {
    private double radius;

    public Circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
public class Main{
    
        public static void main(String[] args) {
            Circle circle = new Circle("Circle", "Red", 5.0);
            Rectangle rectangle = new Rectangle("Rectangle", "Blue", 4.0, 6.0);
    
            
            circle.draw();
    
            System.out.println("Circle Area: " + circle.area());
            System.out.println("Circle Perimeter: " + circle.perimeter());
            
            rectangle.draw();
    
            System.out.println("Rectangle Area: " + rectangle.area());
            System.out.println("Rectangle Perimeter: " + rectangle.perimeter());
        }
    
}

