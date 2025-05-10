package topic3_Conditionals.task2_AgeCategory;

import java.util.Scanner;

public class AgeCategory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите возраст человека: ");
        int age = scanner.nextInt();

        if(age < 13) {
            System.out.println("Ребенок");
        } else if(age <= 19) {
            System.out.println("Подросток");
        } else if(age <= 64 ) {
            System.out.println("Взрослый");
        } else {
            System.out.println("Пожилой");
        }
    }
}
