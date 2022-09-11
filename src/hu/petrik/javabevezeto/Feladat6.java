package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Add meg a jegyed");
        int jegy = sc.nextInt();
        if (jegy <= 42) {
            System.out.println("Elégtelen");
        } else if (jegy <= 57) {
            System.out.println("Elégséges");
        } else if (jegy <= 72) {
            System.out.println("Közepes");
        } else if (jegy <= 87) {
            System.out.println("Jó");
        } else {
            System.out.println("Jeles");
        }
    }
}
