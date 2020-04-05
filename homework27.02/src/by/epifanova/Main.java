package by.epifanova;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите день: ");
        int day = scanner.nextInt();
        System.out.print("Введите месяц: ");
        int month = scanner.nextInt();
        System.out.print("Введите год: ");
        int year = scanner.nextInt();


        int numDays = 0;
        int max = 0;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (day>31) return;
                else {
                    numDays = 31;
                    max = numDays;
                    break;
                }

            case 4:
            case 6:
            case 9:
            case 11:
                if (day>30) return;
                else {
                    numDays = 30;
                    max = numDays;
                    break;
                }

            case 2:
                if(day > 29) return;

                else if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))
                {
                    numDays = 29;
                    max = numDays;
                }
                else
                {
                    numDays = 28;
                    max = numDays;
                }
                break;
            default:
                System.out.println("Несуществующий месяц");
                break;
        }
        System.out.println("Число дней = " + numDays);
        if (day == max && month == 12){
            year = year + 1;
            day = 1;
            month = 1;
        } else if (day == max && month != 12) {
             day = 1;
             month = month + 1;
        } else if (day != max) {
            day = day + 1;
        }

        System.out.println(day);
        System.out.println(month);
        System.out.println(year);
    }

}