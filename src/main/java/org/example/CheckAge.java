package org.example;

public class CheckAge {
    public static void main(String[] args) {
        checkAge(20);
        checkAge(13);

    }

    public static void checkAge(int age) {
        if (age >= 18) {
            System.out.println("Човекът е над 18 години.");
        }
        else {
            System.out.println("Човекът е под 18 години.");
        }

    }
}
