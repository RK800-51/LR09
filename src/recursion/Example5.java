package recursion;

public class Example5 {
    public static void main(String[] args) {
        System.out.println(fib(5));
    }
    public static int fib(int n) {
        if (n == 0) {
            System.out.println(n);
            return 0;
        }
        if (n == 1) {
            System.out.println(n);
            return 1;
        }
        else {
            System.out.println(n);
            return fib(n-2) + fib(n-1);
        }
    }
}
