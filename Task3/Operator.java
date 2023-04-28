package Task3;

public class Operator {
    public void check() {
        int m = 5;
        int n = 10;
        int number = 100;
        if (n < number && m < number){
            System.out.println("True");
        } else if (n == number || m == number) {
            System.out.println("False");
        }
        if (n > number || m > number) {
            System.out.println("False");
        } else if (m < n && n < number) {
            System.out.println("True");
        }
    }

    public static void main(String[] args) {
        Operator check = new Operator();
        check.check();
    }
}


