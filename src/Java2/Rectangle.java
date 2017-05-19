package Java2;

/**
 * Created by violet on 5/19/17.
 */
public class Rectangle extends Quadralateral implements Measurable{


    public Rectangle(Double length, Double width) {
        super(length, width);
    }

    @Override
    void setLength(Double length) {
        this.length = length;
    }

    @Override
    void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 2 * this.length + 2 * this.width;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }
}


//EXERCISE 6.3 INHERITANCE & POLYMORPHISM//
//    private int length;
//    private int width;
//
//    //=====Constructor=====//
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    //=====Perimeter formula=====//
//    public int getPerimeter() {
//        return 2 * this.length + 2 * this.width;
//    }
//
//    //=====Area formula=====//
//    public int getArea() {
//        return this.length * this.width;
//    }