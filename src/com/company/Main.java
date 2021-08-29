package com.company;

import java.util.Random;

public class Main {

    public static String canGoOutside(int age, int temp) {
        String humanCanGoOutside = "Нет";

        if (age >= 20 && age <= 45) {
            if (temp >= -20 && temp <= 30) {
                humanCanGoOutside = "Да";
            }
        }

        if (age > 0 && age < 20) {
            if (temp >= 0 && temp <= 28) {
                humanCanGoOutside = "Да";
            }
        }

        if (age > 45) {
            if (temp >= -10 && temp <= 25) {
                humanCanGoOutside = "Да";
            }
        }
        return humanCanGoOutside;
    }

    public static void main(String[] args) {
        System.out.println("Может ли человек выйти погулять?");
        System.out.println(canGoOutside(11, -11));

        System.out.println("Может ли человек выйти погулять?");
        System.out.println(canGoOutside(25, 30));

        System.out.println("Может ли человек выйти погулять?");
        System.out.println(canGoOutside(18, 7));

        System.out.println("Может ли человек выйти погулять?");
        System.out.println(canGoOutside(67, 28));

        System.out.println("Может ли человек выйти погулять?");
        System.out.println(canGoOutside(63, -10));

        System.out.println(generateRandomAge());
    }

    // Задание на сообразительность

    public static boolean generateRandomAge() {
        Random random = new Random();
        int minAge = 1;
        int maxAge = 60;
        int randAge = minAge + (int) (Math.random() * ((maxAge - minAge) + 1));

        int minTemp = -25;
        int maxTemp = 40;
        int randTemp = minTemp + (int) (Math.random() * ((maxTemp - minTemp) + 1));

        System.out.println("age random: " + randAge);
        System.out.println("temp random: " + randTemp);

        System.out.println("Можно ли гулять?: (если строка ниже пуста, значит нет)");

        return false;
    }

}
