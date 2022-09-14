package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] szamok = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Addj meg egy számot a tömbhöz");
            szamok[i] = sc.nextInt();
        }
        for (int i = 0; i < szamok.length; i++) {
            System.out.print(szamok[i] + ", ");
        }
        System.out.println();
        for (int i = szamok.length - 1; i >= 0; i--) {
            System.out.print(szamok[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < szamok.length; i += 2) {
            System.out.print(szamok[i] + ", ");
        }
        System.out.println();
        System.out.println("Adj meg egy számot 0 és 5 között");
        int index = sc.nextInt();
        System.out.println("A " + (index - 1) + ". eleme a tömbnek: " + szamok[index - 1]);

    }
}
