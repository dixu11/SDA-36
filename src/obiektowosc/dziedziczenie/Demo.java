package obiektowosc.dziedziczenie;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        //Kot
        Kot kot = new Kot();
        //Pies
        Pies pies = new Pies();

        kot.polujNaMyszy();
        kot.biegaj();
        pies.aportuj();

        //Zwierze
        System.out.println("Wszystkie zwierzeta:");
        List<Zwierze> zwierzeta = new ArrayList<>();
        zwierzeta.add(kot);
        zwierzeta.add(pies);
        for (Zwierze zwierze : zwierzeta) {
            zwierze.biegaj();
            zwierze.wydajDzwiek();
        }


    }
}
