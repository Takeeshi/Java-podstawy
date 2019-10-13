package modul1;

/*
4. Drukuj
        Napisz program o nazwie Drukuj.java który wyświetli zdanie Wiedza to potęga!
        a. Na jednej linii
        b. W trzech różnych liniach, gdzie każde słowo jest na osobnej linii
        c. Wewnątrz prostokąta, który składa się ze znaków „=” oraz „|”
        */

public class Cwiczenie4 {
    public static void main(String[] args) {
        String sentence = "Wiedza to potęga!";
        System.out.println(sentence);
        String wiedza = "Wiedza";
        String to = "to";
        String potega = "potęga!";

        System.out.println(wiedza + "\n" + to + "\n" + potega);

        int a = sentence.length() + 2;

        System.out.println(stringMultiply("=", a)
                + "\n" + "|" + wiedza + " " + to + " " + potega + "|"
                + "\n" + stringMultiply("=", a));
    }

    public static String stringMultiply(String even, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(even);
        }
        return sb.toString();
    }


}
