package modul1;

/*Napisz program Czas.java który bierze liczbę sekund podaną przez użytkownika i wyświetla ten sam czas tylko że w formie godzin, minut i sekund. Program może wyglądać następująco:
        Podaj liczbę sekund: 9999
        To tyle samo co: 2 godziny, 46 minut i 39 sekund.*/

import java.util.Scanner;

public class Cwiczenie8 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę sekund");
        Scanner skan = new Scanner(System.in);
        var secondsInput = skan.nextInt();
        var hours = secondsInput/3600;
        var minutes = secondsInput / 60 - (hours*60);
        var seconds = secondsInput - (minutes * 60 + (hours*3600));
        System.out.println("Podałeś " + secondsInput + " sekund."
                + "\n" + "Po przeliczeniu wynosi to: " + hours + " godzin "
                + minutes + " minut i " +seconds + " sekund." );
    }
}
