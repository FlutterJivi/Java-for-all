package StaticInJava;

class Calculator{
   static int number = 9;
    static int add(int a, int b){
        return a+b;

    }

    static double square(double a){
        return a*a;
    }
}

public class Static2 {
    public static void main(String[] args) {
        int result = Calculator.add(1,2);
        System.out.println(result);
        System.out.println(Calculator.number);
    }
}
