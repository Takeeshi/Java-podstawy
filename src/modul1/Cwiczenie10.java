package modul1;

/*
W USA zamiast Celsjusza używa się innej skali, która nazywa się Fahrenheit. Stwórz program, który potrafi konwertować temperaturę w skali Fahrenheit na skalę Celsjusza. Formuła, która służy do tej konwersji wygląda następująco:
        Celsjusz = (Fahrenheit - 32) * 5 / 9
        Twój program o nazwie Konwertowac.java ma poprosić użytkownika o podanie temperatury w skali Fahrenheit. Potem program ma to przerobić na skalę Celsjusza. Następnie program ma wyświetlić wynik z jednym miejscem po przecinku.
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Cwiczenie10 {
    public static void main(String[] args) {
        System.out.println("Wpisz temperaturę w skali Fahrenheita");
        Scanner scan = new Scanner(System.in);
        double temperatureInput = scan.nextDouble();
        double celsjusz = ((temperatureInput - 32) * 5 / 9);
        DecimalFormat dFormat = new DecimalFormat("0.#");
        String formattedCelsjusz = dFormat.format(celsjusz);
        System.out.println("Temperatura w skali Celsjusza wynosi " + formattedCelsjusz);
    }
}
