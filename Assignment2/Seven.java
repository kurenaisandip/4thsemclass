package Assignment2;

import java.util.Scanner;

public class Seven {

//    A school has following rules for grading system:
//    a. Below 25 -F
//    b. 25 to 45 -E
//    c. 40 to 50 - D
//    d. 50 to 60 - C
//    e. 60 to 80  -B
//    f. Above 80 - A


    public void Grading(){

        Scanner s = new Scanner(System.in);

        System.out.println("What is your Grade ?");
        int marks = s.nextInt();

        if (marks > 80 ){
            System.out.println("You got A.");
        } else if (marks >= 60 && marks < 80) {
            System.out.println("You got B.");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("You got C");
        } else if (marks >= 45 && marks < 50) {
            System.out.println("You got D");
        } else if (marks >= 25 && marks < 45) {
            System.out.println("You got E.");
        }
        else {
            System.out.println("You got F.");
        }

    }

    public static void main(String[] args) {
        Seven as = new Seven();
        as.Grading();
    }


}

