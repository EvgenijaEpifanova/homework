package by.epifanova;

import static java.lang.Math.max;

public class twoHouses {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        int c = 3;
        int d = 6;
        int e = 12;
        int f = 14;
        {
            if( (e > (a + c + 1)) & (f > max(b, d))) {
            System.out.println("yes");
        } else System.out.println("no");

        }
    }


}
