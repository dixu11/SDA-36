package metody;

import java.util.Arrays;

public class Pola {

    static int liczba =10;
    //szerszy zasieg - minum cala klasa -> zalezy od modyfikatora dostępu
    //ustawiane domyślne wartości - jak przy tablicach
    //zmienne lokalne (w metodzie) przysłaniają pola o tej samej nazwie
    //można dostawać się po składowych statycznych klasy -> metod statycnych i pól statycznych przez nazwe tej klasy:
    // Klasa.pole,  Klasa.metoda()

    public static void main(String[] args) {
        System.out.println(Loteria.pula);
        int liczba = 20;
       // System.out.println(liczba);
        System.out.println(Pola.liczba);
    }

    public static void wlasnaMetoda() {
        System.out.println(liczba);
    }
}
