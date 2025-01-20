abstract class Shape {
    abstract void draw();
    public static void main(String args[]) {

        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        circle.draw();
        rectangle.draw();
    }
}

class Circle extends Shape{
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}
class Rectangle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing a Rectangle");
    }
}
