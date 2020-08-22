public class Zad8 {
 /*   Zad 8
    Napisz program “Poszukiwany”, stwórz i przypisz do odpowiednich zmiennych dwie tablice:
    tablica liczb z 4 miejscami,
    tablica tekstów z 2 miejscami.
    Następnie przypisz ręcznie:
            do liczb: osobno dzień,  miesiąc, rok ucieczki z więzienia,
    na 4 pozycji wpisz kwotę nagrody,
do tekstów:  imię  i nazwisko uciekiniera.
    Wyświetl uzupełnioną wiadomość:
            “ … - … - ….. zbiegł więzień …… …….. !”
            “Nagroda za przyprowadzenie: ……….$!”*/

    public static void main(String[] args) {
        int[] dane = new int[4];
        String[] imieINazwisko = new String[2];

        dane[0] = 10;
        dane[1] = 3;
        dane[2] = 2015;
        dane[3] = 10_000;

        imieINazwisko[0] = "Jan";
        imieINazwisko[1] = "Kowalski";

        System.out.println(dane[0] + " - " + dane[1] + " - " + dane[2] + " zbiegł więzień " + imieINazwisko[0] + " " + imieINazwisko[1] + "!");
        System.out.printf("%d-%d-%d zbiegł więzień %s %s!\n", dane[0],dane[1],dane[2],imieINazwisko[0],imieINazwisko[1] ); //wersja na printf
        System.out.printf("Nagroda za przyprowadzenie: %d$\n", dane[3] );
    }
}
