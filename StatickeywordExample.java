public class StatickeywordExample {

    // static variable
    static int a = 5;

    public void display1(){
        // cannot access the static variable
        // because local vaiable cannot access static variable
        System.out.println("Non Static");
    }

    static void display(){
        a = 6;
        System.out.println("This is static method." + a);

    }


    public static void main(String[] args) {
       // System.out.println(a);
        StatickeywordExample sc = new StatickeywordExample();
        sc.display1();

//        display();
        //we can use this to call static method
        StatickeywordExample.display();
    }
}
