package Assignment2;

import java.util.Queue;
import java.util.Scanner;

public class Six {

//    A shop will give discount of 10% if the of purchased quantity is more than 1000.
//    Ask user for quantity.

    static void Quantity(){
        Scanner s = new Scanner(System.in);


        System.out.println("How much are you buying?");
       int quantity = s.nextInt();


        if (quantity > 1000){
            System.out.println("You have received a 10% discount on your purchase of " +quantity);
        }
        else
        {
            System.out.println("You are not eligible for discount");
        }
    }

    public static void main(String[] args) {
        Quantity();
    }
}
