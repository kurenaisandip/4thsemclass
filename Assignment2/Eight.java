package Assignment2;

import java.util.Scanner;

public class Eight {

//    WAP to find the greatest common divisor (GCD) or highest common factor (HCF)
//    of given two numbers.

    static void GCD() {

     int a = 15;
     int b = 20;
     int gcd = 1;

     for (int i = 1; i <= a && i <= b; i++ ){
         if (a % i == 0 && b % i == 0 )
         {
             gcd = i;
         }

         System.out.println("GCD is " +gcd);
     }


    }

    public static void main(String[] args) {

        GCD();
    }

}
