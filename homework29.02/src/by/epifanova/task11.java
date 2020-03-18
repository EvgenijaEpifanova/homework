package by.epifanova;

import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {

        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int a;
        for (a = 2; a < i; a++) {
            if (i % a == 0) {
                System.out.println("составное");
                return;
            }

        }
        System.out.println(" простое ");

    }
}
