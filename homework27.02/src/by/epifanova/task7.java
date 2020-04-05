package by.epifanova;

import java.util.Scanner;

import static java.lang.Math.max;

public class task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите a: ");
        int a = scanner.nextInt();

        System.out.print("Введите b: ");
        int b = scanner.nextInt();

        System.out.print("Введите c: ");
        int c = scanner.nextInt();

        System.out.print("Введите d: ");
        int d = scanner.nextInt();

        System.out.print("Введите e: ");
        int e = scanner.nextInt();

        System.out.print("Введите f: ");
        int f = scanner.nextInt();

        //int a=1,b=3,c=3,d=1,e=2,f=3;

        if (e >= f) {
            if (c >= d && a < b) {
                if (c <= e && b <= e && (d + a) <= f)
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
            else if (c < d && a >= b) {
                if (d <= e && a <= e && (c + b) <= f)
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
            else if (c < d && a < b) {
                if (d <= e && b <= e && (c + a) <= f)
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
            else if (c >= d && a >= b) {
                if (c <= d && a <= e && (d + b) <= f)
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
        }
        else if (e < f) {
            if (c < d && a >= b) {
                if (d <= f && a <= f && (c + b) <= e)
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
            else if (c >= d && a >= b) {
                if (c <= f && a <= f && (d + b) <= e)
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
            else if (c >= d && a < b) {
                if (c <= f && b <= f && (d + a) <= e)
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
            else if (c < d && a < b) {
                if (d <= f && b <= f && (c + a) <= e)
                    System.out.println  ("Yes");
                else
                    System.out.println("No");
            }
        }
    }



}
