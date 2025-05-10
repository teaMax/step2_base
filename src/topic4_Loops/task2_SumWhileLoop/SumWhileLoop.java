package topic4_Loops.task2_SumWhileLoop;

public class SumWhileLoop {
    public static void main(String[] args) {
        int n = 100;
        int sum = 0;
        while(n > 0) {
            sum += n;
            n--;
        }
        System.out.println(sum);
    }
}
