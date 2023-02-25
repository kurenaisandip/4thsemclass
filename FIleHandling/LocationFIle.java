package FIleHandling;

import java.io.*;

public class LocationFIle {

    static void main(){

        File file = new File("C:\\Users\\Jiwan\\IdeaProjects\\College\\Write.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String readFile;
            while ((readFile = br.readLine()) != null){
                System.out.println(readFile);
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) {
        main();
    }
}
