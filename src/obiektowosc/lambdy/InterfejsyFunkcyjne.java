package obiektowosc.lambdy;

import java.util.Scanner;
import java.util.function.Predicate;

public class InterfejsyFunkcyjne {
    public static void main(String[] args) {
        BierzeTekst wyswietlaWielkimi = tekst -> System.out.println(tekst.toUpperCase());
        //Consumer - pobiera dane, nic nie zwraca

        //dodajace liczby i zwracajace wynik
        //Operator - przyjmuje dane tego samego typu który zwrca
        //Function - przyjmuje dane i zwraca (mogą być różnych typów)
        //Supplier - nic nie przujmuje ale zwraca dane
        //Comparator - przyjmuje 2 rzeczy i zwraca ina -> oznacza on kolejnosc do sortowania
        //Predicate - przyjmuje dane - zwraca boolean


        wyswietlaWielkimi.pobierzTekst("Wyświetl mi to");

        MySupplier pobieraImie = () -> {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Jak masz na imie?");
            return scanner.nextLine();
        };

        String imie = pobieraImie.offer();
        System.out.println("Twoje imie to: " + imie);

        MyPredicate<String> czyWulgarne = tekst -> tekst.contains("cholera");
        System.out.println(czyWulgarne.testData("o cholera!"));


        MyPredicate<Integer> czyDodatnia = liczba -> liczba > 0;
        Predicate<String> isEmptyString = tekst -> tekst.isEmpty();
        System.out.println(isEmptyString.test(""));
    }

}

