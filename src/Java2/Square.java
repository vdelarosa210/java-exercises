package Java2;

/**
 * Created by violet on 5/19/17.
 */
public class Square extends Quadralateral {
    public Square(Double side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    void setLength(Double length) {
        this.length = length;
        width = length;
    }

    @Override
    void setWidth(Double width) {
        this.width = width;
        length = width;
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
