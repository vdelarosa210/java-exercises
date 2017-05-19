package Java2;

/**
 * Created by violet on 5/19/17.
 */
public class Square extends Quadralateral {
    public Square(Double length, Double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    void setLength(Double length) {

    }

    @Override
    void setWidth(Double width) {

    }


    //EXERCISE 6.3 INHERITANCE & POLYMORPHISM//
//    //=====Constructor from parent for side=====//
//    public Square( int side) {
//        super(side, side);
//    }
//
//    //=====Overrides=====//
//    public int getArea(){
//        System.out.println("The area comes from th Square class");
//        return super.getArea();
//    }
//
//    public int getPerimeter(){
//        System.out.println("The area comes from th Square class");
//        return super.getPerimeter();
//    }
}
