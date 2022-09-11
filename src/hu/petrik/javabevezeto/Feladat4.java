package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kérem adja meg a háromszög a oldalát: ");
        double a = sc.nextDouble();

        System.out.print("Kérem adja meg a háromszög b oldalát: ");
        double b = sc.nextDouble();

        System.out.print("Kérem adja meg a háromszög c oldalát: ");
        double c = sc.nextDouble();

        boolean first = (a + b > c);
        boolean second = (a + c > b);
        boolean third = (b + c > a);

        if (first && second && third) {

            double k = a + b + c;
            System.out.println("A háromszög kerülete: " + k);

        } else {
            System.out.println("Hibás adatok");
        }
    }
}
