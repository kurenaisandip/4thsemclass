import java.util.Scanner;

public class Iifelse {

    public void Ifelse(){
//         int a = 5;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number:");
        int a = s.nextInt();
         if (a > 5){
             System.out.println("True");
         }
         else {
             System.out.println("False");
         }
    }

    public static void main(String[] args) {
        Iifelse a = new Iifelse();
        a.Ifelse();
    }
}
