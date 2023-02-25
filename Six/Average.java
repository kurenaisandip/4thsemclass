package Six;

public class Average {

//    Print the average of three numbers entered by user by creating a class named 'Average' having a method to calculate and print the average Using Super keyword.


    int a, b, c;

    Average(int num1, int num2, int num3) {
        this.a = num1;
        this.b = num2;
        this.c = num3;
    }

    void average() {
        int avg = (a + b + c) / 3;
        System.out.println("Average of three numbers is: " + avg);
    }
    }


