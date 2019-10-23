package modul2;

/*    Napisz program OdTylu.java który weźmie jakiś tekst podany przez użytkownika i go wyświetli od tyłu. Może to wyglądać o tak:
            Wpisz jakiś tekst: Anakin Skywalker
            Od tyłu: reklawykS nikanA*/

import java.util.Scanner;

public class Cwiczenie03 {
    public static void main(String[] args) {
        System.out.println("Wpisz jakis tekst");
        Scanner scan = new Scanner(System.in);
        var text = scan.nextLine();

        String reversed = new StringBuilder(text).reverse().toString();

        System.out.println(reversed);
    }
}
