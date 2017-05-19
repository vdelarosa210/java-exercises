package Java2;

/**
 * Created by violet on 5/19/17.
 */
abstract class Quadralateral extends Shape implements Measurable {

    protected Double length;

    protected Double width;


    //=====Constructor=====//
    public Quadralateral(Double length, Double width) {
        this.length = length;
        this.width = width;
    }

    //====Getter=====//
    public Double getLength() {
        return length;
    }

    public Double getWidth() {
        return width;
    }

    //=====Setter=====//
    abstract void setLength(Double length);

    abstract void setWidth(Double width);

}
