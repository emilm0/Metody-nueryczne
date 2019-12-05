package com.company;

class Interpolacja extends Metoda {

    void interpoluj(){

        double s = 0, x, y, w1, w2;
        int i, j;

        System.out.println("Dla jakiego punktu obliczyc wartosc?");
        x =skan.skanujDouble();

            w1 = 1;
            for (j = 0; j < n; j++){
                w1 *= (x - X[j]);
                w2 = 1;
                for (i = 0; i < n; i++) {
                    if (i == j) {
                        continue;}
                    else
                        w2 *= (X[j] - X[i]);
                }
                s += Y[j] / (w2 * (x - X[j]));
            }
            y = w1 *s;

           System.out.println("Wartosc wielomianu w punkcie "+ round(x) + " wynosi " + round(y) +".");
    }
}
