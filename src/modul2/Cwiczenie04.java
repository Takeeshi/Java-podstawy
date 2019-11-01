package modul2;

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
