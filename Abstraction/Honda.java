package Abstraction;

public class Honda extends Bike{

    @Override
     void displayColor() {
        System.out.println("Whats your color of bugatti ?");
    }


    public static void main(String[] args) {
        Honda h = new Honda();
        h.displayColor();
        h.displayName();
    }

}
