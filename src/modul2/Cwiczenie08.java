package modul2;

//Napisz program o nazwie ZamienMiejsca.java który:
//        o Najpierw wyświetli, jakie wartości przechowuje tabela
//        o Następnie program ma wykonać taką operację, aby ostatni element zamienił się miejscami z tym pierwszym elementem, ten przed ostatni z tym drugim elementem, itp.
//        o Na koniec program ma wyświetlić zawartość tej nowej odwróconej tabeli
//        Weź ten kawałek kodu i go rozbuduj:

public class Cwiczenie08 {
    public static void main(String[] args) {
        char[] text = {'e', 'w', 't', 'a', 'ł', ' ', 'a', 'z', ' ', 'o', 'ł', 'y', 'b', ' ', 'o', 'T'};

        for (var i = 0; i < text.length; i++) {
            System.out.print(text[i]);
        }

        System.out.println(" ");

        for (int i = 0; i < text.length / 2; i++) {
            int n = text.length - i - 1;
            char ch = text[i];
            text[i] = text[n];
            text[n] = ch;
        }

        for (int i = 0; i < text.length; i++) {
            System.out.print(text[i]);
        }
    }
}