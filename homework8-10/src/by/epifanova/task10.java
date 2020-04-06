package by.epifanova;

import java.util.Scanner;

public class task10 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(" введите число");
            int k  = (int) scanner.nextLong();
            int x =k;
            int sum = 0;
            while (x != 0 ){
                sum +=x%10;
                x /=10;
            }
            System.out.println(sum);
        }


}