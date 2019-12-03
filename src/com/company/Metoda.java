package com.company;

class Metoda {

    Skanuj skan = new Skanuj();
    int n = wezly(1,7);

    double[] X = new double[n];
    double[] Y = new double[n];

    Metoda(){
        pobierzDane();
    }

    private int wezly(int x , int y){
        System.out.println("Podaj ilośc węzłów od " + x + " do " + y +".");
        return skan.skanujInt(x, y);
    }

    void pobierzDane() {
        // wprowadzenie danych

        int i = 1;
        while (i <= n) {
            System.out.println("Podaj x[" + i + "]");
            X[i-1] = skan.skanujDouble();
            System.out.println("Podaj y[" + i + "]");
            Y[i-1] = skan.skanujDouble();
            i++;
        }
    }

    static double round(double f) {
        double temp = f*(Math.pow(10, 2));
        temp = (Math.round(temp));
        temp = temp/(int)(Math.pow(10, 2));
        return temp;
    }

}
