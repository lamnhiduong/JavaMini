package Task1;

public class Information {
    public static int quantity = 500;
    public int publish = 2023;
    public void on(){
        System.out.println("Publish: " +publish);
    }

    public static void main(String[] args) {
        String cost = "free";
        System.out.println("Cost: " +cost);
        System.out.println("Quantity of book: " +quantity);
        Information pub = new Information();
        pub.on();
    }
}

