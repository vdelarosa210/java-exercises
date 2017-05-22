package Java2;

import java.util.Scanner;
/**
 * Created by violet on 5/18/17.
 */
public class Movie {

    private String name;

    private String category;

////    =====constructor=====//
//    public Movie() {
//        this.scan = new Scanner(System.in);
//    }

    public Movie(String name, String category){
        this.name = name;
        this.category = category;
    }


    //=====getter=====//
    public String getName(){
        return this.name;
    }

    public String getCategory(){
        return this.category;
    }

    //=====setter=====//
    public String setName(){
        return this.name;
    }

    public String setCategory(){
        return this.category;
    }

}


