public class sum {

    static void add(){

        try{
            int a = 5;
            int b = 1;
            System.out.println((a/b));
        }
        catch (ArithmeticException e){
            System.out.println("catch");
        }
        finally {
            System.out.println("Finally");

        }


    }

    public static void main(String[] args) {
        add();
    }

}
