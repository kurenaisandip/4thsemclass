package Assignment2;

public class Two {

//    WAP to assign a value of 100.235 to a double variable and then
//    convert it to int

    public void change(){
        double a = 100.235;
        int b = (int) a;
//        Manual casting double to int

        System.out.println("Double is:" +a);
        System.out.println("Int is:" +b);
    }


    public static void main(String[] args) {

        Two asd = new Two();
        asd.change();

    }

}
