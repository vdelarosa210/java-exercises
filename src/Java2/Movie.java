package Java2;

import java.util.Scanner;
/**
 * Created by violet on 5/18/17.
 */
public class Movie {

    private String name;

    private String category;

    //=====constructor=====//
    public Movie() {
        this.scan = new Scanner(System.in);
    }

    public Movie(String name, String category){
        this.name = name;
    }

    public Movie(String category){
        this.category = category;
    }

}


