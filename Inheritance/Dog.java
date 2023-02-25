package Inheritance;

public class Dog extends Animal{

    public void dogsound(){
        System.out.println("bark");
    }

    public static void main(String[] args) {

        Dog a = new Dog();
        a.sound();
        a.dogsound();
        a.dogsound();
    }
}
