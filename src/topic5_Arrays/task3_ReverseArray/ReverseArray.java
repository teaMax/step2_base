package topic5_Arrays.task3_ReverseArray;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3 , 4, 5, 6, 6, 5, 5, 3, 1};
        for(int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
