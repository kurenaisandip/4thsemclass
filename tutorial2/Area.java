package tutorial2;

import java.util.Scanner;

public class Area {
    private double length;
    private double breadth;

    // Method to set the dimensions of the rectangle
    public void setDim(double l, double b) {
        length = l;
        breadth = b;
    }


    public double getArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area rect = new Area();

        // Read the length and breadth of the rectangle
        System.out.println("Enter the length of the rectangle: ");
        double l = sc.nextDouble();
        System.out.println("Enter the breadth of the rectangle: ");
        double b = sc.nextDouble();

        // Set the dimensions of the rectangle
        rect.setDim(l, b);

        // Print the area of the rectangle
        System.out.println("Area of the rectangle: " + rect.getArea());
    }
}
