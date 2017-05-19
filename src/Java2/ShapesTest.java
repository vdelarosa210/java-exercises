package Java2;

/**
 * Created by violet on 5/19/17.
 */
public class ShapesTest {
    public static void main(String[] args) {

        Rectangle box1 = new Rectangle(5, 4 );

        System.out.println("This box measures " + box1.getPerimeter() + " " + box1.getArea());

        Rectangle box2 = new Square(5);

        System.out.println("This square box measures " + box2.getArea() + " " + box2.getPerimeter());

    }
}
