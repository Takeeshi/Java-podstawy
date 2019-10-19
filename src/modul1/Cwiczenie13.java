package modul1;

/*Napisz program Dystans.java który weźmie dwa koordynaty (x1, y1) i (x2, y2) oraz następnie obliczy odległość pomiędzy tymi dwiema punktami wg. Tej formuły:
        Dystans =
        Koordynaty muszą być podane przez użytkownika programu. Odpowiedź musi być zaprezentowana z trzema miejscami po przecinku.
        Użyj do tego klasy java.util.Math*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Cwiczenie13 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.###");
        Scanner scan = new Scanner(System.in);
        System.out.println("Wpisz 4 koordynaty:");
        int x1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y1 = scan.nextInt();
        int y2 = scan.nextInt();

        var distance = (Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2)));
        System.out.println(df.format(distance));
    }
}
