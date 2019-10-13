package modul1;

/*
6. Sekundy
        Napisz program o nazwie Sekundy.java który wczytuje trzy liczby całkowite (reprezentujące godziny, minuty i sekundy) i potem konwertuje podany czas na sekundy. Np. 1 godzina, 28 minut i 42 sekund to to samo, co 5322 sekund. Uruchomienie programu może wyglądać tak:
        Godziny: 1
        Minuty: 28
        Sekundy: 42
        Łączna liczba sekund: 5322
*/

import java.util.Scanner;

public class Cwiczenie6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String hoursLabel = "Godziny: ";
        System.out.println("Wpisz liczbę godzin");
        int hoursInput = scan.nextInt();

        System.out.println("Wpisz liczbę minut");
        String minutesLabel = "Minuty: ";
        int minutesInput = scan.nextInt();

        String secondsLabel = "Sekundy: ";
        System.out.println("Wpisz liczbę sekund");
        int secondsInput = scan.nextInt();

        System.out.println(
                hoursLabel + hoursInput + "\n"
                        + minutesLabel + minutesInput + "\n"
                        + secondsLabel + secondsInput);
        String timeInSeconds = "Czas w sekundach: ";
        int recountInSeconds = hoursInput * 3600 + minutesInput * 60 + secondsInput;
        System.out.println(timeInSeconds + recountInSeconds);
    }
}
