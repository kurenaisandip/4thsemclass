class forPresentation {



    static void checkAge(int age){
        if(age < 18 ){
            throw new ArithmeticException("Access denied- You are less than 18 years ols.");
        }
        else
        {
            System.out.println("Access granted");
        }
    }

    public static void main(String[] args) {
        checkAge(15);
    }





}