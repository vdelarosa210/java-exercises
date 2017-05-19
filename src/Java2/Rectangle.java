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
    public static int getPerimeter(int length, int width) {
        return 2 * length + 2 * width;
    }

    //=====Area formula=====//
    public static int getArea(int length, int width) {
        return length * width;
    }

}

