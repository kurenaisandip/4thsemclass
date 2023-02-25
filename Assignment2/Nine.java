package Assignment2;

import java.util.Scanner;

public class Nine
{
//    WAP to find a factorial of number

 static void factorial(){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter number");
    int a = s.nextInt();
    int fact = 1;
//    int i;
    for (int i = 1; i <= a; i++ ){
        fact = fact * i;
    }
    System.out.println("The factorial of a given number is:" +fact);

}

    public static void main(String[] args) {

     factorial();
    }




}
