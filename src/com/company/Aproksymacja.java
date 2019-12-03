package com.company;


class Aproksymacja extends Metoda {



    void aproksymuj(){
        // aproksymacja liniowa
        System.out.println("Aproksymacja liniowa do postaci y=ax+b");
        double sum_x = 0, sum_y = 0, sum_xy = 0, sum_x2 = 0, a = 0, b;

        for (int j = 0; j < n; j++)
        {
            sum_x += X[j];
            sum_y += Y[j];
            sum_xy += X[j] * Y[j];
            sum_x2 += X[j] * X[j];
        }
        b = (sum_y * sum_x2 - sum_x * sum_xy) / (n * sum_x2 - sum_x * sum_x);
        a = (n*sum_xy -sum_x * sum_y) / (n*sum_x2 - sum_x * sum_x);
        b = round(b);
        a = round(a);

        System.out.println("Rownanie ma postac: y = "+ a + "x + " + b);
    }

}
