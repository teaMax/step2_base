package topic7_Methods.task2_EvenNumbersArray;

import java.util.Arrays;

public class EvenNumbersArray {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(Arrays.toString(getEvenNumbers(n)));
    }

    static int[] getEvenNumbers(int n) {
        int[] array = new int[n];
        for(int i = 0; i < n; i++) {
            array[i] = (i + 1) * 2;
        }
        return array;
    }
}
