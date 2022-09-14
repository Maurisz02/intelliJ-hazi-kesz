package hu.petrik.javabevezeto;

public class Feladat17 {
    public static void main(String[] args) {
        double[] egyik = new double[10];
        double[] masik = new double[10];
        double[] harmadik = new double[10];
        for (int i = 0; i < 10; i++) {
            double r = Math.random() * (100 - (-100) + 1) + (-100);
            egyik[i] = r;
            double rr = Math.random() * (100 - (-100) + 1) + (-100);
            masik[i] = rr;
            harmadik[i] = egyik[i] + masik[i];
        }

        for (int i = 0; i < egyik.length; i++) {
            System.out.print(egyik[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < egyik.length; i++) {
            System.out.print(masik[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < egyik.length; i++) {
            System.out.print(harmadik[i] + ", ");
        }
    }
}
