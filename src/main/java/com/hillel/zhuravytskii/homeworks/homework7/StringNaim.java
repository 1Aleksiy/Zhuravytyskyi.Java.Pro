package com.hillel.zhuravytskii.homeworks.homework7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class StringNaim {
    public StringNaim() {
    }

    public static void findSymbolOccurance() {
        String str = "interesting ";
        int j = 0;
        int n = 0;

        while(0 <= j) {
            j = str.indexOf(105, j);
            if (0 <= j) {
                ++j;
                ++n;
            }
        }

        System.out.println("заданий симол зустрічається: " + n);
    }

    public static void findWordPosition() {
        String source = " Apollo";
        String target = "pollo";
        int indexJava = source.indexOf(target);
        if (indexJava == -1) {
            System.out.println(-1);
        } else {
            System.out.println(1);
        }

    }

    public static void stringReverse() {
        String str = "Hello";
        StringBuilder strB = new StringBuilder();
        strB.append(str);
        strB = strB.reverse();
        System.out.println(strB);
    }

    public static void isPalindrome() {
        String myString = "text";
        StringBuffer buffer = new StringBuffer(myString);
        buffer.reverse();
        String data = buffer.toString();
        if (myString.equals(data)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }

    public static void massifWorks() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] words = new String[]{"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", " pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println(Arrays.toString(words));
        int n = random.nextInt(words.length);
        System.out.println(words[n]);
        System.out.println("Компютер загадав слово, спробуй відгадай його");
        char[] chs = words[n].toCharArray();
        char[] chCmp = new char[chs.length];

        for(int i = 0; i < chs.length; ++i) {
            chCmp[i] = '*';
        }

        while(true) {
            System.out.println("Введіть слово(0 exit): ");
            String word = scanner.nextLine();
            if (word.equals(words[0])) {
            }

            if (word.equals(words[n])) {
                System.out.println("Ви вгадали.");
                return;
            }

            System.out.println("Ви не вгадали.");
            char[] chWord = word.toCharArray();

            for(int i = 0; i < chs.length && i < chWord.length; ++i) {
                if (chs[i] == chWord[i]) {
                    chCmp[i] = chs[i];
                }
            }

            System.out.println(String.valueOf(chCmp));
        }
    }

    public static void main(String[] args) {
        findSymbolOccurance();
        findWordPosition();
        stringReverse();
        isPalindrome();
        massifWorks();
    }
}
