package topic7_Methods.task1_AverageCalculator;

public class AverageCalculator {
    public static void main(String[] args) {
        double[] elems = { 1.3, 1.9, 3.0, 4.0};
        System.out.println(getAverage(elems));
    }

    static double getAverage(double[] numbers){
        double average = 0;
        double sum = 0;
        for(double elem : numbers) {
            sum += elem;
        }
        average = sum / numbers.length;
        return average;
    }
}
