package Assignment2;

import java.util.Scanner;

public class Five {

//    Take name, roll number and field of interest from user and print in the format below:
//    Hey, my name is xyz and my roll number is xyz. My field of interest are xyz.


    static void charge(){

        Scanner s = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = s.nextLine();

        System.out.println("What is your filed of interest?");
        String field = s.nextLine();

        System.out.println("What is your roll number?");
        Integer rollnumber = s.nextInt();





        System.out.println("Hey, my name is " +name + " and my roll number is " +rollnumber + ". My field of interest is " +field);

    }

    public static void main(String[] args) {

        charge();
    }
}
