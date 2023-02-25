package three;

public class Student {
//
//    assign and print the roll number, phone number and address of two students having names "sam" and "John" respectively by creating the objects of class "Student"

    static String name;
    static int roll_no;
    static int phone_no;
    static String address;


    public Student(String s, int r,int p, String a){
        this.name = s;
        this.roll_no = r;
        this.phone_no = p;
        this.address = a;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Sam", 12, 98213123,"USA");
        System.out.println(s1.name+ s1.roll_no+  s1.phone_no+ s1.address );

        Student s2 = new Student("John", 12, 98213123,"USA");
        System.out.println(s2.name+ s2.roll_no+  s2.phone_no+  s2.address );
    }

}
