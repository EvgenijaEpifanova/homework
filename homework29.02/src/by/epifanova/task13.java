package by.epifanova;

public class task13 {
    public static void main(String[] args) {
        int x;
        for (x=1;x<=100;x++){
            if(x%x!=0 & x%1!=0 ){
                break;


            }
            System.out.println(x+"простое");

        }
    }
}
