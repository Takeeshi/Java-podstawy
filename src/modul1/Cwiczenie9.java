package modul1;

/*
Napisz program o nazwie SumaTrzy.java który zapyta się użytkownika o wprowadzenie jakiejkolwiek trzy cyfrowej liczby. Program ma potem policzyć sumę tych trzech cyfr. Na przykład:
        Podaj jakąś trzy cyfrową liczbę: 483
        Suma tych cyfr to: 15
        Jak widzisz program wziął cyfrę 483, i dodał ze sobą 4 + 8 + 3 i potem wyświetlił wynik, czyli 15. Napisz program, który potrafi to zrobić.
*/

import java.util.Scanner;

public class Cwiczenie9 {
    public static void main(String[] args) {
        System.out.println("Wpisz jakąś liczbę");
        Scanner scan = new Scanner(System.in);
        var numberInput = scan.nextInt();
        var firstNumber = (numberInput / 100);
        var secondNumber = (numberInput / 10) % 10;
        var thirdNumber = numberInput % 10;
        System.out.println(firstNumber + secondNumber + thirdNumber);
    }
}
