package obiektowosc.lambdy;

import java.util.function.Function;

public class Zad33 {

    public static void main(String[] args) {
        //Consumer - pobiera dane, nic nie zwraca
        //dodajace liczby i zwracajace wynik
        //Operator - przyjmuje dane tego samego typu który zwrca
        //Function - przyjmuje dane i zwraca (mogą być różnych typów)
        //Supplier - nic nie przujmuje ale zwraca dane
        //Comparator - przyjmuje 2 rzeczy i zwraca ina -> oznacza on kolejnosc do sortowania
        //Predicate - przyjmuje dane - zwraca boolean

        Function<String, Integer> podajDlugoscTekstu = tekst -> tekst.length();
        System.out.println(podajDlugoscTekstu.apply("abc"));

    }

  /*  Stosując gotowe klasy interfejsów funkcyjnych (Function, Consumer, Supplier, Comparator, Predicate)
  zaimplementuj i przetestuj 5 funkcji:

    funkcja przyjmująca tekst i zwracająca jego długość
    funkcja sprawdzająca czy przekazany tekst ma minimum 5 znaków
    funkcja dostarczająca losową liczbę z przedziału 1-10
    funkcja drukująca tekst wielkimi literami
    funkcja porównująca dwa teksty po ilości liter*/

}
