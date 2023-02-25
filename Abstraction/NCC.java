package Abstraction;

public class NCC extends Bank{

    @Override
    float rateofInterest() {
        return 5.5f;
    }

    public static void main(String[] args) {
        NCC a = new NCC();
        System.out.println( "Rate of Interest rate in NCC Bank is:" +a.rateofInterest());
    }


}
