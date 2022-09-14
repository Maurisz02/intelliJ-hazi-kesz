package hu.petrik.javabevezeto;

public class Feladat15 {
    public static void main(String[] args) {
        int[] szamok = new int[25];
        for (int i = 0; i < 25; i++) {
            szamok[i] = i;
        }
        for (int i = 0; i < 25; i++) {
            if (i % 2 != 0) {
                System.out.println(Math.pow(szamok[i], 2));
            }
        }
    }
}
