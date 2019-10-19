package modul1;

/*Stwórz program NumerTelefonu.java który generuje i wyświetla losowy numer telefonu. Ten numer ma wyglądać wg. Takiego schematu: 0XXX – ZXXXXX.
        Tak więc na początku mamy numer kierunkowy, który zaczyna się od zera. Następnie mamy trzy wylosowane cyfry (X). Potem mamy drugą część numeru, jej początek nie może się zaczynać od zera (Z). Następnie mamy pięć jakichkolwiek wylosowanych cyfr (X).
        Aby to zrobić będziesz musiał użyć klasy Random.*/

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Cwiczenie12 {
    public static void main(String[] args) {
        Random random = new Random();
        var directional1 = random.nextInt(9);
        var directional2 = random.nextInt(9);
        var directional3 = random.nextInt(9);
        var mainNumber = ThreadLocalRandom.current().nextInt(100000, 999999);
        System.out.println("0" + directional1 + directional2 + directional3 + "-" + mainNumber);
    }
}
