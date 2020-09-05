package obiektowosc.powtorka;

public class Prezenter {

    public void przywitaj(Klient klient ){
        System.out.println("Witaj w naszym serwisie " + klient.getLogin());
        System.out.println("Twoja aktualna ranga to: " + klient.getRanga());
        if (klient.getRanga().equals("senior")) {
            System.out.println("Jesteś w małym gronie najlepszych programistów");
        }
    }


    public Klient ktoMaNajwiecejPunktow(Klient[] klienci){
        int maxPunkty = -1;
        Klient najlepszy = null;
        for(Klient klient: klienci){
            if (klient.getPunkty() > maxPunkty) {
                maxPunkty = klient.getPunkty();
                najlepszy = klient;
            }
        }
        System.out.println("Najwięcej punktów ma: " + najlepszy);
        return najlepszy;
    }





}
