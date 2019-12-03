package com.company;

public class Main {

    static Skanuj skan1 = new Skanuj();

    public static void main(String[] args) {

        System.out.println(" ");
        System.out.println("Witaj w świecie metod numerycznych!");

        metody();
        }

    private static void metody(){
        int m = wybierz();

        while(m != 0) {

            if (m == 1) {
                System.out.println("Wybrałes interpolację");

                Interpolacja interpolacja = new Interpolacja();
                interpolacja.interpoluj();
                m = wybierz();

            } else if (m == 2) {
                System.out.println("Wybrałes aproksymacje");

                Aproksymacja aproksymacja = new Aproksymacja();
                aproksymacja.aproksymuj();
                m = wybierz();

            } else if (m == 3) {
                System.out.println("Wybrałes równania liniowe");
                m = wybierz();
            } else {
                System.out.println("Podanłeś nieprawidłową wartość. Wybierz liczbę 1, 2, 3 lub 0.");
                m = wybierz();
            }
        }
        System.out.println("Dziekuję! Dobrego dnia!");

    }

    private static int wybierz(){

        System.out.println("Wybierz metode: ");
        System.out.println("[1] Interpolacja ");
        System.out.println("[2] Aproksymacj ");
        System.out.println("[3] Rozwiązywanie równań ");
        System.out.println("[0] Wyjdź ");

        return skan1.skanujInt(0,3);

    }



}
