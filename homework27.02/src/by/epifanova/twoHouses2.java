package by.epifanova;

import static java.lang.Math.max;

public class twoHouses2 {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        int c = 3;
        int d = 6;
        int e = 12;
        int f = 14;

        {
            if( (f > (b + d + 1)) & (e > max(a, c))) {
                System.out.println("yes");
            } else System.out.println("no");

        }


    }
}
