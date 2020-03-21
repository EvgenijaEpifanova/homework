package by.epifanova;

public class task14 {
    public static void main(String[] args) {

        int marks[]= {6,4,2,7,1,5};
        int maxMark =  marks[0];
        int i;
        int max = 0;

        for (i=0;i<marks.length; i++) {
            if (maxMark < marks[i]) {
                maxMark = marks[i];
                max = i;

            }
        }
        System.out.println("максимальная оценка = "+ maxMark + ", индекс ученика = " + max);
    }

}
