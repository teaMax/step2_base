package topic5_Arrays.task2_ArrayAverage;

public class ArrayAverage {
    public static void main(String[] args) {
        int[] array = {1, 2, 3 , 4, 5, 6, 6, 5, 5, 3, 1};
        double res = 0;
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        res = (double)sum / array.length;
        System.out.println(res);
    }
}
