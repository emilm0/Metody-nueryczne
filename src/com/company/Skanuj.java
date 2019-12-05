package com.company;

import java.util.Scanner;

class Skanuj {
    private Scanner scanner = new Scanner(System.in);

    double skanujDouble(){

        boolean dalej = true;
        double s= 1;
        while(dalej) {
            String in = scanner.nextLine();

            if (isDouble(in)) {
                s= Float.parseFloat(in);
                dalej = false;
            }
            else {
                System.out.println("Podana wartość nie jest liczbą!");
            }
        }
        return s;
    }

    int skanujInt(int a, int b){
        boolean dalej = true;
        int s= 12;
        while(dalej) {
            String in = scanner.nextLine();

            if (isInt(in)) {
                s= Integer.parseInt(in);
                if (s >= a && s <= b) {
                    dalej = false;
                }
                else {
                    System.out.println("Podałeś nieprawidłową wartość. Wybierz liczbe od "+ a +" do "+ b +".");
                }
            }
            else {
                System.out.println("Podana wartość nie jest liczbą! Wybierz liczbe od "+ a +" do "+ b +".");
            }
        }
        return s;
    }

    private static boolean isInt(final String str) {
        // null or empty
        if (str == null || str.length() == 0) {
            return false; }

        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;}
        }
        return true;
    }
    private boolean isDouble(String s){
        if (s == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(s);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

}
