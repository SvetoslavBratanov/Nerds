package bg.softuni.nerds;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, nerds!");
        System.out.print(sum(4, 3));
        System.out.println(divide(12, 5));
    }

    public static double divide(double a, double b){
        return a/b;
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
