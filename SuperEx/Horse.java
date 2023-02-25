package SuperEx;

public class Horse extends Animal{

public Horse(){
    super();
    System.out.println("calling from child");
}

public void dogsound(){

    // calling the parent class method
    super.sound();
    System.out.println("Bark");



}

    public static void main(String[] args) {
        Horse h = new Horse();
        h.dogsound();

    }
}
