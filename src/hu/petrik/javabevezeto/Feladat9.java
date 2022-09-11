package hu.petrik.javabevezeto;

public class Feladat9 {
    public static void main(String[] args) {
        for (var i = 0; i < 1000; i++) {
            boolean check = (i % 5 == 0) && (i % 3 == 0);
            if (check) {
                System.out.print(i + ", ");
            }
        }
    }
}
