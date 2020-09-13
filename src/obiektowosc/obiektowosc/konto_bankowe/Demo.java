package obiektowosc.obiektowosc.konto_bankowe;

public class Demo {
    public static void main(String[] args) {
        // referancja    =      obiekt
        KontoBankowe konto1 = new KontoBankowe();
        // referancja2    =      obiekt2
        KontoBankowe konto2 = new KontoBankowe();
        // referancja = obiekt2;
        konto1 = konto2;

        konto1.wlasciciel = "Daniel";
        konto2.wlasciciel = "Aleksandra";
        konto1.balans = 1000;
        System.out.println("Jak to jest z tym true false");
        System.out.println(konto2.aktywne);
        konto2.aktywne=false;
        System.out.println(konto2.aktywne);
        /*konto1.aktywne = true;
        konto2.aktywne = true;*/

        System.out.println("Dane konta 1: ");
        //konto1:
        System.out.println(konto1.aktywne);
        System.out.println(konto1.balans);
        System.out.println(konto1.wlasciciel);

        System.out.println("Dane konta 2: ");
        //konto2:
        System.out.println(konto2.aktywne);
        System.out.println(konto2.balans);
        System.out.println(konto2.wlasciciel);

        System.out.println(" tranzakcje:");

        konto1.wyplata(600);
        konto2.wplata(600);

        System.out.println("Dane konta 1: ");
        //konto1:
        System.out.println(konto1.aktywne);
        System.out.println(konto1.balans);
        System.out.println(konto1.wlasciciel);

        System.out.println("Dane konta 2: ");
        //konto2:
        System.out.println(konto2.aktywne);
        System.out.println(konto2.balans);
        System.out.println(konto2.wlasciciel);

        KontoBankowe.metoda();


    }
}
