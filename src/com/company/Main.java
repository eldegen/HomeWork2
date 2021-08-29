package com.company;

import java.util.Random;

public class Main {

    public static void canGoOutside(int age, int temp) {
        if (age >= 20 && age <= 45) {
            if (temp >= -20 && temp <= 30) {

                System.out.println("Можно идти гулять (1 body)");
            }
        }

        if (age > 0 && age < 20) {
            if (temp >= 0 && temp <= 28) {

                System.out.println("Можно идти гулять (2 body)");
            }
        }

        if (age > 45) {
            if (temp >= -10 && temp <= 25) {

                System.out.println("Можно идти гулять (3 body)");
            }
        }

    }

    public static void main(String[] args) {
        canGoOutside(31, -11);
        canGoOutside(25, 30);
        canGoOutside(18, 7);
        canGoOutside(46, 23);
        canGoOutside(63, -10);
        generateRandomAge();
    }

    // Задание на сообразительность

    public static void generateRandomAge() {
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
        canGoOutside(randAge, randTemp);
    }

}
