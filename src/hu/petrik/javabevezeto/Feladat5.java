package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adja meg a téglalap egyik oldalát: ");
        double a = sc.nextDouble();
        System.out.println("Adja meg a téglalap másik oldalát: ");
        double b = sc.nextDouble();
        System.out.println("Adja meg mit szeretne kiszámolni Kerület: k, Terület: t");
        String valasz = sc.next();

        double eredmeny = 0;

        if (valasz.equals("t")) {
            eredmeny = a * b;
            System.out.printf("Terület: %.2f", eredmeny);
        } else if (valasz.equals("k")) {
            eredmeny = 2 * (a + b);
            System.out.printf("Kerület: %.2f", eredmeny);

        } else {
            System.out.println("Hiba történt");
        }
    }
}
