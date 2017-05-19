package Java2;

/**
 * Created by violet on 5/19/17.
 */
public class Rectangle {
    private int length;
    private int width;

    //=====Constructor=====//
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    //=====Perimeter formula=====//
    public int getPerimeter() {
        return 2 * this.length + 2 * this.width;
    }

    //=====Area formula=====//
    public int getArea() {
        return this.length * this.width;
    }

}

