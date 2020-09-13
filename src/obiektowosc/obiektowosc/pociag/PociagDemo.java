package obiektowosc.obiektowosc.pociag;

public class PociagDemo {
    public static void main(String[] args) {
        Osoba osoba = new Osoba("Jan", "konduktor");
        Towar towar = new Towar("węgiel",500);
        Towar towar2 = new Towar("ropa",500);
        Towar[] towary = new Towar[2];
//        Towar[] towary2 ={towar,towar2};
        towary[0] = towar;
        towary[1] = towar2;
        Wagon wagon = new Wagon(towary);

        Towar towar3 = new Towar("paczki",600);
        Towar towar4 = new Towar("napoje",500);
        Towar[] towary2 = new Towar[2];
//        Towar[] towary2 ={towar,towar2};
        towary2[0] = towar3;
        towary2[1] = towar4;
        Wagon wagon2 = new Wagon(towary2);

        Wagon[] wagony = {wagon, wagon2};
        //System.out.println(wagony[2]);

        boolean wynik = wagon.czyPrzeladowany();
        System.out.println(wagon.czyPrzeladowany());
        System.out.println(wynik);

        System.out.println("Sprawdzamy pociąg: ");
        PociagTowarowy pociagTowarowy = new PociagTowarowy(wagony);
        System.out.println("czy przeładowany pociąg: " +  pociagTowarowy.czyPrzeladowany());
    }
}
