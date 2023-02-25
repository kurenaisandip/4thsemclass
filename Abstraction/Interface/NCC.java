package Abstraction.Interface;

public class NCC implements Bank{
    @Override
    public int getRateofInterest() {
        return 15;
    }

    public static void main(String[] args) {
        NCC a = new NCC();
        System.out.println("The interest rate is:" +   a.getRateofInterest());
    }


}
