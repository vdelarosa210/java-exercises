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
    public void setLength(Double length) {
        this.length = length;
    }

    public void setWidth(Double width) {
        this.width = width;
    }
}
