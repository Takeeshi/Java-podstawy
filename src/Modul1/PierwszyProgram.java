package Modul1;

import java.util.Scanner;

public class PierwszyProgram {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Goodbye World!");

        Scanner skan = new Scanner(System.in);
        System.out.println("Wpisz trzy liczby: ");
        double suma = 0;
        suma = suma + skan.nextDouble();
        suma = suma + skan.nextDouble();
        suma = suma + skan.nextDouble();

        System.out.println("Suma wynosi: " + suma);
        skan.close();

    }


}
