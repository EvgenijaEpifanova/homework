package by.epifanova;

public class task15 {
    public static void main(String[] args) {
        int s=0;

        int marks[]= new int[9];
        for(int i = 0;i<9;i++){
            s++;
            marks[i]=(int)(Math.random()*10);
            System.out.println("Ученик № " + s +" "+ marks[i]);
        }

        int maxMark= marks[0];

        int i;
        int max = 0;

        for (i=0;i<marks.length; i++) {
            if (maxMark < marks[i]) {
                maxMark = marks[i];
                max = i;

            }
        }
        System.out.println("максимальная оценка = "+ maxMark + ", индекс ученика = " + max);


        int f;
        int min = 0;

        for (f=0;f<marks.length; f++) {
            if (maxMark > marks[f]) {
                maxMark = marks[f];
                min = f;
            }
        }
        System.out.println("мin оценка = "+ maxMark + ", индекс ученика = " + min);

        int total = 0;
        for (int k = Math.min(min, max)+1; k < Math.max(min, max); ++k) {
            total += marks[k];


        }
        System.out.println(total);
    }
}