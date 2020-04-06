package by.epifanova;

import java.awt.*;
import java.util.Scanner;

public class task20 {
    public static void main(String[] args) {
        String s = "программируем на Java c февраля";

        s = s.replaceAll("[!.,:;-]", "");

        String[] words = s.split(" ");
        StringBuilder s1 = new StringBuilder();

        for(String word : words) {
            s1.append(word.charAt(word.length()-1));
        }

        System.out.println(s1);
    }
}
