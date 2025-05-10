package topic6_ForEachLoops.task3_ForEachSum;

public class ForEachSum {
    public static void main(String[] args) {
        int[] array = {1, 2, 3 , 4, 5, 6, 6, 5, 5, 3, 1};
        int sum = 0;
        for(int elem : array) {
            sum += elem;
        }
        System.out.println(sum);
    }
}
