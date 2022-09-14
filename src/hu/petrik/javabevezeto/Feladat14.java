package hu.petrik.javabevezeto;

import java.util.Locale;
import java.util.Scanner;

public class Feladat14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adj meg egy szöveget");
        String text = sc.next();
        char action = ' ';
        while (action != 'f') {
            System.out.println("Mit szeretnél a szöveggel?(a-Nagybetű, b-Kisbetű, c-Hossza, d-Összehasonlít, c-Egy rész kiiratása, f-Kilépés)");
            action = sc.next().charAt(0);
            if (action == 'a') {
                System.out.println(text.toUpperCase(Locale.ROOT));
            } else if (action == 'b') {
                System.out.println(text.toLowerCase(Locale.ROOT));
            } else if (action == 'c') {
                int hossz = text.length();
                System.out.println(hossz);
            } else if (action == 'd') {
                System.out.println("Addj meg egy másik szöveget");
                String compare = sc.next();
                int result = text.compareTo(compare);
                System.out.println(result);
            } else if (action == 'e') {
                System.out.println("Mettől?");
                int from = sc.nextInt();
                System.out.println("Meddig?");
                int to = sc.nextInt();
                String subText = text.substring(from, to);
                System.out.println(subText);
            } else if (action != 'f') {
                System.out.println("Hiba ilyen lehetőség nincs!");
            }
        }
    }
}
