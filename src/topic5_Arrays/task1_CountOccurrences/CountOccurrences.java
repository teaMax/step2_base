package topic5_Arrays.task1_CountOccurrences;

public class CountOccurrences {
    public static void main(String[] args) {
        int[] array = {1, 2, 3 , 4, 5, 6, 6, 5, 5};
        int countFive = 0;
        for(int elem : array) {
            if(elem == 5) {
                countFive++;
            }
        }
        System.out.println(countFive);
    }
}

