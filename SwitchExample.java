import java.util.Scanner;

public class SwitchExample {

    public static void asd(){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the name of the day:");
        String days = s.nextLine();


        switch (days){
            case "Sunday":
                System.out.println("It is Sunday.");
                break;

            case "Monday":
                System.out.println("It is Monday.");
                break;

            case "Tuesday":
                System.out.println("It is Tuesday.");
                break;

            case "wednesday":
                System.out.println("It is wednesday.");
                break;

            case "thursday":
                System.out.println("It is thursday.");
                break;

            case "friday":
                System.out.println("It is friday. ");
                break;

            case "Saturday":
                System.out.println("It is Friday");
                break;

            default:
                System.out.println("Please enter the correct days");
                break;
        }
    }


    public static void main(String[] args) {

        asd();

    }
}
