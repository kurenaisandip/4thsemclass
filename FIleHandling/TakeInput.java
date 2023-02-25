package FIleHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TakeInput {



    static void main(){

        try {

        //    fw.write("Hello ");
            Scanner s = new Scanner(System.in);
            String a = s.nextLine();

            FileWriter fw = new FileWriter("user.txt");
//            PrintWriter fw = new PrintWriter(new FileWriter(log, true));
//            File log = new File("user.txt");
            fw.write(a);
            fw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        main();
    }
}
