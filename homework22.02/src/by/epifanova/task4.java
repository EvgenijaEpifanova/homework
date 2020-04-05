package by.epifanova;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длинну прямоугльника: ");
        int a = scanner.nextInt();
        System.out.print("Введите ширину прямоугльника: ");
        int b = scanner.nextInt();
        System.out.print("Введите радиус круга: ");
        int r = scanner.nextInt();
        int c2 = (a * a) + (b * b);
        int c1 = (int) Math.sqrt(c2);

        if (r>=c1)
            System.out.println("можно");
        else
            System.out.println("нельзя");
    }
}
