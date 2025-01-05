package Constructor;

public class Circle {
    //What is a Constructor?
    //	•	Special method used to initialize an object.
    //	•	Name of the constructor = Name of the class.
    //	•	No return type (not even void).
    double radius;

    Circle() {
        radius = 1.0;
    }

    Circle(double newRadius) {
        radius = newRadius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }


    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(2.0);

        System.out.println("Circle 1 : " + circle1.getArea());
        System.out.println("Circle 2 : " + circle2.getArea());
    }
}
