package modul2;

import java.util.Scanner;

public class Cwiczenie02 {
    public static void main(String[] args) {
        System.out.println("Wpisz dodatnią liczbę całkowitą");
        Scanner scan = new Scanner(System.in);
        var N = scan.nextInt();
        var K = 0;
        var sum = 0;

        while (sum < N) {
            K = K + 2;
            sum = sum + K;
        }
        K = K - 2;
        System.out.println("K to: " + K);
    }
}


