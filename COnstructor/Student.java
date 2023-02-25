package COnstructor;

public class Student {

    private String name;
    private int age;

//   public Student() {
//     this.name = "Unknown";
//     this.age = 0;
//   }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
    public static void main (String[] args) {
        Student s = new Student("Sandip", 23);
        s.printDetails();
    }
}
