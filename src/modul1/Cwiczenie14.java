package modul1;

/*Kiedy wieje wiatr, to na pewno masz wrażenie, że temperatura jest niższa niż ta, która pokazuje termometr. Stwórz program Wiatr.java który użyje formuły Oszevskis’ego i Bluesteins’a aby obliczyć tą prawdziwą temperaturę, którą odczuwa człowiek. Formuła ta wygląda tak:
        Prawdziwa temperatura = 13.126667 + 0.6215 * T – 13.924748 * + 0.4875195 * T *
        „V” oznacza szybkość wiatru, „T” oznacza temperaturę pokazywaną przez termometr. Program może wyglądać tak:
        Podaj temperaturę: -14
        Podaj szybkość wiatru: 16
        Prawdziwa temperatura: -28 stopni Celsjusza*/

import java.util.Scanner;

import static java.lang.StrictMath.round;

public class Cwiczenie14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj temperaturę");
        var t = scan.nextInt();

        System.out.println("Podaj szybkość wiatru");
        var v = scan.nextInt();

        var realTemp = 13.126667 + 0.6215 * t - 13.924748 * Math.pow(v, 0.16) + 0.4875195 * t * Math.pow(v, 0.16);

        System.out.println("Prawdziwa temperatura wynosi: " + round(realTemp));
    }


}
