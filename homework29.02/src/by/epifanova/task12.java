package by.epifanova;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        long a = scanner.nextLong();
        System.out.printf("\n" + " " + "%,d", a);
    }
}
