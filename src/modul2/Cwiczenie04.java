package modul2;

/*
Napisz program WysokoNisko.java który stworzy grę – zgadywankę High and Low. Komputer ma wylosować jakąś cyfrę między 1 a 100. Następnie użytkownik ma zgadnąć co komputer wylosował. Po każdej próbie zgadnięcia ma się pokazywać wskazówka „wyżej” lub „niżej”. Może to wyglądać następująco:
        Próba 1: 67
        Wskazówka: wyżej
        Próba 2: 82
        Wskazówka: niżej
        Próba 3: 77
        Prawidłowa odpowiedź
        Program ma zakończyć grę, gdy użytkownik wykona 10 nieudanych prób wraz z informacją, że użytkownikowi nie udało się zgadnąć, jaka to cyfra.
*/

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Cwiczenie04 {
    public static void main(String[] args) {
        var theNumber = ThreadLocalRandom.current().nextInt(1, 100);

        System.out.println("Zgadnij liczbę, którą wylosował komputer z zakresu od 1 do 100");
        Scanner scan = new Scanner(System.in);
        for (var i = 10; i >= 0; i--) {
            var inputNumber = scan.nextInt();
            System.out.println("Pozostało Ci " + i + " prób!");
            if (inputNumber < theNumber & i > 0) {
                System.out.println("Wskazówka: wyżej");
            } else if (inputNumber > theNumber & i > 0) {
                System.out.println("Wskazówka: niżej");
            } else if (i == 0) {
                System.out.println("Niestety nie zgadłeś! Uruchom program jeszcze raz.");
                break;
            } else {
                System.out.println("Zgadłeś!");
                break;
            }
        }
    }
}
