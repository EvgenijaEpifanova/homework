package by.epifanova;

public class task9 {
    public static void main(String[] args) {


        int max[] = new int[5];

        max[0]= (int) (Math.random()*20);
        System.out.println(max[0]);
        max[1]= (int) (Math.random()*20);
        System.out.println(max[1]);
        max[2]= (int) (Math.random()*20);
        System.out.println(max[2]);
        max[3]= (int) (Math.random()*20);
        System.out.println(max[3]);
        max[4]= (int) (Math.random()*20);
        System.out.println(max[4]);

        int max1 = max[0];
        for (int i = 0; i < max.length; i++){
            if (max1 < max[i])
                max1=max[i];
        }
        System.out.println(max1);
    }
}
