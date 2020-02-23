package by.epifanova;

class HelloWorld {

    public static void main(String[] args) {
        int s = 999999999;
        int sec, m,min,h,d,day,w,week;
        sec=  (s%60);
        m=  ((s-sec)/60);
        min=  (m%60);
        h =  ((m-min)/60);
        day =  (h%24);
        d=((h-day)/24);
        week=(d%7);
        w=((d-week)/7);
        System.out.println("sec "+s+ " min "+m+ " h "+h+  " d " +d+ " w "+w );
    }
}
