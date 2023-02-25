public class ThrowExample {

    static void throwdisplay(int age, int height) throws ArithmeticException{
        if (age < 5 && height < 5 ){
            throw new ArithmeticException("It is not eligible.");
        }
        else {
            System.out.println("Eligible");
        }


    }

    public static void main(String[] args) {

        throwdisplay(3,4);
        // we can also write like this
//        classname.methodname;
//        ThrowExample.throwdisplay();
    }
        }
