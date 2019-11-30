package com.company;


public class Aproksymacja {

    private Skanuj skanA = new Skanuj();
    private int n = wezly(1,7);

    private double[] X = new double[n];
    private double[] Y = new double[n];


    private int wezly(int x , int y){
        System.out.println("Podaj ilośc węzłów od " + x + " do " + y +".");
        return skanA.skanujInt(x, y);
    }

    public void pobierzDane() {
        // wprowadzenie danych

        int i = 1;
        while (i <= n) {
            System.out.println("Podaj x[" + i + "]");
            X[i-1] = skanA.skanujDouble();
            System.out.println("Podaj y[" + i + "]");
            Y[i-1] = skanA.skanujDouble();
            i++;
        }

    }

    public void aproksymuj(){
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

    private static double round(double f) {
        double temp = f*(Math.pow(10, 2));
        temp = (Math.round(temp));
        temp = temp/(int)(Math.pow(10, 2));
        return temp;
    }
}
