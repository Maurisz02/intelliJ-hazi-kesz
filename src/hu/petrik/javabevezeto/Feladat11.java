package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Adj meg egy pozitív egész számot");
        int n = sc.nextInt();
        int szamlalo = 0;
        while (szamlalo < n) {
            if (szamlalo % 2 == 0) {
                szamlalo++;
            } else {
                System.out.print(szamlalo + ", ");
                szamlalo++;
            }
        }

    }
}
