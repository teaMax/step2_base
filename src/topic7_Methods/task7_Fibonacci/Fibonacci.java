package topic7_Methods.task7_Fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }

    public static int fibonacci(int n) {
        if(n <= 2) return 1;

        int[] fibonacciArr = new int[n];
        fibonacciArr[0] = 0;
        fibonacciArr[1] = 1;

        int counter = 2;
        while(counter < n) {
            fibonacciArr[counter] = fibonacciArr[counter - 1] + fibonacciArr[counter - 2];
            counter++;
        }
        return fibonacciArr[n - 1];
    }
}
