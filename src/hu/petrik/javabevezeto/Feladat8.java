package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem adja meg a tippjét 0-fej, 1-írás");
        int tipp = sc.nextInt();
        int feldobas = (int) (Math.random() * 2);
        String szoveg = feldobas == 0 ? "fej" : "írás";
        System.out.printf("A dobás eredménye %s. ", szoveg);
        if (tipp == feldobas) {
            System.out.println("Gratulálok nyertél");
        } else {
            System.out.println("Sajnos vesztettél");
        }
    }
}
