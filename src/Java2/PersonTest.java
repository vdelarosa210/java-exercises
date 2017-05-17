package Java2;

/**
 * Created by violet on 5/16/17.
 */
public class PersonTest {
    public static void main(String[] args) {

        Person classmate = new Person("Violet");
        Person classmate2 = new Person("Ben");

//        classmate.setName ("Violet");

        System.out.println(classmate.getName());
        System.out.println("The name of classmate is " + classmate.getName());

        classmate2.setName("Ben");
        System.out.println(classmate2.getName());

        //=====Do not use double == when comparing strings in Java=====//

        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);


        //=====Note when assigning the one instance to equal the same if one instance is changed, then both are changed=====//
        Person person3 = new Person("John");
        Person person4 = person3;
        System.out.println(person3.getName());
        System.out.println(person4.getName());
        person4.setName("Jane");
        System.out.println(person3.getName());
        System.out.println(person4.getName());

    }
}
