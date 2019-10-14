package modul1;

/*11. Krótkie Imię
        Stwórz program KrotkieImie.java który wczyta imię i nazwisko (tak więc są to dwa osobne ciągi znaków). Potem program ma wyświetlić tylko pierwszą literę z imienia, potem kropkę, potem spację i na samym końcu cztery pierwsze litery z nazwiska. Przykład:
        Imię: Anakin
        Nazwisko: Skywalker
        Krótkie imię: A. Skyw
        Uwaga: Co się stanie jeśli wpiszemy nazwisko, które jest krótsze niż 4 znaki? Jak to rozwiązać?*/

import java.util.Scanner;

public class Cwiczenie11 {
    public static void main(String[] args) {
        System.out.println("Wpisz imię");
        Scanner scan = new Scanner(System.in);
        var firstName = scan.next();

        System.out.println("Wpisz nazwisko");
        var lastName = scan.next();

        var shortenedLastName = lastName.substring(0,4);
        var shortenedFirstName = firstName.charAt(0);

        System.out.println(shortenedFirstName + ". " + shortenedLastName);
    }
}
