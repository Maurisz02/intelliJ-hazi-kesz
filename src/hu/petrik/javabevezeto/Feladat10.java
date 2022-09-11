package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat10 {
    public static void main(String[] args) {
        int num = 0;
        int paros = 0;
        int paratlan = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Adj meg számot addig míg az összege meg nem haladja a százat");
        while (num <= 100) {
            num += sc.nextInt();
            if (num % 2 == 0) {
                paros++;
            } else {
                paratlan++;
            }
            System.out.println("számok összege: " + num);
        }

        System.out.println("Páros számok: " + paros + "\n" + "Páratlan számok: " + paratlan);

    }
}
