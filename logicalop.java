public class logicalop {

    public static void log (){

        boolean a = true;
        boolean b = false;

        System.out.println("a && b ="+(a && b));
        System.out.println("a || b ="+(a || b));
        System.out.println("!(a && b) ="+!(a && b));
    }

    public static void main(String[] args) {

        log();
    }
}
