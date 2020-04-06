package by.epifanova;

public class task12a {
    public static void main(String[] args) {
        int i = 20623143;
        int x1 = i%1000;
        int x2;
        x2 = (i/1000) %1000;
        int x3;
        x3= (i/1000000) %1000;
        System.out.println(x3 + " " + x2 + " " + x1);

    }
}
