package by.epifanova;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число ");
        int x = (int) scanner.nextLong();
        double fac;
        fac = 1;
        for (int i = 1; i <x; i ++){
            if (i<=171) {
                fac = fac * i;
                System.out.println(fac);
            }
            else if (i>171) {
                System.out.println("нельзя");
            }

        }


    }
}
