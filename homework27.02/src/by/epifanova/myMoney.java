package by.epifanova;

import java.util.Scanner;

public class myMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите цифру: ");
        int m = scanner.nextInt();

        {
            if (m == 1 | m % 10 == 1){
                {
                    if (m == 11)
                        System.out.println(m + "рублей");
                    else
                        System.out.println(m + "рубль");
                }

            } else if (m == 2 | m == 3 | m == 4 | m % 10 == 2 | m % 10 == 3 | m % 10 == 4) {
                {
                    if ( m == 12 | m == 13 | m == 14)
                        System.out.println(m + "рублей");
                    else
                        System.out.println(m + "рубля");
                }
            } else if (m % 10 == 0|m%10==5| m%10==6|m%10==7|m%10==8|m%10==9) {
                System.out.println(m + "рублей");
            } else {
                System.out.println("недочёт");
            }
        }
    }
}
