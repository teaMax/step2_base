package topic7_Methods.task4_MinMaxFinder;

import java.util.Arrays;

public class MinMaxFinder {
    public static void main(String[] args) {
        int[] array = {1, 2, 3 , 4, 5, 6, 6, 5, 5, 3, 1};
        System.out.println(Arrays.toString(findMinMax(array)));
    }

    static int[] findMinMax(int[] numbers) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;;
        for(int elem : numbers) {
            if(elem >= max) {
                max = elem;
            }
            if(elem <= min) {
                min = elem;
            }
        }
        return(new int[] {min, max});
    }
}
