package modul2;

/*Zadanie 6
        Stwórz program PrawieNajwiekszy.java który weźmie (podane przez użytkownika) 10 cyfr i wybierze z nich tą prawie największą cyfrę. Przykład poniżej:
        Wpisz 10 cyfr:
        67, -468, 36, 1345, –7778, 0, 34, 7654, 45, -666
        Prawie największa cyfra to: 1345
Program musi być tak napisany aby łatwo dało się zmienić ilość możliwych cyfr do wpisania.
        Uwaga: Nie możesz używać tabel.*/

import java.util.Scanner;

public class Cwiczenie06 {
    public static void main(String[] args) {
        System.out.println("Wpisz ilość liczb, które chcesz wprowadzić");
        Scanner scan = new Scanner(System.in);
        var quantityOfNumbers = scan.nextInt();
        var biggestNumber = 0;
        var secondBiggestNumber = 0;
        if (quantityOfNumbers > 0) {
            for (var i = 1; i <= quantityOfNumbers; i++) {
                System.out.println("Wpisz " + i + " liczbę");
                var inputNumber = scan.nextInt();
                if (inputNumber > biggestNumber) {
                    secondBiggestNumber = biggestNumber;
                    biggestNumber = inputNumber;
                } else if (inputNumber > secondBiggestNumber)
                    secondBiggestNumber = inputNumber;
            }
            System.out.println("Największa liczba wynosi: " + biggestNumber);
            System.out.println("Druga największa liczba wynosi: " + secondBiggestNumber);
        } else {
            System.out.println("Wpisałeś liczbę mniejszą od jeden. Uruchom program jeszcze raz");
        }
    }
}

