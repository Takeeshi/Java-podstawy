package modul2;

/*Stwórz program PoliczCyfry.java który weźmie pozytywną liczbę całkowitą (wpisaną przez użytkownika) i wypisze ile ta cyfra zawiera zer, ile nieparzystych cyfr i ile parzystych cyfr. Na przykład:
        Wpisz jakąś dużą liczbę: 678900
        Zera: 2
        Parzyste: 3
        Nieparzyste: 2*/

import java.util.Scanner;

public class Cwiczenie07 {
    public static void main(String[] args) {
        System.out.println("Wpisz dowolną liczbę");
        Scanner scan = new Scanner(System.in);
        var inputNumber = scan.nextLine();

        var countZero = 0;
        var evenNumbers = 0;
        var unevenNumbers = 0;

        for (var i = 0; i < inputNumber.length(); i++) {
            if (inputNumber.charAt(i) == '0') {
                countZero++;
            } else if (inputNumber.charAt(i) % 2 == 0) {
                evenNumbers++;
            } else if (inputNumber.charAt(i) % 2 == 1) {
                unevenNumbers++;
            }
        }
        System.out.println("Ilość zer wynosi: " + countZero);
        System.out.println("Ilość nieparzystych liczb wynosi: " + unevenNumbers);
        System.out.println("Ilość parzystych liczb: " + evenNumbers);
    }
}