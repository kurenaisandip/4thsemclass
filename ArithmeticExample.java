import java.util.Scanner;

public class ArithmeticExample {

    public void arithmeticEx(){
//        int a = 5;
//        int b = 5;
//
//
//        int c = a + b;
//        System.out.println("Sum is: " +c);
//        System.out.println("Sum is: " +(a+b));

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number");

        int a = s.nextInt();

        System.out.println("Enter the second number");
        int b = s.nextInt();

        int c = a + b;

        System.out.println("The total is:" +c);


    }

    public static void main(String[] args) {
        ArithmeticExample two = new ArithmeticExample();

        two.arithmeticEx();
    }

}
