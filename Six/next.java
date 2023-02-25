package Six;

import java.util.Scanner;

public class next extends Average{



    next(int num1, int num2, int num3) {  // num 3 is the argument of constructer in Average class
        super(num1, num2, num3);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        next n = new next(a, b, c);
        n.average();


    }
}
