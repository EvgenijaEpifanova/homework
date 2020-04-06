package by.epifanova;

public class task14 {
    public static void main(String[] args) {

        int s=0;

        int marks[]= new int[9];
        for(int i = 0;i<9;i++){
            s++;
            marks[i]=(int)(Math.random()*10);
            System.out.println("Ученик № " + s +" "+ marks[i]);
        }
        int maxMark =  marks[0];
        int i;
        int max = 0;

        for (i=0;i<marks.length; i++) {
            if (maxMark < marks[i]) {
                maxMark = marks[i];
                max = i;

            }
        }
        System.out.println("максимальная оценка = "+ maxMark + ", индекс ученика = " + max + ", номер ученика = "+s);
    }

}
