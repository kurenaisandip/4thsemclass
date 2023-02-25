import java.util.Scanner;

public class one {

//    WAP to convert temperature from fahrenheit to celsius degree

    static void convertion(){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a degree: ");
        double f = s.nextDouble();

        double c = (f - 32) * 5 / 9;

        System.out.println( +c);
    }

    public static void main(String[] args) {
        convertion();
    }
}
