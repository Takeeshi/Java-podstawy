package modul2;

/*Napisz program PoliczA.java który wczyta tekst napisany przez użytkownika i następnie policzy ile jest małych „a” oraz dużych „A” w tekście. Uruchomienie programu może wyglądać następująco:
        Wpisz jakiś tekst: Anna nie lubi pływać.
        Ilość a: 2
        Ilość A: 1*/

import java.util.Scanner;

public class Cwiczenie01 {
    public static void main(String[] args) {
        System.out.println("Wpisz dowolny tekst");
        Scanner scan = new Scanner(System.in);
        var text = scan.nextLine();
        var countSmallA = 0;
        var countBigA = 0;
        for (var i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a') countSmallA++;
            if (text.charAt(i) == 'A') countBigA++;
        }
        System.out.println("ilość małych a: " + countSmallA + "\n" + "ilość dużych A: " + countBigA);
    }
}