package topic4_Loops.task6_FactorialFor;

public class FactorialFor {
    public static void main(String[] args) {
        int result = 1;
        int factorial = 10;
        for(int i = 1; i <= factorial; i++) {
            result *= i;
        }

        System.out.println(result);
    }
}
