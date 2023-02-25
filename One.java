public class One {

    public static void StringExample() {
        String S1 = "Java";
        String S3 = "java";
        String S2 = new String("Java");

        System.out.println(S1.equalsIgnoreCase(S3));
        System.out.println(S1.equals(S3));

    }

    public static void main(String[] args) {
        One stringexample = new One();
        One.StringExample();


    }
}
