package by.epifanova;

public class task14 {
    public static void main(String[] args) {

        int marks[]= new int[3];
        int maxMark =  marks[0];
        int i;
        marks[0]=1;
        marks[1]=6;
        marks[2]=2;
        for (i=0;i<marks.length; i++) {
            if (maxMark < marks[i])
            maxMark = marks[i];
            System.out.println(maxMark);

        }
        for (i =0; i<3;i++) {
            System.out.println("ученик" + i + "=" + marks[i]);
        }
    }

}
