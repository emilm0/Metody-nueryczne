package com.company;

public class Interpolacja {

    // deklaracja danych
    Skanuj skanI = new Skanuj();
    private int n = wezly(1,7);

    private double[] X = new double[n];
    private double[] W = new double[n];


    private int wezly(int x , int y){
        System.out.println("Podaj ilośc węzłów od " + x + " do " + y +".");
        return skanI.skanujInt(x, y);
    }

    public void pobierzDane() {
        // wprowadzenie danych

        int i = 1;
        while (i <= n) {
            System.out.println("Podaj x[" + i + "]");
            X[i - 1] = skanI.skanujDouble();
            System.out.println("Podaj y[" + i + "]");
            W[i - 1] = skanI.skanujDouble();
            i++;
        }
    }

    public void interpoluj(){

        double s = 0, x, y, w1, w2;
        int i, j;

        System.out.println("Dla jakiego punktu obliczyc wartosc?");
        x =skanI.skanujDouble();

            // Algorytm
            w1 = 1;
            for (j = 0; j < n; j++){
                w1 *= (x - X[j]);
                w2 = 1;
                for (i = 0; i < n; i++) {
                    if (i == j)
                        continue;
                    else
                        w2 *= (X[j] - X[i]);
                }
                s += W[j] / (w2 * (x - X[j]));
            }
            y = w1 *s;

           System.out.println("Wartosc wielomianu w punkcie "+ round(x) + " = " + round(y) +".");
    }
    private static double round(double f) {
        double temp = f*(Math.pow(10, 2));
        temp = (Math.round(temp));
        temp = temp/(int)(Math.pow(10, 2));
        return temp;
    }
}
