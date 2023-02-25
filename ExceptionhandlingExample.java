import java.util.*;
public class ExceptionhandlingExample {

    public void display(){

        try{
            Scanner s = new Scanner(System.in);

            System.out.println("Enter the first integer");
            int a = s.nextInt();

            System.out.println("Enter the second integer");
            int b = s.nextInt();


            int c = b / a;

            System.out.println("Result is: "+c);
        }
        catch (ArithmeticException e){
          //  e.printStackTrace();
            System.out.println("Cannot be dived by zero");
        }
        finally{
            System.out.println("This will always executes");
        }
    }

    public static void main(String[] args) {
        ExceptionhandlingExample ee = new ExceptionhandlingExample();
        ee.display();





    }

}
