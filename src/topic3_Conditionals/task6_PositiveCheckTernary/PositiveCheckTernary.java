package topic3_Conditionals.task6_PositiveCheckTernary;

import java.util.Scanner;

public class PositiveCheckTernary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int num = scanner.nextInt();

        String isPositive = (num > 0) ? "Положительное" : "Нулевое или отрицательное";
        System.out.println("Число " + num + " " + isPositive);
    }
}
