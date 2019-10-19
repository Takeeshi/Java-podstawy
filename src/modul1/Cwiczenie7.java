package modul1;/*
7. BMI
        Stwórz program BMI.java który będzie obliczał BMI (Body Mass Index) danej osoby. Program ma wczytać dane podane przez użytkownika (wzrost i wagę) i potem zaprezentować odpowiedź. BMI wylicza się tak, że dzieli się wagę przez wzrost podniesiony do kwadratu [waga/(wzrost^2)]. Waga jest podawana w kilogramach a wzrost w metach. Program może wyglądać tak:
        Podaj swoją długość w metrach: 1,83
        Podaj swoją wagę w kilogramach: 83
        Twoje BMI to: 25
*/

import java.util.Scanner;

public class Cwiczenie7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj swoją wagę w kilogramach:");
        var weightInput = scan.nextInt();

        System.out.println("Podaj swoją wysokość w centymetrach:");
        var heightInput = scan.nextInt();

        var bmi = weightInput / ((heightInput / 100) ^ 2);
        System.out.println("Twoje BMI to: " + bmi);
    }
}
