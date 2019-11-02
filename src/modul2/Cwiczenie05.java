package modul2;

import java.util.Scanner;

public class Cwiczenie05 {
    public static void main(String[] args) {
        System.out.println("Wpisz dowolną liczbę nieparzystą");
        Scanner scan = new Scanner(System.in);
        var inputNumber = scan.nextInt();
        if (inputNumber % 2 == 1) {
            for (var i = 0; i <= inputNumber; i++)
                System.out.println("*".repeat(i));
        } else if (inputNumber % 2 == 0) {
            System.out.println("Wpisales niewłaściwą liczbę.");
        }
    }
}

