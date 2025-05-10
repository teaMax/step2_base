package topic5_Arrays.task1_CountOccurrences;

public class CountOccurrences {
    public static void main(String[] args) {
        int[] array = {1, 2, 3 , 4, 5, 6, 6, 5, 5};
        int count5 = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == 5) {
                count5++;
            }
        }
        System.out.println(count5);
    }
}

