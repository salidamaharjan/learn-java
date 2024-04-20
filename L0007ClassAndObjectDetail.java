public class L0007ClassAndObjectDetail {
    public static void main(String[] args){
        Circle circle1 = new Circle();
        circle1.radius = 100;
        circle1.draw();
        Sq square1 = new Sq();
        square1.length = 100;
        square1.breadth = 100;
        square1.draw();
        Tri triangle1 = new Tri();
        triangle1.height =100;
        triangle1.base = 75;
        triangle1.draw();
    }
}
class Circle {
    double radius;
    void draw() {
        System.out.println("Circle with radius " + radius);
    }
}

class Sq {
    double length;
    double breadth;
    void draw(){
        System.out.println("Square " + length + breadth);
    }
}

class Tri {
    double base;
    double height;
    void draw(){
        System.out.println("Triangle " + base + height);
    }
}