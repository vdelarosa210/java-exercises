package Java2;

/**
 * Created by violet on 5/19/17.
 */
public class ShapesTest {
    public static void main(String[] args) {

        //=====Box1=====//
        Rectangle box1 = new Rectangle(5, 4 );

        System.out.println("The measurements of this rectangular box are: Perimeter = " + box1.getPerimeter() + " inches" + " & Area =  " + box1.getArea() + " inches");

        //=====Box2=====//
        Rectangle box2 = new Square(5);

        System.out.println("The measurements of this square box are: Perimeter = " + box2.getPerimeter() + " inches" + " & Area =  " + box2.getArea() + " inches");

        //=====Override of Box 2=====//



    }
}
