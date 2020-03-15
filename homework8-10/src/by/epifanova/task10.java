package by.epifanova;

public class task10 {
    public static void main(String[] args) {


        int n = 325;
        int n100 = 325 / 100;
        int n10 = (325 - n100 * 100) / 10;
        int n1 = (325 - n100 * 100) % 10;
        int sum = n100 + n10 + n1;
        System.out.println( sum);

    }
}