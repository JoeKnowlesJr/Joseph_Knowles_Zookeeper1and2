package com.joeknowles.zookeeper;

import java.util.Scanner;

public class Main {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        Gorilla magilla = new Gorilla();
        System.out.println(magilla.toString());
        pressEnterToContinue(false);
        magilla.throwSomething();
        System.out.println(magilla.toString());
        pressEnterToContinue(false);
        magilla.throwSomething();
        System.out.println(magilla.toString());
        pressEnterToContinue(false);
        magilla.throwSomething();
        System.out.println(magilla.toString());
        pressEnterToContinue(false);
        magilla.eatBananas();
        System.out.println(magilla.toString());
        pressEnterToContinue(false);
        magilla.eatBananas();
        System.out.println(magilla.toString());
        pressEnterToContinue(false);
        magilla.climbSomething();
        System.out.println(magilla.toString());
        pressEnterToContinue(false);
        Bat dracula = new Bat();
        print(dracula.toString());
        pressEnterToContinue(false);
        dracula.attackTown();
        print(dracula.toString());
        pressEnterToContinue(false);
        dracula.attackTown();
        print(dracula.toString());
        pressEnterToContinue(false);
        dracula.attackTown();
        print(dracula.toString());
        pressEnterToContinue(false);
        dracula.eatHumans();
        print(dracula.toString());
        pressEnterToContinue(false);
        dracula.eatHumans();
        print(dracula.toString());
        pressEnterToContinue(false);
        dracula.fly();
        print(dracula.toString());
        pressEnterToContinue(false);
        dracula.fly();
        print(dracula.toString());
        pressEnterToContinue(false);
    }


    private static void print(String msg) {
        System.out.println(msg);
    }

    private static void pressEnterToContinue(boolean clr) {
        System.out.println("\r\n\tPress <ENTER> to continue...");
        scanner.nextLine();
        if (clr) clearScreen();
    }

    private static void clearScreen() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception ex) {
        }
    }

    private static String getStringInput(String msg, boolean nums) {
        System.out.println(msg);
        String input = scanner.nextLine();
        if (nums) {
            return input.replaceAll("[^\\d.]", "");
        }
        return input;
    }
}
