package topic3_Conditionals.task3_DayOfWeek;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер дня недели: ");
        int numDay = scanner.nextInt();
        String nameDay;
        String typeDay;

        switch (numDay) {
            case(1):{
                nameDay = "Понедельник";
                break;
            }
            case(2):{
                nameDay = "Вторник";
                break;
            }
            case(3):{
                nameDay = "Среда";
                break;
            }
            case(4):{
                nameDay = "Четверг";
                break;
            }
            case(5):{
                nameDay = "Пятница";
                break;
            }
            case(6):{
                nameDay = "Суббота";
                break;
            }
            case(7):{
                nameDay = "Воскресенье";
                break;
            }
            default:
                nameDay = "";
        }
        if(1 <= numDay  && numDay<= 5) {
            typeDay = "Рабочий день";
        } else if(numDay == 6 || numDay == 7) {
            typeDay = "Выходной";
        } else {
            typeDay = "";
        }

        System.out.println("Номер дня: " + numDay + " называется " + nameDay + " и является " + typeDay);
    }
}
