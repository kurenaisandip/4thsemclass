package four;

public class Triangle {

    public Triangle(){

    };



    static void calculate(){
        int a = 3;
        int b = 4;
        int c = 5;

        int Perimeter = a + b + c;
        int area = ( b * c )/2;

        System.out.println(Perimeter);
        System.out.println(area);
    }

    public static void main(String[] args) {

        calculate();
    }
}
