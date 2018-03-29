package Lab1;

import Lab1.Decorators.Decorator;
import Lab1.ElementImage.Straight;
import Lab1.ElementImage.Circle;
public class Main {
    public static void main(String[] args) {
        Straight straight = new Straight();
        Circle circle = new Circle();
        straight.show();
        circle.show();
        Decorator decorator1 = new Decorator(straight);
        Decorator decorator2 = new Decorator(circle);
        decorator1.show();
        decorator2.show();
        System.out.println("All is Done");
    }
}
