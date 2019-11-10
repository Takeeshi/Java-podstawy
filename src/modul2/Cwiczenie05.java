package modul2;

import java.util.Scanner;

public class Cwiczenie05 {
    public static void main(String[] args) {
        System.out.println("Wpisz dowolną liczbę nieparzystą");
        Scanner scan = new Scanner(System.in);
        var inputNumber = scan.nextInt();
        if (inputNumber % 2 == 1) {
            for (var i = 0; i <= inputNumber; i++) {
                for (var j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (var i = 0; i < inputNumber; i += 2) {
                for (int j = inputNumber - i; j > 1; j -= 2) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        } else if (inputNumber % 2 == 0) {
            System.out.println("Wpisales niewłaściwą liczbę.");
        }


    }
}

