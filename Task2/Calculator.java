package Task2;

public class Calculator {
    static int sum(int a,int b){
        return a + b;
    }
    static int multiply(int c, int d){
        return c*d;
    }

    public static void main(String[] args) {
        int x = sum(5, 7);
        System.out.println(x);
        int y = multiply(2,5);
        System.out.println(y);
    }
}
