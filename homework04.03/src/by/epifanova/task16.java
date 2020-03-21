package by.epifanova;

public class task16 {

    public static void main(String[] args) {

        int i;
        int n = 4;
        int ran[] = new int[n];
        System.out.println("Массив");


        for (i = 0; i < n; i++) {
            ran[i] = (int) (Math.random() * 10);

            System.out.print(" " + ran[i]);
        }
        System.out.println("\n");
        System.out.println("Перевернутый массив ");

        for (i = 0; i < n / 2; i++) {
            int z = ran[i];
            ran[i] = ran[n - 1 - i];
            ran[n - 1 - i] = z;

        }

        for (i = 0; i < n; i++) {
            System.out.print(" " + ran[i]);
        }
    }
}
