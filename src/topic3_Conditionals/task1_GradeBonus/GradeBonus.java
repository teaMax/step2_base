package topic3_Conditionals.task1_GradeBonus;

import java.util.Scanner;

public class GradeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите оценку: ");
        int grade = scanner.nextInt();

        if(grade == 5) {
            System.out.println("Бонус = 100");
        } else if(grade == 4) {
            System.out.println("Бонус = 75");
        } else if(grade == 3) {
            System.out.println("Бонус = 50");
        } else {
            System.out.println("Бонус = 0");
        }
    }
}
