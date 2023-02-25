package FIleHandling;
import java.io.FileWriter;
import java.io.IOException;


public class WriteInFile {

    static void writeFiles()  {


        try {
            FileWriter fw = new FileWriter("Write.txt");

                fw.write("Hello from java");
                fw.close();

            } catch (IOException e)
        {
//                throw new RuntimeException(e);
            e.printStackTrace();
            }

        }

    public static void main(String[] args) {

        writeFiles();
    }
    }


