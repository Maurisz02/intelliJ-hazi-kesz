package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem adja meg a terület szélességét");
        double a = sc.nextDouble();
        System.out.println("Kérem adja meg a terület magasságát");
        double b = sc.nextDouble();
        double egy = (20 * 20) / 100;
        double result = (a * b) + (a * b * 0.10) * 1000;

        System.out.printf("Csempék száma: %.0f db", result / egy);
    }
}
