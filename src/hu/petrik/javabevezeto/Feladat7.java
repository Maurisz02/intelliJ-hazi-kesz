package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Add meg melyik hónapba járunk");
        int honap = sc.nextInt();

        if (honap == 9 || honap == 10 || honap == 11) {
            System.out.println("Ősz");
        } else if (honap == 12 || honap == 1 || honap == 2) {
            System.out.println("Tél");
        } else if (honap == 3 || honap == 4 || honap == 5) {
            System.out.println("Tavasz");
        } else if (honap == 6 || honap == 7 || honap == 8) {
            System.out.println("Nyár");
        } else {
            System.out.println("Hiba");
        }
    }
}
