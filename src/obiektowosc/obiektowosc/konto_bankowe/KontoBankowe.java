package obiektowosc.obiektowosc.konto_bankowe;

public class KontoBankowe {

    double balans;
    String wlasciciel;
    boolean aktywne = true;

    public void wyplata(double kwota){
        if (kwota > 0 && balans >= kwota) {
            balans -= kwota;
            System.out.println("Wpłacono na konto  " + wlasciciel + " kwota " + balans);
        } else {
            System.out.println("Nie mozna wyplacic:" + kwota);
        }
    }

    public void wplata(double kwota){
        if (kwota > 0) {
            balans += kwota;
            System.out.println("Wpłacono na konto  " + wlasciciel + " kwota " + kwota);
        }
    }

    public static void metoda(){
       // System.out.println(balans);
    }


}
