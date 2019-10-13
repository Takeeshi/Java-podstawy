package modul1;

/*
        5. Cytat
        Napisz program o nazwie Cytat.java który wczytuje jakiś tekst używając klasy Scanner, tak abyś Ty wpisał ten tekst dopiero po tym jak program się uruchomi.
        Potem program musi wziąć ten tekst, który wpisałeś i go wyświetlić między cytatami. Na przykład, gdy uruchomisz program to może to wyglądać mniej więcej tak:
        Napisz jakiś tekst: Chciałbym mieć tatuaż.
        Między cytatami: „Chciałbym mieć tatuaż.”
        */

import java.util.Scanner;

public class Cwiczenie5 {
    public static void main(String[] args) {
        Scanner skan = new Scanner(System.in);
        String wyrazenie = "Napisz jakiś tekst: ";
        String cytaty = "Między cytatami: ";
        String wpisane = skan.nextLine();
        System.out.println(wyrazenie + wpisane);
        System.out.println(cytaty + "\"" + wpisane + "\"");

    }
}
