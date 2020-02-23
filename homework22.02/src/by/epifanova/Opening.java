package by.epifanova;

public class Opening {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c2 = (a * a) + (b * b);
        int c1 = (int) Math.sqrt(c2);
        int r = 32;
        if (r>=c1)
            System.out.println("можно");
        else
            System.out.println("нельзя");
    }
}
