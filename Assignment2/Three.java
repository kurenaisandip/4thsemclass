package Assignment2;

public class Three {

//    WAP to find the square of the number 3.9

    public void square(){
        double n = 3.9;

//        finding the square number
            double sq = n * n;

        System.out.println("Square number is: " +sq);
    }

    public static void main(String[] args) {
        Three lsa = new Three();
        lsa.square();
    }
}
