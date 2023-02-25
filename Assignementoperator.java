public class Assignementoperator {

    public void ao(){
        int a = 5;
        int b = 6;
        int c = 7;
        int d = 8;
        int e = 13;

        a+= 10;
        b-= 4;
        c*= 5;
        d/= 4;
        e%= 10;

        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("d = "+d);
        System.out.println("e = "+e);

    }

    public static void main(String[] args) {
        Assignementoperator ad = new Assignementoperator();
        ad.ao();
    }
}
