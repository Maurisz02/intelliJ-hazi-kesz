package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = 1;
        int max = 100;
        int b = (int) (Math.random() * (max - min + 1) + min);
        System.out.println("A gép gondolt egy számra 1 és 100 között");
        System.out.println("Tippelj egy számra 1 és 100 között\n");
        System.out.println(b);
        int tipp = 0;
        while (tipp != b) {
            System.out.println("Tippelj");
            tipp = sc.nextInt();
            if (tipp < b) {
                System.out.println("Nagyobb\n");
            } else if (tipp > b) {
                System.out.println("Kisebb\n");
            }

        }
        System.out.println("Gratulálok nyertél");

    }
}
