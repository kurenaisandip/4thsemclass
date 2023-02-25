package Inheritance;

public class cat extends Dog{

    public void c (){
        System.out.println("meow");
    }

    public static void main(String[] args) {
        cat as = new cat();
        as.dogsound();
        as.sound();
        as.c();
    }

}
