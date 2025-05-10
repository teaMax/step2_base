package topic2_Variables.task3_SwapValues;

public class SwapValues {
    public static void main(String[] args) {
        int i = 12;
        int j = 144;
        System.out.println("Значение переменных i и j до swap'a. Значение i: " + i + " Значение j: " + j);
        int temp_var;
        temp_var = i;
        i = j;
        j = temp_var;
        System.out.println("Значение переменных i и j после swap'a. Значение i: " + i + " Значение j: " + j);
    }
}
