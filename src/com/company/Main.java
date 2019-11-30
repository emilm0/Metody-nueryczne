package com.company;

import java.util.Scanner;

public class Main {

    static Skanuj skan1 = new Skanuj();


    public static void main(String[] args) {

        System.out.println(" ");
        System.out.println("Witaj w świecie metod numerycznych!");

        //skan1.skanujDouble();

        metody();

        }


    private static void metody(){
        int metoda = 5;

        metoda = wybierz();

        while(metoda != 0) {

            if (metoda == 1) {
                System.out.println("Wybrałes interpolację");

                Interpolacja interpolacja = new Interpolacja();
                interpolacja.pobierzDane();
                interpolacja.interpoluj();

                metoda = wybierz();
            } else if (metoda == 2) {
                System.out.println("Wybrałes aproksymacje");

                Aproksymacja aproksymacja = new Aproksymacja();
                aproksymacja.pobierzDane();
                aproksymacja.aproksymuj();

                metoda = wybierz();
            } else if (metoda == 3) {
                System.out.println("Wybrałes równania liniowe");
                metoda = wybierz();
            } else {
                System.out.println("Podanłeś nieprawidłową wartość. Wybierz liczbę 1, 2, 3 lub 0.");
                metoda = wybierz();
            }
        }
        System.out.println("Dziekuję! Dobrego dnia!");

    }

    public static int wybierz(){

        System.out.println("Wybierz metode: ");
        System.out.println("[1] Interpolacja ");
        System.out.println("[2] Aproksymacj ");
        System.out.println("[3] Rozwiązywanie równań ");
        System.out.println("[0] Wyjdź ");

        return skan1.skanujInt(0,3);

    }



}
