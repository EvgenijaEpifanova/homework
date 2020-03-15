package by.epifanova;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите цифру: ");
        int x = scanner.nextInt();
        int b = x % 10;
        if (b==7)
            System.out.println(" в конце семёрочка");
        else
            System.out.println("что-то  в конце не семёрочка");
    }
}