package five;

public class Employee {

//    Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
//    Name        Year of joining             Address
//    Robert       1994                       64C-WallsStreet
//    Sam          2000                       68D-WallsStreet
//    John         1999                       26B-WallsStreet


        String name;
        int yearOfJoining;
        String address;


        Employee(String name, int yearOfJoining, String address) {
            this.name = name;
            this.yearOfJoining = yearOfJoining;
            this.address = address;
        }

    public static void main(String[] args) {
        Employee e1 = new Employee("Robert", 1994, "64C-WallsStreet");
        Employee e2 = new Employee("Sam", 2000, "68D-WallsStreet");
        Employee e3 = new Employee("John", 1999, "26B-WallsStreet");

        System.out.println("Name\t\tYear of joining\t\tAddress");
        System.out.println(e1.name + "\t\t" + e1.yearOfJoining + "\t\t" + e1.address);
        System.out.println(e2.name + "\t\t" + e2.yearOfJoining + "\t\t" + e2.address);
        System.out.println(e3.name + "\t\t" + e3.yearOfJoining + "\t\t" + e3.address);
    }
}






