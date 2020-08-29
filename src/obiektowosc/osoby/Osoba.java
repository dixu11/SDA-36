package obiektowosc.osoby;

public class Osoba {

    String imie;
    int wiek = 18;
    String rola;

    public Osoba(String startoweImie){
      imie = startoweImie;
    }

    public void wyswietl(){
        System.out.println("Dane osoby: imie: " + imie +
                " wiek: " + wiek +
                " rola: " +rola);
    }

}
