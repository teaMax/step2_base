package topic6_ForEachLoops.task1_ForEachPositive;

public class ForEachLoops {
    public static void main(String[] args) {
        int[] array = {1, 2, -3 , 4, 5, -6, 6, 5,-30, 40, 5, 3, 1};
        for(int i: array) {
            if(i > 0) System.out.println(i);
        }
    }
}
