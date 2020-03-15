package by.epifanova;

import java.util.Scanner;

class HelloWorld {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите цифру: ");
        int s = scanner.nextInt();

        int sec, m,min,h,hour, d,w,week;
        sec =  (s%60);
        m=  ((s-sec)/60);
        min=  (m%60);
        h =  ((m-min)/60);
        hour =  (h%24);
        d=((h-hour)/24);
        week=(d%7);
        w=(d-week);
        System.out.println(w + " недель " + d + " дней " + hour + " часов " + min + " минут " + sec + " секунд " );
    }
}
