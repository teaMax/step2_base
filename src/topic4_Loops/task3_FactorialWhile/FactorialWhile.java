package topic4_Loops.task3_FactorialWhile;

public class FactorialWhile {
    public static void main(String[] args) {
        int n = 5;
        int factorial = 1;

        while(n > 1) {
            factorial *= n;
            n--;
        }
        System.out.println(factorial);
    }

}
