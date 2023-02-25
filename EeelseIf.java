import java.util.Scanner;

public class EeelseIf {

    public void elseif(){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number:");

        int a = s.nextInt();

        if (a<5){
            System.out.println("false");

        }
        else if (a == 5){
            System.out.println("True");
        }
        else {
            System.out.println("don't print");
        }
    }

    public static void main(String[] args) {
        EeelseIf a = new EeelseIf();

        a.elseif();
    }

}
