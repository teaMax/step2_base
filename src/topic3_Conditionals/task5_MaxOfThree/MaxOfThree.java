package topic3_Conditionals.task5_MaxOfThree;

import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 числа");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int max = 0;

        if(num1 >= num2 && num1>= num3) {
            max = num1;
        } else if(num2 >= num1 && num2>= num3) {
            max = num2;
        } else if(num3 >= num2 && num3 >= num1) {
            max = num3;
        }

        System.out.println("Наибольшее число: " + max);
    }
}
