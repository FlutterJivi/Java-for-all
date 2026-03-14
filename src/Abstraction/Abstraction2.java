package Abstraction;
abstract class Shape{
    String color;
    double x,y;

    Shape(String color,double x,double y){
        this.color = color;
        this.x = x;
        this.y = y;
    }

    abstract double area();
    abstract double perimeter();

    void displayInfo(){
        System.out.println("Shape: " + this.getClass().getSimpleName());
        System.out.println("Color: " + color);
        System.out.println("Position: (" + x + ", " + y +")");
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
        System.out.println("----");
    }

    static void printShapeRule(){
        System.out.println("Sab shapes ka area aur perimeter hota hai.");
    }
}

class Circle extends Shape{
    double radius;

    Circle(String color,double x,double y, double radius){
        super(color, x, y);
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape{
    double length, breadth;

    Rectangle(String color,double x,double y, double length,double breadth){
        super(color,x,y);
        this.length = length;
        this.breadth = breadth;
    }

    double area(){
        return length * breadth;
    }

    @Override
    double perimeter() {
        return 2 * (length + breadth);
    }
}

class Triangle extends  Shape{
    double a,b,c;

    Triangle(String color,double x, double y, double a,double b, double c){
        super(color,x,y);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double area(){
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s-a) * (s-b) * (s-c));
    }

    @Override
    double perimeter() {
        return a + b + c;
    }
}

public class Abstraction2 {
    static void main() {
        Shape[] shapes = {
                new Circle("Red",0,0,5),
                new Rectangle("Blue",1,1,4,6),
                new Triangle("Green",2,2,3,4,5)
        };

        for (Shape shape : shapes){
            shape.displayInfo();
        }
    }
}
