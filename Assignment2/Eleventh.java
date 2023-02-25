package Assignment2;

import java.util.ArrayList;

public class Eleventh {

    public static void main(String[] args) {

        // 1- Creating ArrayLists of Strings
        ArrayList<String> list = new ArrayList<>();

        // 2- Adding elements to arraylist
        list.add("First");
        list.add("Second");
        list.add("third");

        System.out.println(list);

        // 3- Adding Elements at specified position
        list.add(2, "hello");

        //4- Print the elements of arraylist
        System.out.println(list);
    }
}
