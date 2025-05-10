package topic7_Methods.task7_Fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }

    static int fibonacci(int n) {
        if(n <= 2) return 1;
        return(fibonacci(n-2) + fibonacci(n-1));
    }
}
