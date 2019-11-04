package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Naira";
        names[1] = "Nurkyz";
        names[2] = "Naima";
        for (int i = 0; i <= names.length + 1; i++) {
            switch (i) {
                case 1:
                    System.out.println("Доброе утро!!!");
                    break;
                case 2:
                    System.out.println("Добрый день!!!");
                    break;
                case 3:
                    System.out.println("Добрый вечер!!!");
                    break;
                case 4:
                    System.out.println("Доброй ночи!!!");
                    break;
                default:
                    System.out.println("Здравствуйте!!!");
                    break;
            }
        }
        names = Arrays.copyOf(names, names.length + 1);
        names[3] = "Syimyk";
    }
}
