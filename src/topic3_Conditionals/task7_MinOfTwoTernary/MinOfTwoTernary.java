package topic3_Conditionals.task7_MinOfTwoTernary;

import java.util.Scanner;

public class MinOfTwoTernary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int max = (num2 > num1) ? num2 : num1;
        System.out.println("Максимальное число: " + max);
    }
}
