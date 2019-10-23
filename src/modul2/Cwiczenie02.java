package modul2;

import java.util.Scanner;

public class Cwiczenie02 {
    public static void main(String[] args) {
        System.out.println("Wpisz dodatnią liczbę całkowitą");
        Scanner scan = new Scanner(System.in);
        var n = scan.nextInt();
        var k = 0;
        var sum = 0;

        while (sum < n) {
            k = k + 2;
            sum = sum + k;
        }
        k = k - 2;
        System.out.println("K to: " + k);
    }
}


