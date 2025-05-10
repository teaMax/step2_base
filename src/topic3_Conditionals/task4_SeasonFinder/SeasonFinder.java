package topic3_Conditionals.task4_SeasonFinder;

import java.util.Scanner;

public class SeasonFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер месяца: ");
        int numMonth = scanner.nextInt();
        String season;
        switch (numMonth) {
            case 1:
            case 2:
            case 12:
                season = "Зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "Весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "Лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "Осень";
                break;
            default:
                season = "";
                break;
        }

        System.out.println("Сезон: " + season);
    }
}
