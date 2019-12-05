package com.company;

class Calkowanie {

    //Algorytm ze strony http://www.algorytm.edu.pl/algorytmy-maturalne/metoda-trapezow.html

    void calkuj(){
        int a, b, n;
        Skanuj skan = new Skanuj();
        System.out.println("Podaj przedział [a, b]\na = ");
        a =skan.skanujInt(-99999,99999);
        System.out.println("b = ");
        b =skan.skanujInt(-99999,99999);
        System.out.println("Podaj liczbę trapezów: ");
        n = skan.skanujInt(-99999,99999);

        if(!(a<b))
            System.out.println("To nie jest przedział!");
        else
            System.out.println("Pole figury wynosi: " + round(pole(a, b, n)));
    }

    private double f(double x){
        return x*x+x+2; // wartosc funkcji
    }

    private double pole(int a, int b, int n){
        double h = (b-a)/(double)n; //wysokosć trapezów
        double S = 0.0; //zmienna będzie przechowywać sumę pól trapezów
        double podstawaA = f(a), podstawaB;

        for(int i=1;i<=n;i++)
        {
            podstawaB = f(a+h*i);
            S += (podstawaA + podstawaB);
            podstawaA = podstawaB;
        }
        return S*0.5*h;
    }
    private static double round(double f) {
        double temp = f*(Math.pow(10, 2));
        temp = (Math.round(temp));
        temp = temp/(int)(Math.pow(10, 2));
        return temp;
    }
}
