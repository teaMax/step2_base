package topic4_Loops.task6_FactorialFor;

public class FactorialFor {
    public static void main(String[] args) {
        int factorial = 1;
        for(int i = 1; i <= 10; i++) {
            factorial *= i;
        }

        System.out.println(factorial);
    }
}
