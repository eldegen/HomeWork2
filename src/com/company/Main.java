package com.company;

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
    }
}
