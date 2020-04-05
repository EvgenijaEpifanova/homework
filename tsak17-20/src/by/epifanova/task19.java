package by.epifanova;

import java.util.Scanner;

public class task19 {
    public static void main(String[] args) {

        Scanner text = new Scanner(System.in);

        System.out.println("Введите слова одной строкой ");
        String input = text.nextLine();
        input = input.trim();

        int c = 0;

        
        if(input.length() != 0){
            c++;

            for (int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == ' '){
                    //Если пробел - увеличиваем количество слов на 1
                    c++;
                }
            }
            for(int i=0;i< input.length();i++){
                if(input.charAt(i)==',')
                    c++;
            }

        }

        System.out.println("Вы ввели "+ c + "слов(a)");
    }
}
