package vn.cmc;

public class App {
    public static String greeting() {
        return "Hello Jenkins!";
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(greeting());
    }
}
