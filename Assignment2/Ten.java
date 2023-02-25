package Assignment2;

public class Ten {
//    WAP to print the names of students by creating a Student class.
//    If no name is passed while creating an object of Student class, then the name should be "Unknown"
//    Otherwise the name should be equal to the string value while creating object of student class.


    public Ten(String s) {
        System.out.println(s);
    }
    public Ten() {
        System.out.println("unknown");
    }

    public static void main(String[] args) {
        Ten s = new Ten("Sandip");
        Ten s1 = new Ten();
    }

}
